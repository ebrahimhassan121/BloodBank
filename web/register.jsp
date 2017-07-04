<%-- 
    Document   : register
    Created on : Mar 13, 2017, 3:32:17 PM
    Author     : ahmed
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
    <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>
        <!--Import Google Icon Font-->
        <link href="fonts/font.css" rel="stylesheet">
        <!--Let browser know website is optimized for mobile-->
        <meta charset="UTF-8" name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link href="https://fonts.googleapis.com/css?family=Cairo" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Mada" rel="stylesheet">
        <link type="text/css" href="css/style.css" rel="stylesheet">
        <title>تسجيل حساب</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        
        <div class="row lrr" id="register" style="" >
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
                            تسجيل عضوية
                        </h3>
                        <div class="row">
                            <form class="col s12"   method="POST" action ="Register" >

                                <div class="row" style="margin-bottom:0">
                                    <div class="input-field col s12" style="margin-top: 0">
                                        <input  name ="name" id="email" type="text" class="validate" required="true">
                                        <label for="email" data-error="خطأ" data-success="">اسم المستخدم </label>
                                        </div>   
                                     </div>
   
                                    <div class="row">
                                       <label for="email"  ><h6 style="color: #D50000"> </h6></label>

                                    </div>
                               
                                <div class="row" style="margin-bottom: 0">
                                    <div class="input-field col s12" style="margin-top: 0">
                                        <input name="email" id="email" type="email" class="validate"  required="true">
                                        <label for="email" data-error="خطأ" data-success="">البريدالالكتروني </label>
                                    </div>
 
                                </div>
                                   
                                <div class="row" style="margin-bottom: 0">
                                    <div class="input-field col s12" style="margin-top: 0">
                                        <input name="password" id="password" type="password" class="validate"  required="true">
                                        <label for="password" style="">  كلمة المرور</label>
                                        
                                        
                                        
                                    </div>
                                     <div class="col s12" style="margin-bottom: 0">
                                      
                                     
                                           <p class="grey-text" style="margin-top: 0">   كلمة االسر يجب ان تحتوى    [a-z]  [A-Z][0-1]</p>
                                         
                                        
                                     
                                       
                                    
                                    </div>
                                </div>
                                    <div class="row" style="margin-bottom: 0">
                                     
                                    </div> 
                                <div class="row" style="margin-bottom: 0">
                                    <div class="input-field col s12" style="margin-top: 0">
                                        <input name="r_password" id="password" type="password" class="validate"  required="true">
                                        <label for="password" style="">اعادة كتابة كلمة المرور</label>
                                    </div>
                                </div>
                                                                  <div class="row" >
                                    <label for="email"  ></label>
                                    </div>
                                <div class="row" style="margin-bottom: 0">
                                    <div class="input-field col s12" style="margin-top: 0">
                                        <input name="birthdate" type="date" id="birthdate" class="datepicker"  required="true">

                                        <label for="birthdate" style="">تاريخ الميلاد</label>
                                    </div>
                                    <!-- birth day in millisecond !-->
                                    <input  type="text" name="dat_inMs" id="dat_inMs" value="unset"hidden />
                                </div>
                                                                  <div class="row">
                                    <label for="email"  ></label>
                                    </div>
                                <div class=" row center-align">
                                    <input class="btn-large white-text green waves-effect waves-green center" style="width: 70%;" type="submit" value="تسجيل عضوية" />
                                </div>

                                <div class=" row center-align">
                                    <a class="white grey-text waves-effect  center" style="" href="login.jsp" >تمتلك حساب ؟</a>
                                </div>

                            </form>
                        </div>
                    </div>               
                </div>
            </div>


        </div>
        <%@include file="footer.jsp" %>
             <script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
        <script type="text/javascript" src="js/materialize.min.js"></script>
        <script type="text/javascript" src="js/script.js"></script>
    </body>
</html>
