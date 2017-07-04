<%-- 
    Document   : header
    Created on : Mar 12, 2017, 9:58:52 AM
    Author     : ahmed
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<%
    Object UN = session.getAttribute("email");
    Object Pass = session.getAttribute("password");
%>


<ul id="slide-out" class="side-nav green" style="padding-right: 0;">
    <li class="white"> 
        <a href="index.jsp" class=" green-text  " style=""><img src="logo.png" class="brand-logo right" width="48"/><h5 style="margin-top: 0px;padding-top: 20px"> بنك الدم</h5></a>
    </li> 
    <li class="" style="border-bottom: 1px solid white">
        <a href="index.html" style="">

            <h5 class="white-text"> الرئيسية</h5>

        </a>
    </li>
    <li class="white-text" style="border-bottom: 1px solid white">
        <a href="aboutUs.jsp" style="">

            <h5 class="white-text"> من نحن</h5>

        </a>
    </li>

    <li class="" style="border-bottom: 1px solid white">
        <a href="questions.jsp" style="">

            <h5 class="white-text"> نصائح و اسئلة</h5>

        </a>
    </li>

    <li class="" style="border-bottom: 1px solid white">
        <a href="hospitals.jsp" style="">

            <h5 class="white-text"> المستشفيات</h5>

        </a>
    </li>
    <%if (UN == null || Pass == null) {%>
    <li class="" style="border-bottom: 1px solid white">
        <a href="register.jsp" style="">


            <h5 class="white-text"> التسجيل</h5>

        </a>
    </li>
    <%}%>
    <li class="" style="border-bottom: 1px solid white">
        <a href="login.jsp" style="">
            <%if (UN == null || Pass == null) {%>
            <h5 class="white-text">تسجيل الدخول</h5>
            <%
            } else {%>
            <h5 class="white-text">حسايي</h5>
            <%  }
            %>
        </a>
    </li>
         <%if (UN != null || Pass != null) {%>
    <li class="" style="border-bottom: 1px solid white">
        <a href="./Logout" style="">


            <h5 class="white-text"> تسجيل الخروج</h5>

        </a>
    </li>
    <%}%>


</ul>


<div class="navbar-fixed ">
    <nav class="white">
        <div class="nav-wrapper  ">

            <a href="index.jsp" class="brand-logo green-text right" style="margin-right: 1%;"><img class="responsive-img" src=" imgs/logo.png" width="50" alt="logo"/> بنك الدم</a>
            <a href="#" data-activates="slide-out" class="button-collapse hide-on-med-and-up"><i class="material-icons green-text">menu</i></a>


            <ul class=" hide-on-small-and-down left" style="direction: rtl;">
                  <% if(UN!=null || Pass!=null){%>
                <li class="left"><a href="./Logout" style=""><span class="left hide-on-med-and-down">  تسجيل الخروج</span><span class="right"></span></a></li>
                <% } %>
                
                <li class="left"><a href="login.jsp" style="">
                        <div class="" style="">
                            <% if (UN == null || Pass == null) {%>
                            <span class="left hide-on-med-and-down ">تسجيل الدخول</span><span class="right">
                                <i class="material-icons tiny " style="" >input</i></span>
                                <%} else {%>
                            <span class="left hide-on-med-and-down ">حسابي</span><span class="right">
                                <i class="material-icons tiny " style="" >input</i></span>


                            <% }%>
                        </div>
                    </a>
                </li>
                <% if(UN==null || Pass==null){%>
                <li class="left"><a href="register.jsp" style=""><span class="left hide-on-med-and-down">  التسجيل</span><span class="right"><i class="material-icons tiny " style="" >person_add</i></span></a></li>
                <% } %>
                <li class="left"><a href="hospitals.jsp" style=""><span class="left hide-on-med-and-down"> المستشفيات</span><span class="right"><i class="material-icons tiny " style="" >local_hospital</i></span></a></li>

                <li class="left"><a href="questions.jsp" style=""><span class="left hide-on-med-and-down"> نصائح واسئلة</span><span class="right"><i class="material-icons tiny " style="" >question_answer</i></span></a></li>
                <li class="left "><a href="aboutUs.jsp" style=""><span class="left hide-on-med-and-down"> من نحن</span><span class="right"><i class="material-icons tiny " style="" >info</i></span></a></li>
                <li class="left"><a href="index.jsp" style=""><span class="left hide-on-med-and-down">الرئيسية</span><span class="right"><i class="material-icons tiny " style="" >home</i></span></a></li>

            </ul>

        </div>
    </nav>
</div>

