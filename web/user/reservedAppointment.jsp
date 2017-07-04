<%-- 
    Document   : reservedAppointment
    Created on : Apr 29, 2017, 2:51:50 PM
    Author     : ahmed
--%>

<%@page import="query.Model_donors"%>
<%@page import="query.Model_hospital"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="query.Model_Timeclose"%>
<%@page import="java.util.List"%>
<%@page import="entities.Users"%>
<%@page import="java.util.ArrayList"%>
<%@page import="query.Model_users"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="header.jsp"%>
<%    try {
        Model_hospital model_hospital = new Model_hospital();
        Model_Timeclose model_Timeclose = new Model_Timeclose();
        Model_donors model_donors = new Model_donors();
        ResultSet rs = model_Timeclose.select_timecloseTDI(ssn,0);


%>

<body style="direction: rtl;background: #f4f4f4;" class="" >


   
  
    <div class="row">
        <nav class="green" id="breadcrumb">
            <div class="nav-wrapper">
                <div class="col s12">
                    <a href="profile.jsp" class="breadcrumb">حسابي</a>
                    <a href="reservedAppointment.jsp" class="breadcrumb">ميعاد محجوز </a>
                </div>
            </div>
        </nav>
    </div>
    <div class="row ">
        <div class=" col l6 m12 s12 offset-l2 left ">
            <div class="row " style="min-height: 80vh;">
                <div class="col  left s12  card white " style="">

                    <h5 class="right black-text" > ميعاد محجوز</h5>
                </div>


                <div class="col  left s12  card white " style="padding: 20px">

                    <table class="white responsive-table highlight" cellpadding="0" cellspacing="0">
                        <thead style="border: 1px #333 solid">
                            <tr >
                                <th><h5 class="center">  الكود</h5></th>
                                <th><h5 class="center">  تاريخ</h5></th>
                                <th><h5 class="center"> الوقت</h5></th>
                                <th><h5 class="center"> مستشفي</h5></th>


                            </tr>
                        </thead>
                        <tbody class="" style="">
                            <%

                                    while (rs.next()) {%>
                            <tr >
                                <td><h6 class="center"><%=ssn%></h6></td>
                                <td><h6 class="center"><%= rs.getString(2)%></h6></td>
                                <td><h6 class="center"><%= rs.getString(1)%></h6></td>
                                <td><h6 class="center"><%= model_hospital.selectHospittalName(rs.getInt(3))%></h6></td>
                            </tr>
                            <%}
                                model_Timeclose.closeResultSet(rs);
                                model_Timeclose.closeConnections();

                            %>



                        </tbody>
                    </table>

                </div>



            </div>
        </div>
    </div>







    <%@include file="footer.jsp" %> 

    <!--Import jQuery before materialize.js-->
    <script type="text/javascript" src="../js/jquery-2.1.1.min.js"></script>
    <script type="text/javascript" src="../js/materialize.js"></script>
    <script type="text/javascript" src="../js/script.js"></script>


</body>

</html>
<%    } catch (Exception e) {
        response.sendRedirect("../login.jsp");

    }
%>