<%-- 
    Document   : login
    Created on : Mar 12, 2017, 9:05:11 PM
    Author     : ahmed
--%>

<%
    Object username = session.getAttribute("username");
    Object password = session.getAttribute("password");
    if (username == null && password == null) {%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>
        <!--Import Google Icon Font-->
        <link href="fonts/font.css" rel="stylesheet">
        <!--Let browser know website is optimized for mobile-->
        <meta charset="UTF-8" name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link href="https://fonts.googleapis.com/css?family=Cairo" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Mada" rel="stylesheet">
        <link type="text/css" href="css/style.css" rel="stylesheet">
    </head>





    <body class="" style="direction: rtl;background: #f4f4f4">

        <%@include file="header.jsp" %>

        <div class="row lrr" id="login" style="" >
            <div class=""  style="max-width: 550px;padding: 10px 0 0;margin: auto;">
                <div class=" card-panel white" style="
                     margin-top: 0px;
                     padding-top: 0px;
                     padding-right: 0px;
                     padding-left: 0px;
                     padding-bottom: 0px;
                     " >
                    <div class=" ">
                        <h3 class="center white-text green" style="padding: 40px;margin-top: 0">
                            تسجيل الدخول
                        </h3>

                        <div class="row"> 

                            <form    action="Login" method="Post" class="col s12" accept-charset="UTF-8"  autocomplete="on">
                                <div class="row">
                                    <% 
                                    if ( request.getParameter("error")!=null ) { 
                                    %>
                                    <p class="col s12 red-text right-align" style="margin-top:0;border: 1px solid red;direction: rtl">
                                    البريد الإلكتروني أو كلمة المرور  الذي ادخلتها لا يطابق أي حساب.
                                    </p>
                                    <% } %>
                                    <div class="input-field col s12">
                                        <input name="email" id="email" type="text" class="validate">
                                        <label for="email" data-error="خطأ" data-success="">اسم المستخدم / البريد</label>
                                    </div>

                                </div>
                                <div class="row">
                                    <div class="input-field col s12">
                                        <input name="password"id="password" type="password" class="validate">
                                        <label for="password" style="">كلمة المرور</label>
                                    </div>
                                </div>

                                <div class="row">
                                    <p >
                                        <input value="d" class="with-gap" name="type" type="radio" id="test3" checked />
                                        <label for="test3" class="right">متبرع </label>
                                    </p>
                                </div>
                                <div class="row">
                                    <p>
                                        <input value="h"  class="with-gap" name="type" type="radio" id="test2"  />
                                        <label for="test2" class="right">مستشفي</label>
                                    </p>
                                </div>


                                <div class=" row center-align">
                                    <input class="btn-large white-text green center" style="width: 70%;" type="submit" value="الدخول" />
                                </div>
                                <div class=" row center-align">
                                    <a class="white grey-text waves-effect center" style="" href="remember.jsp" >نسيت كلمة المرور ؟</a>
                                </div>
                                <div class=" row center-align">
                                    <a class="white grey-text waves-effect  center" style="" href="register.jsp"   >لا تمتلك حساب ؟</a>
                                </div>

                            </form>
                        </div>
                    </div>               
                </div>
            </div>


        </div>






        <!--Import jQuery before materialize.js-->
        <script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
        <script type="text/javascript" src="js/materialize.min.js"></script>
        <script type="text/javascript" src="js/script.js"></script>


    </body>
</html>
<%
    } else {
        String type = (String) session.getAttribute("type");
        if (type.equals("d")) {
            session.setAttribute("username", session.getAttribute("username"));
            session.setAttribute("password", session.getAttribute("password"));
            session.setAttribute("ssn", session.getAttribute("ssn"));
            session.setAttribute("type", session.getAttribute("type"));
            response.sendRedirect("user/profile.jsp");

        } else {
            session.setAttribute("username", session.getAttribute("username"));
            session.setAttribute("password", session.getAttribute("password"));
            session.setAttribute("type", session.getAttribute("type"));
            response.sendRedirect("hospital/profile.jsp");

        }

    }%>