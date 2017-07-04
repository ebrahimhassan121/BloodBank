<%-- 
    Document   : remember
    Created on : Mar 17, 2017, 9:08:35 PM
    Author     : ahmed
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
        <title>  BLood </title>
    </head>
    <body style="direction: rtl">
        <%@include file="header.jsp" %>



        <div class="row lrr" id="reset" style="" >
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
                            استعادة كلمة المرور
                        </h3>
                        <% 
                        String massege=(String)request.getAttribute("message_null");
                        if(massege==null){
                            massege="";
                        }
                        
                        %>
                        <div class="row">
                            <form class="col s12" method="Post" action="CheckEmail">
                                <div class="row">
                                 
                                    <label for="email" data-error="خطأ" data-success=""> <font color="red"><%= massege%></font></label>
                                      </div>
                                <div class="row">
                                    <div class="input-field col s12">
                                        <input name="email" id="email" type="email" class="validate">
                                        <label style="" for="email" data-error="خطأ" data-success="">   البريد الالكترونى</label>
                                    </div>

                                </div>

                                <div class=" row center-align">
                                    <input class="btn-large white-text green waves-effect waves-green center" style="width: 70%;" type="submit" value="بحث" />
                                </div>
                                <div class=" row center-align">
                                    <a class="white grey-text waves-effect center" style="" href="login.jsp">تتذكر كلمة المرور ؟</a>
                                </div>
                                <div class=" row center-align">
                                    <a class="white grey-text waves-effect  center" style="" href="register.jsp" >لا تمتلك حساب ؟</a>
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
