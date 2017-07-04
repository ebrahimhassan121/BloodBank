<%-- 
    Document   : profile
    Created on : Apr 29, 2017, 2:47:31 PM
    Author     : ahmed
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
     try{
        
        
%>
<%@include file="header.jsp"%>


        <div class="row">
            <nav class="green" id="breadcrumb">
                <div class="nav-wrapper">
                    <div class="col s12">
                        <a href="profile.jsp" class="breadcrumb">حسابي</a>

                    </div>
                </div>
            </nav>
        </div>

        <div class="row ">

            <div class=" col l6 m12 s12 offset-l2 left ">
                <div class="col  left s12  card white " style="">

                    <h5 class="right black-text" >مرحبا <span class="green-text" style="padding-right: 10px"><%=name%></span> </h5>
                    <header class="left black-text" style="margin-top:20px" >فصيلةالدم :<span class="green-text" style="padding-right: 10px"><%=bloodtype%></span> </header>
                    
                </div>
                
                <div class="col s12 " style="min-height: 80vh;">
                    
                    <!-- 
                    
                    <div class="row  " style="">
                       <h6 class="col l2  m2 right"> اسم المتبرع </h6>
                       <h6 class="col right green-text"> ابراهيم حسن سلطان</h6>
                        
                    </div>
                    <div class="row  " style="">
                        <h6 class="col l2  m2 right"> العمر  </h6>
                        <h6 class="col right green-text">22<span>سنة</span></h6>
                        
                    </div>
                     <div class="row  " style="">
                        <h6 class="col l2  m2 right"> فصيلة الدم </h6>
                       <h6 class="col right green-text"> غير معروف</h6>
                        
                    </div>
                    <div class="row  " style="">
                        <h6 class="col l2  m2 right">  الحالة الصحية </h6>
                       <h6 class="col right green-text"> غير معروف</h6>
                        
                    </div>
                    <div class="row  " style="">
                        <h6 class="col l2  m2 right">  العنوان  </h6>
                       <h6 class="col right green-text">الغربية-طنطا-الحكمة </h6>
                        
                    </div>
                    <div class="row  " style="">
                        <h6 class="col l2  m2  right">  رقم المحمول  </h6>
                       <h6 class="col right green-text"> 01275266439</h6>
                        
                    </div>
                    <div class="row  " style="">
                       <h6 class="col l2  m2 right">  البريد   </h6>
                       <h6 class="col right green-text">ebrahimhassan121@gmail.com</h6>
                        
                    </div>

                    -->
                    


                    <div class="row white" style="padding:20px;">
                        <div class="col s12 m6 ">
                            <div class="card-panel " style="background: #f8f8f8 !important">
                                <a href="appointment.jsp" class="center "><img src="../imgs/100925-200.png"  class="left" style="width: 100%"/>
                                <h5 class="green-text"> حجز ميعاد للتبرع</h5></a>
                            </div>
                        </div>
                        <div class="col s12 m6">
                            <div class="card-panel " style="background: #f8f8f8 !important">
                                <a href="history.jsp" class="center"> <img src="../imgs/history.png"  style="width: 100%" class="left "/>
                                <h5 class="green-text">
                                        سجل التبرع</h5>
                               </a>
                            </div>
                        </div>
                        <div class="col s12 m6">
                            <div class="card-panel" style="background: #f8f8f8 !important">
                                <a href="reservedAppointment.jsp" class="center"> <img src="../imgs/upcomming.png"  class="left" style="width: 100%"/>
                                <h5 class="green-text"> ميعاد محجوز</h5></a>
                            </div>
                        </div>
                        <div class="col s12 m6">
                            <div class="card-panel " style="background: #f8f8f8 !important">
                                <a href="setting.jsp" class="center"> <img src="../imgs/setting.png"  class="left" style="width: 100%"/>
                                <h5 class="green-text"> الاعدادت </h5></a>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>






        <%@include file="../footer.jsp" %>







        <!--Import jQuery before materialize.js-->
        <script type="text/javascript" src="../js/jquery-2.1.1.min.js"></script>
        <script type="text/javascript" src="../js/materialize.js"></script>
        <script type="text/javascript" src="../js/script.js"></script>
        <script>

        $(document).ready(function (){
            "use strict";
            console.clear();
        });

        </script>
        
    </body>

</html>
<%
  
        }catch(Exception e){
        response.sendRedirect("../login.jsp");
            
        }    
%>