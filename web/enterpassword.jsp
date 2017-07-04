<%-- 
    Document   : login
    Created on : Mar 12, 2017, 9:05:11 PM
    Author     : ahmed
--%>

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
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link href="https://fonts.googleapis.com/css?family=Cairo" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Mada" rel="stylesheet">
        <link type="text/css" href="css/style.css" rel="stylesheet">
    </head>

    <body class="" style="direction: rtl;background: #f4f4f4">

        <%@include file="header.jsp" %>

        <div class="row lrr" id="login" style="" >
            <div class=""  style="max-width: 550px;padding: 10px 0 0;margin: auto;">
                <div class=" card-panel white" style="
                     margin-top:100px;
                     padding-top: 0px;
                     padding-right: 0px;
                     padding-left: 0px;
                     padding-bottom: 0px;
                     " >
                    <div class=" ">
                        <h3 class="center white-text green" style="padding: 40px;margin-top: 0">
                            إعادة تعيين كلمة السر
                        </h3>
                        <div class="row">
                            <form   method="Post"  action="RememberPassword ">


                                <%
                                    String email = (String) request.getAttribute("email_rc");
                                    String username = (String) request.getAttribute("user_name_rc");
                                    String password = (String) request.getAttribute("newpassword");

                                %>
                                <div class="row">

                                    الاسم:&zwnj;  <font style="color: #00C853">       <%= username%>  </font>
                                </div>

                                <div class="row">


                                    الايميل:&zwnj;  <font style="color: #00C853">      <%= email%>     </font>

                                </div>

                                <%
                                    String massege = (String) request.getAttribute("Message");
                                    %>
                                <h5  style="color: #00C853"><%=massege%></h5>
                                <br><br>
                                <div class="row" style="margin-bottom:0">
                                    <div class="input-field col s12" style="margin-top: 0">
                                        <input value="<%=password%>" name ="code" id="email" type="text" class="validate" required="true">
                                        <label for="email" data-error="خطأ" data-success="">الكود </label>
                                    </div>   
                                </div>
 
                             <input type="hidden" name="email" value="<%=email%>">
                                <input type="hidden" name="username" value="<%=username%>">
                                <input type="hidden" name="newpassword" value="<%=password%>">

                              
                                <div class="modal-footer">
                                       <input  type="submit" class="left  modal-trigger modal-close waves-effect waves-light btn center green " style="margin: 0 0.75rem;" value="  الدخول"/>

                                    <input  type="submit" class="left  modal-trigger modal-close waves-effect waves-light btn center green " style="margin: 0 0.75rem;" value=" ارسال "/>
                                </div>
                              


                               





                                <br> 
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
