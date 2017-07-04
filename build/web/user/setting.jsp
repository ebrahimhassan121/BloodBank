<%-- 
    Document   : setting
    Created on : Apr 29, 2017, 2:49:47 PM
    Author     : ahmed
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
     try{
        
        
%>
<%@include file="header.jsp"%>

        <div class="row">
            <nav class="green" id="breadcrumb">
                <div class="nav-wrapper">
                    <div class="col s12">
                        <a href="profile.jsp" class="breadcrumb">حسابي</a>
                        <a href="Setting.jsp" class="breadcrumb"> اعدادات الحساب</a>

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

                            <div class="col s12">
                                <div class="row">
                                    <h6 class="col s12 right black-text " style=";font-size: 1.2rem;" >
                                        <span class="col s6 l3 m3 right " style="padding-right: 0;">فصيلة الدم </span>
                                        <span class="green-text " style=""> <%= bloodtype%></span> </h6>

                                </div>
                            </div>
                            <div class=" col s12">
                                <div class="row">
                                    <label for="name" class=" right col l3" style="color: black;font-size: 1.2rem;padding:0 0.75rem;">الاسم </label>
                                    <input 
                                        disabled="" value="<%=name %>" id="name"
                                        type="text" style="border: 1px solid #9e9e9e;height: 2rem" 
                                        class="right col l6 input-text-name"
                                        >
                                    <a class="modal-trigger waves-effect waves-light btn green left" style="margin: 0 0.75rem;height: 2rem" href="#modal1">تعديل</a>
                                    <!-- Modal Structure -->
                                    <div id="modal1" class="modal modal-fixed-footer" style="height: 130px">
                                        <form method="Post" action="../UpdateUserName" accept-charset="UTF-8">
                                            <br>
                                            <div class="modal-content" style="margin: 0;padding:unset">

                                                <div class="row">
                                                    <label for="name" class="col s2 right" style="color: black;font-size: 1.2rem;padding:0 0.75rem;">الاسم  </label>
                                                    <input 
                                                        value="<%=name %>" id="name"
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
                                    <label for="name" class=" right col l3" style="color: black;font-size: 1.2rem;padding:0 0.75rem;">البريد </label>
                                    <input 
                                        disabled="" value="<%=email %>" id="name"
                                        type="email" style="border: 1px solid #9e9e9e;height: 2rem" 
                                        class="right col l6 input-text-name"
                                        >
                                    <a class="modal-trigger waves-effect waves-light btn green left" style="margin: 0 0.75rem;height: 2rem" href="#modalemail">تعديل</a>
                                    <!-- Modal Structure -->
                                    <div id="modalemail" class="modal modal-fixed-footer" style="height: 130px">
                                        <form method="Post" action="../UpdateUserEmail" accept-charset="UTF-8">
                                            <br>
                                            <div class="modal-content" style="margin: 0;padding:unset">

                                                <div class="row">
                                                    <label for="email" class="col s2 right" style="color: black;font-size: 1.2rem;padding:0 0.75rem;">البريد  </label>
                                                    <input 
                                                       value="<%=email %>" id="email"
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
                                         <%
                                             
                                        %>
                                        disabled="" value="<%=String.join("", Collections.nCopies(password.toString().length(), "*"))%>"  id="password"
                                        type="text" style="border: 1px solid #9e9e9e;height: 2rem" 
                                        class="right col l6 input-text-name"
                                        >
                                    <a class="modal-trigger waves-effect waves-light btn green left" style="margin: 0 0.75rem;height: 2rem" href="#modalPassowrd">تعديل</a>
                                    <!-- Modal Structure -->
                                    <div id="modalPassowrd" class="modal modal-fixed-footer" style="height: 300px">
                                        <form method="Post" action="../UpdateUserPassword" accept-charset="UTF-8">
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
                                    <label for="name" class=" right col l3 " style="color: black;font-size: 1.2rem;padding:0 0.75rem;"> رقم التليفون </label>
                                    <input 
                                        disabled="" value="<%=phone%> "id="name"
                                        type="text" style="border: 1px solid #9e9e9e;height: 2rem" 
                                        class="right col l6 input-text-name"
                                        >
                                    <a class="modal-trigger waves-effect left waves-light btn green" style="margin: 0 0.75rem;height: 2rem" href="#modalPhone">تعديل</a>
                                    <!-- Modal Structure -->
                                    <div id="modalPhone" class="modal modal-fixed-footer" style="height: 130px">
                                        <form method="Post" action="../UpdateUserPhone" accept-charset="UTF-8">
                                            <br>
                                            <div class="modal-content" style="margin: 0;padding:unset">

                                                <div class="row">
                                                    <label for="phone" class="col s2 right" style="color: black;font-size: 1.2rem;padding:0 0.75rem;">الرقم  </label>
                                                    <input 
                                                        value="<%=phone%> " id="phone"
                                                        type="text" style="border: 1px solid #9e9e9e;height: 2rem" 
                                                        class="right col s9 input-text-name"
                                                        name="phone"
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
                        </div>

                    </div>



                </div>
            </div>
        </div>




   <%@include file="footer.jsp" %>
   <%
    }catch(Exception ex){
    response.sendRedirect("../login.jsp");
}
   %>