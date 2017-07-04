<%-- 
    Document   : donatedate
    Created on : Apr 20, 2017, 11:55:44 AM
    Author     : ahmed
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="query.Model_timespace"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<%@page import="query.Model_hospital"%>

<%
    Model_timespace model_timespace=new Model_timespace();
    Model_hospital model_hospital = new Model_hospital();
    String username = (String) session.getAttribute("username");
    String password = (String) session.getAttribute("password");
    String email = model_hospital.select_email_hospital(username, password);
    int id=model_hospital.select_id_hospital(username, password);
    ResultSet rs=model_timespace. select_time(id);
    String time="";
    while (rs.next()){
       time=time+"  "+  rs.getString(1) ;
        
    }
    model_timespace.closeConnection();
    model_timespace.closeResultSet(rs);


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
                        <a href="donatedate.jsp" class="breadcrumb">مواعيد التبرع</a>

                    </div>
                </div>
            </nav>
        </div>

        <div class="row ">
            <div class=" col l6 m12 s12 offset-l2 left ">
                <div class="row " style="min-height: 60vh">
                    <div class="col  left s12  card white " style="">

                        <h5 class="right black-text" >ادارة اوقات التبرع</h5>
                    </div>


                    <div class="col  left s12  card white " style="padding: 20px">



                        <div class=" col s12">
                            <div class="row">
                                <label for="name" class=" right col l3" style="color: black;font-size: 1.2rem;padding:0 0.75rem;">الاوقات </label>
                                <input 
                                     
                                    disabled="" value="<%= time%> "id="name"
                                    type="text" style="border: 1px solid #9e9e9e;height: 2rem" 
                                    class="right col l6 input-text-name"
                                    >
                                <a class="modal-trigger waves-effect waves-light btn green left" style="margin: 0 0.75rem;height: 2rem" href="#modal1">تعديل</a>
                                <!-- Modal Structure -->
                                <div id="modal1" class="modal modal-fixed-footer" style="height:60vh">
                                    <form action="../TimeSpace" method="Post">
                                        <br>
                                        <div class="modal-content" style="margin: 0;padding:unset">


                                            <div class="col s12 right">
                                                <div class="input-field col s12">
                                                    <select name="time" multiple id="donate-times" multiple="true">
                                                        <option value="" style="text-align: right" disabled selected>اختيار اوقات التبرع</option>
                                                        <option value="1AM">1AM</option>
                                                        <option value="2AM">2AM</option>
                                                        <option value="3AM">3AM</option>
                                                        <option value="4AM">4AM</option>
                                                        <option value="5AM">5AM</option>
                                                        <option value="6AM">6AM</option>
                                                        <option value="7AM">7AM</option>
                                                        <option value="8AM">8AM</option>
                                                        <option value="9AM">9AM</option>
                                                        <option value="10AM">10AM</option>
                                                        <option value="11AM">11AM</option>
                                                        <option value="12AM">12AM</option>
                                                        <option value="1PM">1PM</option>
                                                        <option value="2PM">2PM</option>
                                                        <option value="3PM">3PM</option>
                                                        <option value="4PM">4PM</option>
                                                        <option value="5PM">5PM</option>
                                                        <option value="6PM">6PM</option>
                                                        <option value="7PM">7PM</option>
                                                        <option value="8PM">8PM</option>
                                                        <option value="9PM">9PM</option>
                                                        <option value="10PM">10PM</option>
                                                        <option value="11PM">11PM</option>
                                                        <option value="12PM">12PM</option>
                                                         

                                                    </select>

                                                </div>


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

            $(document).ready(function () {
                "use strict";
                console.clear();
                
                  $('#modal1').modal({
                ready: function (modal, trigger) { // Callback for Modal open. Modal and trigger parameters available.
                   
                  $("#donate-times").prevAll('input.select-dropdown').trigger('open');
                    
                }
            });
                
            });
            function edit_times() {


            }
          

        </script>
        <style>
            dropdown-content select-dropdown multiple-select-dropdown active{
                overflow: hidden;

            }
            .select-dropdown{
                max-height:  35vh;
            }
           
            [type="checkbox"]:checked + label:before {
                top: -4px;
                left: -5px;
                width: 12px;
                height: 22px;
                border-top: 2px solid transparent;
                border-left: 2px solid transparent;
                border-right: 2px solid crimson;
                border-bottom: 2px solid crimson;
                -webkit-transform: rotate(40deg);
                transform: rotate(40deg);
                -webkit-backface-visibility: hidden;
                backface-visibility: hidden;
                -webkit-transform-origin: 100% 100%;
                transform-origin: 100% 100%;
            }
        </style>
    </body>

</html>
