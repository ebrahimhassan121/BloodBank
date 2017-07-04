<%-- 
    Document   : header
    Created on : Jul 2, 2017, 10:46:19 PM
    Author     : EHS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.List"%>
<%@page import="entities.Users"%>
<%@page import="query.Model_users"%>
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
        <link type="text/css" rel="stylesheet" href="../css/materialize.min.css"  media="screen,projection" />
        <!--Import Google Icon Font-->
        <link href="../fonts/font.css" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Cairo" rel="stylesheet">
        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link href="https://fonts.googleapis.com/css?family=Cairo" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Mada" rel="stylesheet">


        <link type="text/css" href="../css/style.css" rel="stylesheet">
        <link type="text/css" href="stylee.css" rel="stylesheet">
        <title>بنك الدم</title>
    </head>
    <%
         Model_users model_users=new Model_users();
        Object email =   session.getAttribute("email");
        Object password =   session.getAttribute("password");
        String name,type,phone;
        Users user =model_users.select_user(email.toString(), password.toString()).get(0) ;
        
        name=user.getName();
        int ssn=user.getSsn();
        phone=user.getPhonrnumber();
        System.out.println("profile");
        String bloodtype=model_users.selectUserBloodType(ssn );
        if(bloodtype==null){
            bloodtype="غير معروف";
        }
       
    %>
     <body style="direction: rtl;background: #f4f4f4;" class="" >


        <ul id="slide-out" class="side-nav fixed " style=" padding-right: 0;padding-left: 0;padding-bottom: 60px;height: 100%; ">

            <li><div class="userView">
                    <div class="background">
                        <img src="../imgs/user-bg.jpg">
                    </div>
                    <a href="#!user" class=""><img class="circle white " src="../imgs/User-Red-icon.png"></a>
                    <a href="profile.jsp"><span class="white-text name"><h6><%=name%></h6></span></a>
                    <a href=""https://"<%=email%>" target="blank"><span class="email " style="color:  #333333;"><%=email%></span></a>
                </div></li>


            <li class="" style="">
                <a href="../index.jsp" style="">
                    <i class="material-icons right" style="margin-left: 10px">home</i>
                    الرئيسية

                </a>
            </li>
            <li class="" style="">
                <a href="reservedAppointment.jsp" style="">
                    <i class="material-icons right" style="margin-left: 10px">receipt</i>
                    ميعاد محجوز

                </a>
            </li>

            <li class="" style="">
                <a href="appointment.jsp" style="">
                    <i class="material-icons right" style="margin-left: 10px">receipt</i>
                    حجز ميعاد للتبرع

                </a>
            </li>
            <li class="" style="">
                <a href="history.jsp" style="">
                    <i class="material-icons right" style="margin-left: 10px">history</i>
                    سجل التبرع

                </a>
            </li>
            <li class="" style="">
                <a href="../hospitals.jsp" style="">
                    <i class="material-icons right" style="margin-left: 10px">local_hospital</i>
                    المستشفيات

                </a>
            </li>
            <li class="" style="">
                <a href="setting.jsp" style="">
                    <i class="material-icons right" style="margin-left: 10px">settings</i>
                    الاعدادت

                </a>
            </li>



            <li class="white-text" style="">
                <a href="../aboutUs.jsp" style="">
                    <i class="material-icons right" style="margin-left: 10px">info</i>
                    من نحن

                </a>
            </li>

            <li class="" style="">
                <a href="../questions.jsp" style="">
                    <i class="material-icons right" style="margin-left: 10px">question_answer</i>
                    نصائح و اسئلة

                </a>
            </li>


            <li class="" style="border-bottom: 1px solid white">
                <a href="../Logout" style="">
                    <i class="material-icons right" style="margin-left: 10px">power_settings_new</i>
                    تسجيل الخروج

                </a>
            </li>

        </ul>





        <div class="navbar-fixed ">
            <nav class="white">
                <div class="nav-wrapper  ">

                    <a href="../index.jsp" class="brand-logo green-text right" style="margin-right: 1%;"><img class="responsive-img" src="../logo.png" width="50" alt="logo"/> بنك الدم</a>
                    <a href="#" data-activates="slide-out" class="button-collapse show-on-medium-and-down"><i class="material-icons green-text">menu</i></a>
                    <ul class=" hide-on-small-and-down">
                        <li class="" style="">
                            <a href="../Logout" style="">

                                تسجيل الخروج
                            </a>
                        </li>
                    </ul>

                </div>
            </nav>
        </div>
