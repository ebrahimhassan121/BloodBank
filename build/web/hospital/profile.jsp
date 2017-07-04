<%-- 
    Document   : profile
    Created on : Apr 19, 2017, 4:37:45 PM
    Author     : ahmed
--%>

<%@page import="query.Model_hospital"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->

<%
    Model_hospital model_hospital = new Model_hospital();
    String username = (String) session.getAttribute("username");
    String password = (String) session.getAttribute("password");
    String email=model_hospital.select_email_hospital(username, password);
    
 

%>
 

<!DOCTYPE html>
<html>
    <head>

        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="../css/materialize.min.css"  media="screen,projection" />
        <!--Import Google Icon Font-->
        <link href="../fonts/font.css" rel="stylesheet">
        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link href="../css/stylesheet.css" rel="stylesheet">
        <link href="../css/style.css" rel="stylesheet">
        <link type="text/css" href="style.css" rel="stylesheet">
    </head>

    <body style="direction: rtl;background: #f4f4f4;" class="" >


        <ul id="slide-out" class="side-nav fixed " style=" padding-right: 0;padding-left: 0;padding-bottom: 60px;height: 100%;" >

            <li><div class="userView">
                    <div class="background">
                        <img src="imgs/user-bg.jpg">
                    </div>
                    <a href="#!user" class=""><img class="circle white " src="imgs/build7-512.png"></a>
                    <a href="profile.jsp"><span class="white-text name"><h6>مستشفي <%= username%></h6></span></a>
                    <a href="https:// <%= email %>"target="blank"><span class="email " style="color:  #333333;"><%= email %></span></a>
                </div></li>


            <li class="" style="">
                <a href="index.jsp" style="">
                    <i class="material-icons right" style="margin-left: 10px">home</i>
                    الرئيسية

                </a>
            </li>

            <li class="" style="">
                <a href="hospital/adddonor.jsp" style="">
                    <i class="material-icons right" style="margin-left: 10px">person_add</i>
                    اضافة متبرع
                </a>
            </li>
            <li class="" style="">
                <a href="hospital/blood.jsp" style="">
                    <i class="material-icons right" style="margin-left: 10px">data_usage</i>
                    عينات الدم
                </a>
            </li>
            <li class="" style="">
                <a href="hospital/donatedate.jsp" style="">
                    <i class="material-icons right" style="margin-left: 10px">date_range</i>
                    مواعيد التبرع
                </a>
            </li>
            <li class="" style="">
                <a href="hospital/timeclose.jsp" style="">
                    <i class="material-icons right" style="margin-left: 10px">date_range</i>
                    مواعيد محجوزة
                </a>
            </li>


            <li class="" style="">
                <a href="hospital/history.jsp" style="">
                    <i class="material-icons right" style="margin-left: 10px">history</i>
                    سجل المتبرعين

                </a>
            </li>
            <li class="" style="">
                <a href="hospital/setting.jsp" style="">
                    <i class="material-icons right" style="margin-left: 10px">settings</i>
                    الاعدادت

                </a>
            </li>
            <li class="" style="">
                <a href="hospitals.jsp" style="">
                    <i class="material-icons right" style="margin-left: 10px">local_hospital</i>
                    المستشفيات

                </a>
            </li>




            <li class="white-text" style="">
                <a href="aboutUs.jsp" style="">
                    <i class="material-icons right" style="margin-left: 10px">info</i>
                    من نحن

                </a>
            </li>

            <li class="" style="">
                <a href="questions.html" style="">
                    <i class="material-icons right" style="margin-left: 10px">question_answer</i>
                    نصائح و اسئلة

                </a>
            </li>
            <li class="" style="border-bottom: 1px solid white">
                <a href="events.html" style="">
                    <i class="material-icons right" style="margin-left: 10px">events</i>
                    الاحداث

                </a>
            </li>


            <li class="" style="border-bottom: 1px solid white">
                <a href="Logout" style="">
                    <i class="material-icons right" style="margin-left: 10px">power_settings_new</i>
                    تسجيل الخروج

                </a>
            </li>

        </ul>


        <div class="navbar-fixed ">
            <nav class="white">
                <div class="nav-wrapper  ">

                    <a href="Logout" class="brand-logo green-text right" style="margin-right: 1%;"><img class="responsive-img" src="imgs/logo.png" width="50" alt="logo"/> بنك الدم</a>
                    <a href="#" data-activates="slide-out" class="button-collapse show-on-medium-and-down"><i class="material-icons green-text">menu</i></a>
                    <ul class=" hide-on-small-and-down">
                        <li class="" style="">
                            <a href="Logout" style="">

                                تسجيل الخروج
                            </a>
                        </li>
                    </ul>

                </div>
            </nav>
        </div>

        <div class="row">
            <nav class="green" id="breadcrumb">
                <div class="nav-wrapper">
                    <div class="col s12">
                        <a href="profile.html" class="breadcrumb">حسابي</a>

                    </div>
                </div>
            </nav>
        </div>

        <div class="row ">

            <div class=" col l6 m12 s12 offset-l2 left ">
                <div class="col  left s12  card white " style="">

                    <h5 class="right black-text" >مرحبا مستشفي <span class="green-text" style="padding-right: 10px"><%= username%></span> </h5>
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
                        <div class="col s12 m6">
                            <div class="card-panel " style="background: #f8f8f8 !important">
                                <a href="hospital/adddonor.jsp" class="center"><img src="imgs/add-property-xxl.png"  class="left" style="width: 100%"/>
                                    <h5 class="green-text">اضافة متبرع  </h5></a>
                            </div>
                        </div>
                        <div class="col s12 m6">
                            <div class="card-panel" style="background: #f8f8f8 !important">
                                <a href="hospital/blood.jsp" class="center"><img src="imgs/100925-200.png"  class="left" style="width: 100%"/>
                                    <h5 class="green-text">عينات الدم </h5></a>
                            </div>
                        </div>
                        <div class="col s12 m6">
                            <div class="card-panel" style="background: #f8f8f8 !important">
                                <a href="hospital/donatedate.jsp" class="center "><img src="imgs/upcomming.png"  class="left" style="width: 100%"/>
                                    <h5 class="green-text">ادارة اوقات التبرع</h5></a>
                            </div>
                        </div>
                        <div class="col s12 m6">
                            <div class="card-panel" style="background: #f8f8f8 !important">
                                <a href="hospital/history.jsp " class="center"> <img src="imgs/history.png"  style="width: 100%" class="left"/>
                                    <h5 class="green-text">
                                        سجل المتبرعين</h5>
                                </a>
                            </div>
                        </div>
                        <div class="col s12 m6">
                            <div class="card-panel" style="background: #f8f8f8 !important">
                                <a href="hospital/timeclose.jsp" class="center"> <img src="imgs/upcomming.png"  class="left" style="width: 100%"/>
                                    <h5 class="green-text"> مواعيد محجوزة</h5></a>
                            </div>
                        </div>
                        <div class="col s12 m6">
                            <div class="card-panel " style="background: #f8f8f8 !important">
                                <a href="setting.jsp" class="center"> <img src="imgs/setting.png"  class="left" style="width: 100%"/>
                                    <h5 class="green-text"> الاعدادت </h5></a>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>








        <%@include  file="../footer.jsp" %>


        <!--Import jQuery before materialize.js-->
        <script type="text/javascript" src="../js/jquery-2.1.1.min.js"></script>
        <script type="text/javascript" src="../js/materialize.js"></script>
        <script type="text/javascript" src="../js/script.js"></script>
        <script>

            $(document).ready(function () {
                "use strict";
                console.clear();

            });

        </script>
    </body>

</html>
