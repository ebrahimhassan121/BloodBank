<%-- 
    Document   : aboutUs
    Created on : Apr 21, 2017, 12:26:10 AM
    Author     : ahmed
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
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

        <%@include  file="header.jsp" %>
        <nav class="green">
            <div class="nav-wrapper">
                <div class="col s12">
                    <a href="index.jsp" class="breadcrumb">الرئيسية</a>
                    <a href="aboutUs.jsp" class="breadcrumb">من نحن </a>
                </div>
            </div>
        </nav>

        <br><br>

        <div class="row container white  " style="min-height: 56vh;padding: 20px">
            <h4 class="">من نحن  ؟</h4>

            <ul class="browser-default blue-text">
                <li>نحن مجموعة من المطورين المصرين .</li>
                <li>
                    ارادنا مساعدة المتبرعين من خلال
                    ادارة وتنظيم وقت التبرع للمستشفيات
                    و المتبرعين </li>
                <li>و مساعدة من هم بحاجة ماسة للدم بمختلف فصائله</li>
                <li>توفير كافة الفصائل المختلفة من الدم</li>
                <li>ارشاد المتبرعين للاحتياطات الازمة قبل و بعد عملية التبرع</li>
            </ul>
            <br>
            <form  class="col l8 s12 m10 right" action="EmailSendingServlet" method="Post">
                <div class="">
                    <h4 class="green-text" >
                        تواصل معنا
                    </h4>
                    
                        <% 
                        String massege=(String)request.getAttribute("Message");
                        if(massege!=null){%>
                        <h5  style="color: #FF1744"><%=massege %></h5>
                       <% } %>
                             
                    
                    <br>
                    <div class="row">
                        <div class="input-field">

                            <input  name ="email" value="" id="email" type="email" class="validate" required>
                            <label for="email" data-error="خطأ" data-success=""> البريد الاليكتروني</label>

                        </div>

                    </div>
                      

                    <div class="row">
                        <div class="" >

                            <label for="message">الرسالة</label>
                            <textarea name="massage" rows="8" name="message" id="message" placeholder="الرسالة"  required style="height: unset;max-width:100%"></textarea>
                        </div>
                        


                        <div class="  left    ">
                            <button class="btn btn-large green " type="submit"><i class="material-icons" style="transform: rotate(180deg);">send</i></button>
                        </div>
                        <div class="right green-text">
                            <h4  class="green-text ">الهاتف</h4>
                            <div  style="" class="">
                                الأحد - الخميس : 09:00 - 17:00


                            </div>
                            <div class="" dir="ltr">012 752 66 439</div>
                        </div>

                    </div>



                </div>     
            </form>

            <div class="col s12 m12 l12">





            </div>
        </div>




        <%@include  file="footer.jsp" %>

        <!--Import jQuery before materialize.js-->
        <script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
        <script type="text/javascript" src="js/materialize.min.js"></script>
        <script type="text/javascript" src="js/script.js"></script>


    </body>
</html>
