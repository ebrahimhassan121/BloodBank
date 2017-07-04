<%-- 
    Document   : setting
    Created on : Apr 20, 2017, 2:34:40 PM
    Author     : ahmed
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<%@page import="query.Model_hospital"%>

<%
    Model_hospital model_hospital = new Model_hospital();
    String username = (String) session.getAttribute("username");
    String password = (String) session.getAttribute("password");
    String email = model_hospital.select_email_hospital(username, password);
    int id = model_hospital.select_id_hospital(username, password);
    ArrayList<String> phones = model_hospital.select_phone_hospittal(id);
    String state = model_hospital.select_state_hospital(username, password);
    String street = model_hospital.select_street_hospital(username, password).toString();
    String s=street.toString();
%>
<!DOCTYPE html>
<html>

    <head>

        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="../css/materialize.min.css" media="screen,projection" />
        <!--Import Google Icon Font-->
        <link href="../fonts/font.css" rel="stylesheet">
        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link href="../css/stylesheet.css" rel="stylesheet">
        <link href="../css/style.css" rel="stylesheet">
        <link type="text/css" href="style.css" rel="stylesheet">
    </head>

    <body style="direction: rtl;background: #f4f4f4;" class="">


        <ul id="slide-out" class="side-nav fixed " style=" padding-right: 0;padding-left: 0;padding-bottom: 60px;height: 100%;" >

            <li><div class="userView">
                    <div class="background">
                        <img src="../imgs/user-bg.jpg">
                    </div>
                    <a href="#!user" class=""><img class="circle white " src="../imgs/build7-512.png"></a>
                    <a href="profile.jsp"><span class="white-text name"><h6>مستشفي   <%= username%></h6></span></a>
                    <a href="https:// <%= email%>"target="blank"><span class="email " style="color:  #333333;"><%= email%></span></a>
                </div></li>


            <li class="" style="">
                <a href="../index.jsp" style="">
                    <i class="material-icons right" style="margin-left: 10px">home</i>
                    الرئيسية

                </a>
            </li>

            <li class="" style="">
                <a href="adddonor.jsp" style="">
                    <i class="material-icons right" style="margin-left: 10px">person_add</i>
                    اضافة متبرع
                </a>
            </li>
            <li class="" style="">
                <a href="blood.jsp" style="">
                    <i class="material-icons right" style="margin-left: 10px">data_usage</i>
                    عينات الدم
                </a>
            </li>
            <li class="" style="">
                <a href="donatedate.jsp" style="">
                    <i class="material-icons right" style="margin-left: 10px">date_range</i>
                    مواعيد التبرع
                </a>
            </li>
            <li class="" style="">
                <a href="timeclose.jsp" style="">
                    <i class="material-icons right" style="margin-left: 10px">date_range</i>
                    مواعيد محجوزة
                </a>
            </li>


            <li class="" style="">
                <a href="history.jsp" style="">
                    <i class="material-icons right" style="margin-left: 10px">history</i>
                    سجل المتبرعين

                </a>
            </li>
            <li class="" style="">
                <a href="setting.jsp" style="">
                    <i class="material-icons right" style="margin-left: 10px">settings</i>
                    الاعدادت

                </a>
            </li>
            <li class="" style="">
                <a href="../hospitals.jsp" style="">
                    <i class="material-icons right" style="margin-left: 10px">local_hospital</i>
                    المستشفيات

                </a>
            </li>




            <li class="white-text" style="">
                <a href="../aboutUs.jsp" style="">
                    <i class="material-icons right" style="margin-left: 10px">info</i>
                    من نحن

                </a>
            </li>

            <li class="" style="">
                <a href="../questions.html" style="">
                    <i class="material-icons right" style="margin-left: 10px">question_answer</i>
                    نصائح و اسئلة

                </a>
            </li>
            <li class="" style="border-bottom: 1px solid white">
                <a href="../events.html" style="">
                    <i class="material-icons right" style="margin-left: 10px">events</i>
                    الاحداث

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

                    <a href="../Logout" class="brand-logo green-text right" style="margin-right: 1%;"><img class="responsive-img" src="../logo.png" width="50" alt="logo"/> بنك الدم</a>
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


        <div class="row">
            <nav class="green" id="breadcrumb">
                <div class="nav-wrapper">
                    <div class="col s12">
                        <a href="profile.jsp" class="breadcrumb">حسابي</a>
                        <a href="setting.jsp" class="breadcrumb"> اعدادات الحساب</a>

                    </div>
                </div>
            </nav>
        </div>

        <div class="row ">
            <div class=" col l6 m12 s12 offset-l2 left ">
                <div class="row " style="min-height: 60vh;">
                    <div class="col  left s12  card white " style="">

                        <h5 class="right black-text" >اعدادات الحساب </h5>
                    </div>


                    <div class="col  left s12  card white " style="padding: 20px">

                        <div class="row">
                            <div class=" col s12">
                                <div class="row">
                                    <label for="disname" class=" right col l3" style="color: black;font-size: 1.2rem;padding:0 0.75rem;">الاسم </label>
                                    <input 
                                        disabled="" value=<%= username%> id="disname"
                                        type="text" style="border: 1px solid #9e9e9e;height: 2rem" 
                                        class="right col l6 input-text-name"
                                        >
                                    <a class="modal-trigger waves-effect waves-light btn green left" style="margin: 0 0.75rem;height: 2rem" href="#modal1">تعديل</a>
                                    <!-- Modal Structure -->
                                    <div id="modal1" class="modal modal-fixed-footer" style="height: 130px">
                                        <form method="Post" action="../UpdateName" accept-charset="UTF-8">
                                            <br>
                                            <div class="modal-content" style="margin: 0;padding:unset">

                                                <div class="row">
                                                    <label for="name" class="col s2 right" style="color: black;font-size: 1.2rem;padding:0 0.75rem;">الاسم  </label>
                                                    <input 
                                                        value=<%= username%> id="name"
                                                        type="text" style="border: 1px solid #9e9e9e;height: 2rem" 
                                                        class="right col s9 input-text-name"
                                                        name="name"
                                                        >
                                                </div>


                                            </div>
                                            <div class="modal-footer">

                                                <input  type="submit" class="left  modal-trigger modal-close waves-effect waves-light btn center green " style="margin: 0 0.75rem;" value="حفظ"/>
                                                <a class="left modal-close  waves-effect waves-light btn center black " style="margin: 0 0.75rem;">الغاء</a>

                                            </div>
                                        </form>
                                    </div>


                                </div>
                            </div>



                            <div class=" col s12">
                                <div class="row">
                                    <label for="disemail" class=" right col l3" style="color: black;font-size: 1.2rem;padding:0 0.75rem;">البريد </label>
                                    <input 
                                        disabled="" value=<%= email%> id="disemail"
                                        type="email" style="border: 1px solid #9e9e9e;height: 2rem" 
                                        class="right col l6 input-text-name"

                                        >
                                    <a class="modal-trigger waves-effect waves-light btn green left" style="margin: 0 0.75rem;height: 2rem" href="#modalemail">تعديل</a>
                                    <!-- Modal Structure -->
                                    <div id="modalemail" class="modal modal-fixed-footer" style="height: 130px">
                                        <form method="Post" action="../UpdateEmail" accept-charset="UTF-8">
                                            <br>
                                            <div class="modal-content" style="margin: 0;padding:unset">

                                                <div class="row">
                                                    <label for="email" class="col s2 right" style="color: black;font-size: 1.2rem;padding:0 0.75rem;">البريد  </label>
                                                    <input 
                                                        value=<%= email%> id="email"
                                                        type="text" style="border: 1px solid #9e9e9e;height: 2rem" 
                                                        class="right col s9 input-text-name"
                                                        name="email"
                                                        >
                                                </div>


                                            </div>
                                            <div class="modal-footer">

                                                <input  type="submit" class="left  modal-trigger modal-close waves-effect waves-light btn center green " style="margin: 0 0.75rem;" value="حفظ"/>
                                                <a class="left modal-close  waves-effect waves-light btn center black " style="margin: 0 0.75rem;">الغاء</a>

                                            </div>
                                        </form>
                                    </div>


                                </div>
                            </div>




                            <div class=" col s12">
                                <div class="row">
                                    <label for="password" class=" right col l3" style="color: black;font-size: 1.2rem;padding:0 0.75rem;">كلمة المرور </label>
                                    <input 
                                        disabled="" value=<%= password%> id="password"
                                        type="text" style="border: 1px solid #9e9e9e;height: 2rem" 
                                        class="right col l6 input-text-name"
                                        >
                                    <a class="modal-trigger waves-effect waves-light btn green left" style="margin: 0 0.75rem;height: 2rem" href="#modalPassowrd">تعديل</a>
                                    <!-- Modal Structure -->
                                    <div id="modalPassowrd" class="modal modal-fixed-footer" style="height: 300px">
                                        <form method="Post" action="../UpdatePssword" accept-charset="UTF-8">
                                            <br>
                                            <div class="modal-content" style="margin: 0;padding:unset">

                                                <div class="row">
                                                    <label for="oldpassword" class="col s3 right" style="color: black;font-size: 1.2rem;padding:0 0.75rem;">الرمز القديم  </label>
                                                    <input 
                                                        value="" id="oldpassword"
                                                        type="password" style="border: 1px solid #9e9e9e;height: 2rem" 
                                                        class="right col s8 input-text-name"
                                                        name="opassword"
                                                        >

                                                </div>
                                                <div class="row">
                                                    <label for="newpassword" class="col s3 right" style="color: black;font-size: 1.2rem;padding:0 0.75rem;">الرمز الجديد  </label>
                                                    <input 
                                                        value="" id="newpassword"
                                                        type="password" style="border: 1px solid #9e9e9e;height: 2rem" 
                                                        class="right col s8 input-text-name"
                                                        name="npassword"
                                                        >

                                                </div>
                                                <div class="row">
                                                    <label for="newpassword1" class="col s3 right" style="color: black;font-size: 1.2rem;padding:0 0.75rem;">تاكيدالرمز الجديد  </label>
                                                    <input 
                                                        value="" id="newpassword1"
                                                        type="password" style="border: 1px solid #9e9e9e;height: 2rem" 
                                                        class="right col s8 input-text-name"
                                                        name="cpassword"
                                                        >

                                                </div>

                                            </div>
                                            <div class="modal-footer">

                                                <input  type="submit" class="left  modal-trigger modal-close waves-effect waves-light btn center green " style="margin: 0 0.75rem;" value="حفظ"/>
                                                <a class="left modal-close  waves-effect waves-light btn center black " style="margin: 0 0.75rem;">الغاء</a>

                                            </div>
                                        </form>
                                    </div>


                                </div>
                            </div>

                            <div class=" col s12">
                                <div class="row">
                                    <label for="disphone" class=" right col l3 " style="color: black;font-size: 1.2rem;padding:0 0.75rem;"> رقم التليفون </label>
                                    <div class="right col l4">
                                        <%
                                            for (int i = 0; i < phones.size(); i++) {%>
                                        <input 
                                            disabled="" value=<%=phones.get(i)%>  id="disphone"
                                            type="text" style="border: 1px solid #9e9e9e;height: 2rem" 
                                            class=" input-text-name"
                                            >   
                                        <%}%>


                                    </div>

                                    <a class="modal-trigger waves-effect left waves-light btn green" style="margin: 0 0.75rem;height: 2rem" href="#modalPhone"> تعديل</a>
                                    <a class="modal-trigger waves-effect left waves-light btn green" style="margin: 0 0.75rem;height: 2rem" href="#modalPhoneAdd">اضافة</a>

                                    <!-- Modal Structure -->
                                    <div id="modalPhone" class="modal modal-fixed-footer" style="">
                                        <form method="Post" action="../UpdatePhone" accept-charset="UTF-8">
                                            <br>
                                            <div class="modal-content" style="margin: 0;padding:unset">
                                                <%
                                                    for (int i = 0; i < phones.size(); i++) {%>
                                                <div class="row">
                                                    <label for="phone1" class="col s2 right" style="color: black;font-size: 1.2rem;padding:0 0.75rem;">الرقم  </label>
                                                    <input 
                                                        value=<%=phones.get(i)%> id="phone1"
                                                        type="text" style="border: 1px solid #9e9e9e;height: 2rem" 
                                                        class="right col s9 input-text-name"
                                                        name=<%= "nphone" + i%>
                                                        >
                                                    <input 
                                                        value=<%=phones.get(i)%>  
                                                        type="hidden" style="border: 1px solid #9e9e9e;height: 2rem" 
                                                        name=<%= "ophone" + i%>
                                                        >

                                                </div>  
                                                <%}%>

                                                <input 
                                                    value=<%=phones.size()%> 
                                                    type="hidden"  
                                                    name="size"
                                                    >
                                                <input 
                                                    value=<%=id%> 
                                                    type="hidden"  
                                                    name="id"
                                                    >

                                            </div>   



                                            <div class="modal-footer">

                                                <input  type="submit" class="left  modal-trigger modal-close waves-effect waves-light btn center green " style="margin: 0 0.75rem;" value="حفظ"/>
                                                <a class="left modal-close  waves-effect waves-light btn center black " style="margin: 0 0.75rem;">الغاء</a>
                                            </div>
                                    </div>
                                    </form>
                                </div>
                                <!-- Modal Structure -->
                                <div id="modalPhoneAdd" class="modal modal-fixed-footer" style="height: 130px">
                                    <form method="Post" action="../AddPhone" accept-charset="UTF-8">
                                        <br>
                                        <div class="modal-content" style="margin: 0;padding:unset">

                                            <div class="row">
                                                <label for="phone" class="col s2 right" style="color: black;font-size: 1.2rem;padding:0 0.75rem;">الرقم  </label>
                                                <input 
                                                    value="" id="phone"
                                                    type="text" style="border: 1px solid #9e9e9e;height: 2rem" 
                                                    class="right col s9 input-text-name"
                                                    name="nphone"

                                                    >
                                                <input 
                                                    value=<%= id%> id="phone"
                                                    type="hidden" style="border: 1px solid #9e9e9e;height: 2rem" 
                                                    class="right col s9 input-text-name"
                                                    name="id"

                                                    >
                                            </div>


                                        </div>
                                        <div class="modal-footer">

                                            <input  type="submit" class="left  modal-trigger modal-close waves-effect waves-light btn center green " style="margin: 0 0.75rem;" value="حفظ"/>
                                            <a class="left modal-close  waves-effect waves-light btn center black " style="margin: 0 0.75rem;">الغاء</a>

                                        </div>
                                    </form>
                                </div>


                            </div>
                        </div>


                        <div class=" col s12">
                            <div class="row">
                                <label for="disaddress" class=" right col l3 " style="color: black;font-size: 1.2rem;padding:0 0.75rem;"> العنوان  </label>
                                <div class="right col l4">
                                    المحافظة  
                                    <input 
                                        disabled="" value=<%= state%>  id="disaddress"
                                        type="text" style="border: 1px solid #9e9e9e;height: 2rem" 
                                        class=" input-text-name"
                                        >
                                    الشارع
                                    <input
                                         disabled="" value="<%= street%>" ]id="disaddress"
                                         type="text" style="border: 1px solid #9e9e9e;height: 2rem" 
                                        class=" input-text-name"
                                        
                                        
                                        >
                                </div>

                                <a class="modal-trigger waves-effect left waves-light btn green" style="margin:  4rem 0.75rem ;height: 2rem" href="#modalAddress"> تعديل</a>

                                <!-- Modal Structure -->
                                <div id="modalAddress" class="modal modal-fixed-footer" style="">
                                    <form method="Post" action="../UpddateAdress" accept-charset="UTF-8">
                                        <br>
                                        <div class="modal-content" style="margin: 0;padding:unset">

                                            <div class="row">
                                                <label for="address1" class="col s2 right" style="color: black;font-size: 1.2rem;padding: 3 3 3 1;margin-right: 2">المحافظة   </label>
                                                <input 
                                                    value=<%= state%> id="address1"
                                                    type="text" style="border: 1px solid #9e9e9e;height: 2rem" 
                                                    class="right col s9 input-text-name"
                                                    name="nstate"
                                                    >
                                            </div>
                                            <div class="row">
                                                <label for="address2" class="col s2 right" style="color: black;font-size: 1.2rem;padding:0 0.75rem;;margin:7 7 7 7 ">  الشارع</label>
                                                <input 
                                                    value="<%= street%>" id="address2"
                                                    type="text" style="border: 1px solid #9e9e9e;height: 2rem" 
                                                    class="right col s9 input-text-name"
                                                    name="nstreet"
                                                    >
                                            </div>
                                            <div class="row">
                                                 <input 
                                                     value=<%= state%> id="address2"
                                                     type="hidden"  
                                                     name="ostate"
                                                    >
                                            </div>
                                                 <div class="row">
                                                 <input 
                                                     value="<%= street%>" id="address2"
                                                     type="hidden"  
                                                     name="ostreet"
                                                    >
                                            </div>
                                                   <div class="row">
                                                 <input 
                                                     value="<%= id%>" id="address2"
                                                     type="hidden"  
                                                     name="idh"
                                                    >
                                            </div>


                                        </div>
                                        <div class="modal-footer">

                                            <input  type="submit" class="left  modal-trigger modal-close waves-effect waves-light btn center green " style="margin: 0 0.75rem;" value="حفظ"/>
                                            <a class="left modal-close  waves-effect waves-light btn center black " style="margin: 0 0.75rem;">الغاء</a>

                                        </div>
                                    </form>
                                </div>
                                <!-- Modal Structure -->



                            </div>
                        </div>
                    </div>

                </div>



            </div>
        </div>
    </div>



    <%@include  file="../footer.jsp" %>







    <!--Import jQuery before materialize.js-->
    <!--Import jQuery before materialize.js-->
    <script type="text/javascript" src="../js/jquery-2.1.1.min.js"></script>
    <script type="text/javascript" src="../js/materialize.js"></script>
    <script type="text/javascript" src="../js/script.js"></script>
    <script>
        $('.timepicker').pickatime({
            default: 'now',
            twelvehour: true, // change to 12 hour AM/PM clock from 24 hour
            donetext: 'تم',
            autoclose: true,
            vibrate: true, // vibrate the device when dragging clock hand

        });

        var yyy = new Date().getFullYear();
        var max_yyy = yyy - 18;
        var min_yyy = yyy - 65;
        var max_date = new Date();
        max_date.setMilliseconds(max_date.getMilliseconds() + (31 * 24 * 60 * 60 * 1000));

        $('.datepicker').pickadate({
            selectMonths: true, // Creates a dropdown to control month
            selectYears: 15, // Creates a dropdown of 15 years to control year
            format: 'dd-mm-yyyy',
            disable: [[2017, 3, 15]]

        });
        picker.set('min', new Date());
        picker.set('max', max_date);
        picker.set('disable', [
            new Date(2017, 2, 13),
            new Date(2017, 2, 29)]
                );


    </script>

</body>

</html>
