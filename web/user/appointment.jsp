<%-- 
    Document   : appointment
    Created on : Apr 29, 2017, 2:50:57 PM
    Author     : ahmed
--%>

<%@page import="query.Model_timespace"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="query.Model_users"%>
<%@page import="query.Model_hospital"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    try {
        Model_hospital mh = new Model_hospital();
        Model_timespace MT = new Model_timespace();
        ArrayList<String> getallstates = mh.selectHospittalStates();
        ArrayList<String> hospital = null;
        ArrayList<String> availableTime = null;
        String hospitalName = null;
        String state = null;
        String date = null;
        int hospital_id = 0;
        if (request.getParameter("city") != null) {
            state = request.getParameter("city");
            hospital = mh.selectHospitalsByState(state);

        }
        if (request.getParameter("hospital") != null) {
            hospitalName = request.getParameter("hospital");
            hospital_id = mh.selectHospitalIDByName(hospitalName);
        }
        if (request.getParameter("date") != null) {
            date = request.getParameter("date");
            availableTime = MT.select_timeAvailable(hospital_id, date);
        }


%>
<%@include file="header.jsp"%>

<div class="row">
    <nav class="green" id="breadcrumb">
        <div class="nav-wrapper">
            <div class="col s12">
                <a href="profile.jsp" class="breadcrumb">حسابي</a>
                <a href="appointment.jsp" class="breadcrumb"> حجز ميعاد تبرع</a>
            </div>
        </div>
    </nav>
</div>
<div class="row ">
    <div class=" col l6 m12 s12 offset-l2 left ">
        <div class="row  " style="">
            <div class="col  left s12  card green " style="">

                <h5 class="right white-text" >حجز معياد للتبرع</h5>
                <form  style="display: block;" method="POST" action="../ReserveAppointment">
                    <select id="government" name="government" class="browser-default" style="">
                        <option value="" disabled selected>المحافظة</option>
                        <%  for (int i = 0; i < getallstates.size(); i++) {
                                if (state != null && state.equals(getallstates.get(i))) {%>
                        <option value="./appointment.jsp?city=<%=getallstates.get(i)%>" selected><%=getallstates.get(i)%></option>

                        <%
                        } else {
                        %>
                        <option value="./appointment.jsp?city=<%=getallstates.get(i)%>"><%=getallstates.get(i)%></option>
                        <%
                                }
                            }

                        %>

                    </select>

                    <br>

                    <select id="hospital" name="hospital" class="browser-default" style="">
                        <option value="" disabled selected>مستشفي</option>

                        <% if (hospital != null) {
                                for (int i = 0; i < hospital.size(); i++) {
                                    if (hospitalName != null && hospitalName.equals(hospital.get(i))) {
                        %>


                        <option value="./appointment.jsp?city=<%=state%>&hospital=<%= hospital.get(i)%>" selected> <%=hospital.get(i)%></option>
                        <%  } else {
                        %>  <option value="./appointment.jsp?city=<%=state%>&hospital=<%= hospital.get(i)%>" > <%=hospital.get(i)%></option>
                        <%
                                    }
                                }
                            }
                        %> 
                    </select>
                    <br>
                    <div class="input-field col s6 m6 l6 right white-text ">
                        <input type="date" name="resevedDate" id="birthdate" class="datepicker" 
                               style="    color: black;background: rgba(255,255,255,0.9);border-radius: 3px;"
                               />
                        <label for="birthdate" style="padding:3px;color: black">اختيار التاريخ</label>
                    </div>

                    <div class="input-field col s6 l6 m6  right">
                        <select class="browser-default" name="time" required>
                            <option value="1" disabled selected > الوقت المتاح </option>
                            <% if(availableTime!=null){
                                for(int i=0;i<availableTime.size();i++){
                                %>
                                <option value="<%=availableTime.get(i)%>"  ><%=availableTime.get(i)%></option>
                               <% }
                            }%>
                        </select>

                    </div>               

                    <!-- birth day in millisecond !-->
                    <input  type="text" name="dat_inMs" id="dat_inMs" value="unset" hidden required="" />

                    <br>
                    <button class=" btn btn-large col s12 white  green-text" style="margin-bottom: 20px" href="#" type="submit">اتمام</button>

                </form>
                <br>
            </div>



        </div>
    </div>
</div>










<%@include file="../footer.jsp" %>





<!--Import jQuery before materialize.js-->
<script type="text/javascript" src="../js/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="../js/materialize.js"></script>
<script>
    $(document).ready(function () {
        $(".button-collapse").sideNav();
        $('.button-collapse').sideNav({
            menuWidth: 300, // Default is 300
            edge: 'right', // Choose the horizontal origin
            closeOnClick: false, // Closes side-nav on <a> clicks, useful for Angular/Meteor
            draggable: true // Choose whether you can drag to open on touch screens
        }
        );



        if (is_touch_device()) {
            $('.side-nav').css('overflow-y', 'auto')
        }
        function is_touch_device() {
            return 'ontouchstart' in window        // works on most browsers 
                    || 'onmsgesturechange' in window;  // works on IE10 with some false positives
        }
        ;


        $('#government').change(function () {
            // set the window's location property to the value of the option the user has selected
            window.location = $(this).val();
        });
        $('#hospital').change(function () {
            // set the window's location property to the value of the option the user has selected
            window.location = $(this).val();
        });


    });

    var yyy = new Date().getFullYear();
    var max_yyy = yyy - 18;
    var min_yyy = yyy - 65;
    var max_date = new Date();
    max_date.setMilliseconds(max_date.getMilliseconds() + (31 * 24 * 60 * 60 * 1000));
    var selectedDate = null;
    $('.datepicker').pickadate({
        selectMonths: true, // Creates a dropdown to control month
        selectYears: 15, // Creates a dropdown of 15 years to control year
        format: 'dd-mm-yyyy',
        onSet: function (context) {
            $('#dat_inMs').val(context.select);
            //   alert("sssssssssss"+$('#dat_inMs').val());
            selectedDate = context.select;
            console.log('Just set stuff:', context.select)
        },
        onClose: function (context) {
    <% if (state != null && hospitalName != null) {%>

            if (selectedDate != null) {

                window.location = ("./appointment.jsp?city=<%=state%>&hospital=<%=hospitalName%>&date=" + selectedDate);
            }
    <% }%>

        },

    });
    var $input = $('.datepicker').pickadate();

// Use the picker object directly.
    var picker = $input.pickadate('picker');

    picker.set('min', new Date());
    picker.set('max', max_date);
    <% if (date != null) {%>

    var date = new Date();
    date.setMilliseconds($('#dat_inMs').val());
    picker.set('select', date);

    <% } %>



</script>
</body>

</html>
<%    } catch (Exception e) {
        response.sendRedirect("../login.jsp");

    }
%>