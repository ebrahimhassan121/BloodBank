package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import query.Model_timespace;
import java.util.ArrayList;
import java.sql.ResultSet;
import query.Model_users;
import query.Model_hospital;
import java.util.Collections;
import java.util.List;
import entities.Users;
import query.Model_users;

public final class appointment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/user/header.jsp");
    _jspx_dependants.add("/user/../footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

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



      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <!--Import materialize.css-->\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"../css/materialize.min.css\"  media=\"screen,projection\" />\n");
      out.write("        <!--Import Google Icon Font-->\n");
      out.write("        <link href=\"../fonts/font.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Cairo\" rel=\"stylesheet\">\n");
      out.write("        <!--Let browser know website is optimized for mobile-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Cairo\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Mada\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link type=\"text/css\" href=\"../css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <link type=\"text/css\" href=\"stylee.css\" rel=\"stylesheet\">\n");
      out.write("        <title>بنك الدم</title>\n");
      out.write("    </head>\n");
      out.write("    ");

         Model_users model_users=new Model_users();
        Object email =   session.getAttribute("email");
        Object password =   session.getAttribute("password");
        String name,type,phone;
        Users user =model_users.select_user(email.toString(), password.toString()).get(0) ;
        
        name=user.getName();
        int ssn=user.getSsn();
        phone=user.getPhonrnumber();
        System.out.println("profile");
        String bloodtype=model_users.selectUserBloodType(ssn );
        if(bloodtype==null){
            bloodtype="غير معروف";
        }
       
    
      out.write("\n");
      out.write("     <body style=\"direction: rtl;background: #f4f4f4;\" class=\"\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("        <ul id=\"slide-out\" class=\"side-nav fixed \" style=\" padding-right: 0;padding-left: 0;padding-bottom: 60px;height: 100%; \">\n");
      out.write("\n");
      out.write("            <li><div class=\"userView\">\n");
      out.write("                    <div class=\"background\">\n");
      out.write("                        <img src=\"../imgs/user-bg.jpg\">\n");
      out.write("                    </div>\n");
      out.write("                    <a href=\"#!user\" class=\"\"><img class=\"circle white \" src=\"../imgs/User-Red-icon.png\"></a>\n");
      out.write("                    <a href=\"profile.jsp\"><span class=\"white-text name\"><h6>");
      out.print(name);
      out.write("</h6></span></a>\n");
      out.write("                    <a href=\"\"https://\"");
      out.print(email);
      out.write("\" target=\"blank\"><span class=\"email \" style=\"color:  #333333;\">");
      out.print(email);
      out.write("</span></a>\n");
      out.write("                </div></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <li class=\"\" style=\"\">\n");
      out.write("                <a href=\"../index.jsp\" style=\"\">\n");
      out.write("                    <i class=\"material-icons right\" style=\"margin-left: 10px\">home</i>\n");
      out.write("                    الرئيسية\n");
      out.write("\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"\" style=\"\">\n");
      out.write("                <a href=\"reservedAppointment.jsp\" style=\"\">\n");
      out.write("                    <i class=\"material-icons right\" style=\"margin-left: 10px\">receipt</i>\n");
      out.write("                    ميعاد محجوز\n");
      out.write("\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"\" style=\"\">\n");
      out.write("                <a href=\"appointment.jsp\" style=\"\">\n");
      out.write("                    <i class=\"material-icons right\" style=\"margin-left: 10px\">receipt</i>\n");
      out.write("                    حجز ميعاد للتبرع\n");
      out.write("\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"\" style=\"\">\n");
      out.write("                <a href=\"history.jsp\" style=\"\">\n");
      out.write("                    <i class=\"material-icons right\" style=\"margin-left: 10px\">history</i>\n");
      out.write("                    سجل التبرع\n");
      out.write("\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"\" style=\"\">\n");
      out.write("                <a href=\"../hospitals.jsp\" style=\"\">\n");
      out.write("                    <i class=\"material-icons right\" style=\"margin-left: 10px\">local_hospital</i>\n");
      out.write("                    المستشفيات\n");
      out.write("\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"\" style=\"\">\n");
      out.write("                <a href=\"setting.jsp\" style=\"\">\n");
      out.write("                    <i class=\"material-icons right\" style=\"margin-left: 10px\">settings</i>\n");
      out.write("                    الاعدادت\n");
      out.write("\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <li class=\"white-text\" style=\"\">\n");
      out.write("                <a href=\"../aboutUs.jsp\" style=\"\">\n");
      out.write("                    <i class=\"material-icons right\" style=\"margin-left: 10px\">info</i>\n");
      out.write("                    من نحن\n");
      out.write("\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"\" style=\"\">\n");
      out.write("                <a href=\"../questions.jsp\" style=\"\">\n");
      out.write("                    <i class=\"material-icons right\" style=\"margin-left: 10px\">question_answer</i>\n");
      out.write("                    نصائح و اسئلة\n");
      out.write("\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <li class=\"\" style=\"border-bottom: 1px solid white\">\n");
      out.write("                <a href=\"../Logout\" style=\"\">\n");
      out.write("                    <i class=\"material-icons right\" style=\"margin-left: 10px\">power_settings_new</i>\n");
      out.write("                    تسجيل الخروج\n");
      out.write("\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"navbar-fixed \">\n");
      out.write("            <nav class=\"white\">\n");
      out.write("                <div class=\"nav-wrapper  \">\n");
      out.write("\n");
      out.write("                    <a href=\"../Logout\" class=\"brand-logo green-text right\" style=\"margin-right: 1%;\"><img class=\"responsive-img\" src=\"../logo.png\" width=\"50\" alt=\"logo\"/> بنك الدم</a>\n");
      out.write("                    <a href=\"#\" data-activates=\"slide-out\" class=\"button-collapse show-on-medium-and-down\"><i class=\"material-icons green-text\">menu</i></a>\n");
      out.write("                    <ul class=\" hide-on-small-and-down\">\n");
      out.write("                        <li class=\"\" style=\"\">\n");
      out.write("                            <a href=\"../Logout\" style=\"\">\n");
      out.write("\n");
      out.write("                                تسجيل الخروج\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("    <nav class=\"green\" id=\"breadcrumb\">\n");
      out.write("        <div class=\"nav-wrapper\">\n");
      out.write("            <div class=\"col s12\">\n");
      out.write("                <a href=\"profile.jsp\" class=\"breadcrumb\">حسابي</a>\n");
      out.write("                <a href=\"appointment.jsp\" class=\"breadcrumb\"> حجز ميعاد تبرع</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("</div>\n");
      out.write("<div class=\"row \">\n");
      out.write("    <div class=\" col l6 m12 s12 offset-l2 left \">\n");
      out.write("        <div class=\"row  \" style=\"\">\n");
      out.write("            <div class=\"col  left s12  card green \" style=\"\">\n");
      out.write("\n");
      out.write("                <h5 class=\"right white-text\" >حجز معياد للتبرع</h5>\n");
      out.write("                <form  style=\"display: block;\" method=\"POST\" action=\"../ReserveAppointment\">\n");
      out.write("                    <select id=\"government\" name=\"government\" class=\"browser-default\" style=\"\">\n");
      out.write("                        <option value=\"\" disabled selected>المحافظة</option>\n");
      out.write("                        ");
  for (int i = 0; i < getallstates.size(); i++) {
                                if (state != null && state.equals(getallstates.get(i))) {
      out.write("\n");
      out.write("                        <option value=\"./appointment.jsp?city=");
      out.print(getallstates.get(i));
      out.write("\" selected>");
      out.print(getallstates.get(i));
      out.write("</option>\n");
      out.write("\n");
      out.write("                        ");

                        } else {
                        
      out.write("\n");
      out.write("                        <option value=\"./appointment.jsp?city=");
      out.print(getallstates.get(i));
      out.write('"');
      out.write('>');
      out.print(getallstates.get(i));
      out.write("</option>\n");
      out.write("                        ");

                                }
                            }

                        
      out.write("\n");
      out.write("\n");
      out.write("                    </select>\n");
      out.write("\n");
      out.write("                    <br>\n");
      out.write("\n");
      out.write("                    <select id=\"hospital\" name=\"hospital\" class=\"browser-default\" style=\"\">\n");
      out.write("                        <option value=\"\" disabled selected>مستشفي</option>\n");
      out.write("\n");
      out.write("                        ");
 if (hospital != null) {
                                for (int i = 0; i < hospital.size(); i++) {
                                    if (hospitalName != null && hospitalName.equals(hospital.get(i))) {
                        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <option value=\"./appointment.jsp?city=");
      out.print(state);
      out.write("&hospital=");
      out.print( hospital.get(i));
      out.write("\" selected> ");
      out.print(hospital.get(i));
      out.write("</option>\n");
      out.write("                        ");
  } else {
                        
      out.write("  <option value=\"./appointment.jsp?city=");
      out.print(state);
      out.write("&hospital=");
      out.print( hospital.get(i));
      out.write("\" > ");
      out.print(hospital.get(i));
      out.write("</option>\n");
      out.write("                        ");

                                    }
                                }
                            }
                        
      out.write(" \n");
      out.write("                    </select>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"input-field col s6 m6 l6 right white-text \">\n");
      out.write("                        <input type=\"date\" name=\"resevedDate\" id=\"birthdate\" class=\"datepicker\" \n");
      out.write("                               style=\"    color: black;background: rgba(255,255,255,0.9);border-radius: 3px;\"\n");
      out.write("                               />\n");
      out.write("                        <label for=\"birthdate\" style=\"padding:3px;color: black\">اختيار التاريخ</label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"input-field col s6 l6 m6  right\">\n");
      out.write("                        <select class=\"browser-default\" name=\"time\" required>\n");
      out.write("                            <option value=\"1\" disabled selected > الوقت المتاح </option>\n");
      out.write("                            ");
 if(availableTime!=null){
                                for(int i=0;i<availableTime.size();i++){
                                
      out.write("\n");
      out.write("                                <option value=\"");
      out.print(availableTime.get(i));
      out.write("\"  >");
      out.print(availableTime.get(i));
      out.write("</option>\n");
      out.write("                               ");
 }
                            }
      out.write("\n");
      out.write("                        </select>\n");
      out.write("\n");
      out.write("                    </div>               \n");
      out.write("\n");
      out.write("                    <!-- birth day in millisecond !-->\n");
      out.write("                    <input  type=\"text\" name=\"dat_inMs\" id=\"dat_inMs\" value=\"unset\" hidden required=\"\" />\n");
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    <button class=\" btn btn-large col s12 white  green-text\" style=\"margin-bottom: 20px\" href=\"#\" type=\"submit\">اتمام</button>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("                <br>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <footer class=\" page-footer green\">\n");
      out.write("            <div class=\"footer-copyright\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    © جميع الحقوق محفوظة لمطورين بنك الدم ™ 2017\n");
      out.write("                    <span class=\"left\" style=\"margin-left:20px\"> <a class=\"grey-text text-lighten-4 \" href=\"#!\" style=\"margin:30px auto\">الانضمام لنا</a> </span>\n");
      out.write("                    <span class=\"left\" style=\"margin-left:20px\"> <a class=\"grey-text text-lighten-4 \" href=\"#!\" style=\"margin:30px auto\">الشروط والاحكام</a> </span>\n");
      out.write("                    <span class=\"left\" style=\"margin-left:20px\"> <a class=\"grey-text text-lighten-4 \" href=\"#!\" style=\"margin:30px auto\">مركز المساعدة</a> </span>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("      \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--Import jQuery before materialize.js-->\n");
      out.write("<script type=\"text/javascript\" src=\"../js/jquery-2.1.1.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../js/materialize.js\"></script>\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function () {\n");
      out.write("        $(\".button-collapse\").sideNav();\n");
      out.write("        $('.button-collapse').sideNav({\n");
      out.write("            menuWidth: 300, // Default is 300\n");
      out.write("            edge: 'right', // Choose the horizontal origin\n");
      out.write("            closeOnClick: false, // Closes side-nav on <a> clicks, useful for Angular/Meteor\n");
      out.write("            draggable: true // Choose whether you can drag to open on touch screens\n");
      out.write("        }\n");
      out.write("        );\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        if (is_touch_device()) {\n");
      out.write("            $('.side-nav').css('overflow-y', 'auto')\n");
      out.write("        }\n");
      out.write("        function is_touch_device() {\n");
      out.write("            return 'ontouchstart' in window        // works on most browsers \n");
      out.write("                    || 'onmsgesturechange' in window;  // works on IE10 with some false positives\n");
      out.write("        }\n");
      out.write("        ;\n");
      out.write("\n");
      out.write("\n");
      out.write("        $('#government').change(function () {\n");
      out.write("            // set the window's location property to the value of the option the user has selected\n");
      out.write("            window.location = $(this).val();\n");
      out.write("        });\n");
      out.write("        $('#hospital').change(function () {\n");
      out.write("            // set the window's location property to the value of the option the user has selected\n");
      out.write("            window.location = $(this).val();\n");
      out.write("        });\n");
      out.write("\n");
      out.write("\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    var yyy = new Date().getFullYear();\n");
      out.write("    var max_yyy = yyy - 18;\n");
      out.write("    var min_yyy = yyy - 65;\n");
      out.write("    var max_date = new Date();\n");
      out.write("    max_date.setMilliseconds(max_date.getMilliseconds() + (31 * 24 * 60 * 60 * 1000));\n");
      out.write("    var selectedDate = null;\n");
      out.write("    $('.datepicker').pickadate({\n");
      out.write("        selectMonths: true, // Creates a dropdown to control month\n");
      out.write("        selectYears: 15, // Creates a dropdown of 15 years to control year\n");
      out.write("        format: 'dd-mm-yyyy',\n");
      out.write("        onSet: function (context) {\n");
      out.write("            $('#dat_inMs').val(context.select);\n");
      out.write("            //   alert(\"sssssssssss\"+$('#dat_inMs').val());\n");
      out.write("            selectedDate = context.select;\n");
      out.write("            console.log('Just set stuff:', context.select)\n");
      out.write("        },\n");
      out.write("        onClose: function (context) {\n");
      out.write("    ");
 if (state != null && hospitalName != null) {
      out.write("\n");
      out.write("\n");
      out.write("            if (selectedDate != null) {\n");
      out.write("\n");
      out.write("                window.location = (\"./appointment.jsp?city=");
      out.print(state);
      out.write("&hospital=");
      out.print(hospitalName);
      out.write("&date=\" + selectedDate);\n");
      out.write("            }\n");
      out.write("    ");
 }
      out.write("\n");
      out.write("\n");
      out.write("        },\n");
      out.write("\n");
      out.write("    });\n");
      out.write("    var $input = $('.datepicker').pickadate();\n");
      out.write("\n");
      out.write("// Use the picker object directly.\n");
      out.write("    var picker = $input.pickadate('picker');\n");
      out.write("\n");
      out.write("    picker.set('min', new Date());\n");
      out.write("    picker.set('max', max_date);\n");
      out.write("    ");
 if (date != null) {
      out.write("\n");
      out.write("\n");
      out.write("    var date = new Date();\n");
      out.write("    date.setMilliseconds($('#dat_inMs').val());\n");
      out.write("    picker.set('select', date);\n");
      out.write("\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Exception e) {
        response.sendRedirect("../login.jsp");

    }

    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
