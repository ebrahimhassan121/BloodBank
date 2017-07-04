<%-- 
    Document   : hospitals
    Created on : Apr 20, 2017, 2:30:05 PM
    Author     : ahmed
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="query.Model_hospital"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% response.setContentType("text/html;charset=UTF-8");
   request.setCharacterEncoding("UTF-8");

%>

<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<!DOCTYPE html>
<html>
    <head>

        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection" />
        <!--Import Google Icon Font-->
        <link href="fonts/font.css" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Cairo" rel="stylesheet">
        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link href="https://fonts.googleapis.com/css?family=Cairo" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Mada" rel="stylesheet">
        <link href="https://cdn.rawgit.com/chingyawhao/materialize-clockpicker/master/dist/css/materialize.clockpicker.css" type="text/css" rel="stylesheet">



        <link type="text/css" href="css/style.css" rel="stylesheet">

    </head>

    <body style="direction: rtl;background: #f4f4f4;" class="" >


        <%@include  file="header.jsp" %>

        <div class="row">
            <nav class="green" id="breadcrumb">
                <div class="nav-wrapper">
                    <div class="col s12">
                        <a href="index.jsp" class="breadcrumb">الرئيسية</a>
                        <a href="hospitals.jsp" class="breadcrumb"> المستشفيات</a>
                    </div>
                </div>
            </nav>
        </div>
        <div class="row ">
            <div class=" col l6 m12 s12 offset-l2 center ">
                <div class="row " style="min-height: 80vh;">
                    <div class="col  left s12  card white " style="">

                        <h5 class="right black-text" >دليل المستشفيات</h5>
                    </div>
                    <div class="row ">
                        <form action="Hospital" method="Post">


                            <select  name ="state"class="col  l4 m6 s12 right browser-default" style="">
                                <option value="" disabled selected>اختيار المحافظة</option>

                                <%
                                    Model_hospital MH = new Model_hospital();
                                    ArrayList<String> arr = MH.selectHospittalStates();
                                    for (int i = 0; i < arr.size(); i++) {

                                %>
                                <option value="<%=arr.get(i)%>"><%=arr.get(i)%></option> 

                                <% } %>


                            </select>


                            <button type="submit" class="btn  left col l2 m3 s4 green white-text" style="" >تطبيق</button>

                        </form>
                    </div>

                    <div class="col  left s12  card white " style="padding: 20px">
                        <%

                            ServletContext context = getServletContext();
                            ResultSet rs = null;
                            String state = (String) context.getAttribute("state");
                            Model_hospital model_hospital = new Model_hospital();
                            if (request.getMethod().toLowerCase().equals("get")) {
                                //System.out.println(state);
                                if (state == null) {
                                    rs = model_hospital.selectHospittalAll();
                                } else if (state == "all") {
                                    rs = model_hospital.selectHospittalAll();
                                } else {
                                    rs = model_hospital.selectHospittal(state);
                                }
                            } else if (request.getMethod().toLowerCase().equals("post")) {
                                String government = request.getParameter("government");
                                String type = request.getParameter("type").toUpperCase();
                                switch (type) {
                                    
                                    case "A": {
                                        
                                        rs = model_hospital.selectHospitalsByStateAndBloodType( government, "apositive");
                                    }break;
                                    case "B": {
                                        rs = model_hospital.selectHospitalsByStateAndBloodType(government, "bpositive");
                                    }break;
                                    case "O": {
                                        rs = model_hospital.selectHospitalsByStateAndBloodType(government, "opositive");
                                    }break;
                                    case "NA": {
                                        rs = model_hospital.selectHospitalsByStateAndBloodType(government, "anegative");
                                    }break;
                                    case "NB": {
                                        rs = model_hospital.selectHospitalsByStateAndBloodType(government, "bnegative");
                                    }break;
                                    case "NO": {
                                        rs = model_hospital.selectHospitalsByStateAndBloodType(government, "onegative");
                                    }break;
                                    case "AB": {
                                        rs = model_hospital.selectHospitalsByStateAndBloodType(government, "abpositive");
                                    }break;
                                    case "NAB": {
                                        rs = model_hospital.selectHospitalsByStateAndBloodType(government, "abnegative");
                                    }break;
                                }
                            }
                            context.setAttribute("state", null);
                        %>
                        <table class="white gridview highlight" cellpadding="0" cellspacing="0">
                            <thead style="border: 1px #333 solid">
                                <tr >
                                    <th><h5 class="center">   المستشفي</h5></th>
                                    <th><h5 class="center"> العنوان</h5></th>
                                    <th><h5 class="center"> رقم التليفون</h5></th>
                                </tr>
                            </thead>
                            <tbody class="" style="">
                                <%
                                    while (rs.next()) {
                                        int id = rs.getInt(1);
                                        ArrayList<String> phone = model_hospital.select_phone_hospittal(id);
                                %>

                                <tr >
                                    <td><h6 class="center"> <%= rs.getString(2)%></h6></td>
                                    <td><h6 class="center"> <%= rs.getString(6)%>-<%= rs.getString(5)%> </h6></td>
                                    <td>
                                        <%
                                            for (int i = 0; i < phone.size(); i++) {%>

                                        <h6 class="center">
                                            <span class="" style="display: block;border-bottom: 1px solid #757575;"><a href="tel:02-26844195"><%=phone.get(i)%></a></span>
                                        </h6>

                                        <%  }  %>

                                    </td>
                                </tr>  



                                <% }
                                    model_hospital.closeResultSet(rs);
                                    model_hospital.closeConnection();

                                %>



                            </tbody>
                        </table>


                    </div>



                </div>
            </div>
        </div>






        <%@include  file="footer.jsp" %>







        <!--Import jQuery before materialize.js-->
        <script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
        <script type="text/javascript" src="js/materialize.js"></script>
        <script type="text/javascript" src="js/script.js"></script>
        <script type="text/javascript" src="https://cdn.rawgit.com/chingyawhao/materialize-clockpicker/master/dist/js/materialize.clockpicker.js"></script>



</html>
