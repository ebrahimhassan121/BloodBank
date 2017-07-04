package org.apache.jsp.hospital;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import query.Model_hospital;

public final class adddonor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("\n");
      out.write(" \n");

    Model_hospital model_hospital = new Model_hospital();
    String username = (String) session.getAttribute("username");
    String password = (String) session.getAttribute("password");
    String email=model_hospital.select_email_hospital(username, password);
     
 


      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <!--Import materialize.css-->\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"../css/materialize.min.css\" media=\"screen,projection\" />\n");
      out.write("    <!--Import Google Icon Font-->\n");
      out.write("    <link href=\"../fonts/font.css\" rel=\"stylesheet\">\n");
      out.write("    <!--Let browser know website is optimized for mobile-->\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <link href=\"../css/stylesheet.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"../css/style.css\" rel=\"stylesheet\">\n");
      out.write("    <link type=\"text/css\" href=\"style.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body style=\"direction: rtl;background: #f4f4f4;\" class=\"\">\n");
      out.write("\n");
      out.write("\n");
      out.write("     <ul id=\"slide-out\" class=\"side-nav fixed \" style=\" padding-right: 0;padding-left: 0;padding-bottom: 60px;height: 100%;\" >\n");
      out.write("\n");
      out.write("            <li><div class=\"userView\">\n");
      out.write("                    <div class=\"background\">\n");
      out.write("                        <img src=\"../imgs/user-bg.jpg\">\n");
      out.write("                    </div>\n");
      out.write("                    <a href=\"#!user\" class=\"\"><img class=\"circle white \" src=\"../imgs/build7-512.png\"></a>\n");
      out.write("                    <a href=\"profile.jsp\"><span class=\"white-text name\"><h6>مستشفي   ");
      out.print( username);
      out.write("</h6></span></a>\n");
      out.write("                    <a href=\"https:// ");
      out.print( email );
      out.write("\"target=\"blank\"><span class=\"email \" style=\"color:  #333333;\">");
      out.print( email );
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
      out.write("\n");
      out.write("            <li class=\"\" style=\"\">\n");
      out.write("                <a href=\"adddonor.jsp\" style=\"\">\n");
      out.write("                    <i class=\"material-icons right\" style=\"margin-left: 10px\">person_add</i>\n");
      out.write("                    اضافة متبرع\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"\" style=\"\">\n");
      out.write("                <a href=\"blood.jsp\" style=\"\">\n");
      out.write("                    <i class=\"material-icons right\" style=\"margin-left: 10px\">data_usage</i>\n");
      out.write("                    عينات الدم\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"\" style=\"\">\n");
      out.write("                <a href=\"donatedate.jsp\" style=\"\">\n");
      out.write("                    <i class=\"material-icons right\" style=\"margin-left: 10px\">date_range</i>\n");
      out.write("                    مواعيد التبرع\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"\" style=\"\">\n");
      out.write("                <a href=\"timeclose.jsp\" style=\"\">\n");
      out.write("                    <i class=\"material-icons right\" style=\"margin-left: 10px\">date_range</i>\n");
      out.write("                    مواعيد محجوزة\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <li class=\"\" style=\"\">\n");
      out.write("                <a href=\"history.jsp\" style=\"\">\n");
      out.write("                    <i class=\"material-icons right\" style=\"margin-left: 10px\">history</i>\n");
      out.write("                    سجل المتبرعين\n");
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
      out.write("            <li class=\"\" style=\"\">\n");
      out.write("                <a href=\"../hospitals.jsp\" style=\"\">\n");
      out.write("                    <i class=\"material-icons right\" style=\"margin-left: 10px\">local_hospital</i>\n");
      out.write("                    المستشفيات\n");
      out.write("\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("\n");
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
      out.write("                <a href=\"../questions.html\" style=\"\">\n");
      out.write("                    <i class=\"material-icons right\" style=\"margin-left: 10px\">question_answer</i>\n");
      out.write("                    نصائح و اسئلة\n");
      out.write("\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"\" style=\"border-bottom: 1px solid white\">\n");
      out.write("                <a href=\"../events.html\" style=\"\">\n");
      out.write("                    <i class=\"material-icons right\" style=\"margin-left: 10px\">events</i>\n");
      out.write("                    الاحداث\n");
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
      out.write("    <div class=\"row\">\n");
      out.write("        <nav class=\"green\" id=\"breadcrumb\">\n");
      out.write("            <div class=\"nav-wrapper\">\n");
      out.write("                <div class=\"col s12\">\n");
      out.write("                    <a href=\"hospital/profile.jsp\" class=\"breadcrumb\">حسابي</a>\n");
      out.write("                    <a href=\"hospital/adddonor.jsp\" class=\"breadcrumb\">اضافة متبرع</a>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"row \">\n");
      out.write("        <div class=\" col l6 m12 s12 offset-l2 left \">\n");
      out.write("            <div class=\"row \" style=\"min-height: 80vh;\">\n");
      out.write("                <div class=\"col  left s12  card white \" style=\"\">\n");
      out.write("\n");
      out.write("                    <h5 class=\"right black-text\"> اضافة متبرع </h5>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"col  left s12  card white \" style=\"padding: 20px\">\n");
      out.write("                  \n");
      out.write("                    <form action=\"../AddDonor\" method=\"POST\">\n");
      out.write("                    \n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col s12\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <label for=\"autocomplete-input\" class=\"col s3 right\" style=\"padding-top: 33px\"><h6 class=\"black-text\">الكود</h6></label>\n");
      out.write("                                    <div class=\"input-field col s9\">\n");
      out.write("                                        <i class=\"material-icons prefix \" style=\"left: 3rem\">textsms</i>\n");
      out.write("                                        <input name=\"ssn\" type=\"text\" id=\"autocomplete-input\" class=\"autocomplete\" required=\"\">\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <label for=\"type-blood\" class=\"col s3 right\" style=\"\"><h6 class=\"black-text\">فصيلة الدم</h6></label>\n");
      out.write("                                    <select name=\"bloodtype\" class=\"browser-default col s8 right\" id=\"type-blood\" style=\"\" required=\"\">\n");
      out.write("                                            <option value=\"\" disabled selected>فصيلة</option>\n");
      out.write("                                            <option value=\"O+\">O+</option>\n");
      out.write("                                            <option value=\"O-\">O-</option>\n");
      out.write("                                            <option value=\"A+\"> A+</option>\n");
      out.write("                                            <option value=\"A-\"> A-</option>\n");
      out.write("                                            <option value=\"B+\">B+</option>\n");
      out.write("                                            <option value=\"B-\">B-</option>\n");
      out.write("                                            <option value=\"AB+\"> AB+</option>\n");
      out.write("                                            <option value=\"AB-\"> AB-</option>\n");
      out.write("                                        </select>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                 <div class=\"row\" style=\"margin-bottom: 0;\">\n");
      out.write("                                    <div class=\"col s12 m6 l6\" >\n");
      out.write("                                        <div class=\"row \" style=\"margin-bottom: 0;\">\n");
      out.write("                                            <label class=\"col l4 s3 m4 right black-text\" for=\"blood-quantity\" style=\"margin-top: 15px\"><h6>عدد الاكياس</h6></label>\n");
      out.write("                                            <div class=\"col l8 s9 m8 left row\">\n");
      out.write("                                                <span class=\" \" style=\"width: 5%\"><button type=\"button\" class=\"btn black \" style=\"padding:0 0.75rem\" onclick=\"\n");
      out.write("                                                            var min = 1;\n");
      out.write("                                                            var newval = parseInt($('#blood-quantity').val()) || 1;\n");
      out.write("                                                            if (newval > min) {\n");
      out.write("                                                                $('#blood-quantity').val(newval - 1);\n");
      out.write("                                                            } else {\n");
      out.write("                                                                $('#blood-quantity').val(newval);\n");
      out.write("                                                            }\n");
      out.write("                                                                                              \">-</button></span>\n");
      out.write("                                                <span class=\"\" style=\"width: 80%\">\n");
      out.write("                                                    <input name=\"numberofbage\" required=\"\" id=\"blood-quantity\" class=\"black-text\" type=\"number\" value=\"1\" min=\"1\" max=\"100\"  oninvalid=\"setCustomValidity('خطــأ ')\"  style=\"text-align: center;width: 50% \">\n");
      out.write(" \n");
      out.write("\n");
      out.write("                                                    </span>\n");
      out.write("                                                <span class=\"\" style=\"width: 5%\">\n");
      out.write("                                                        <button type=\"button\" class=\"btn black\" style=\"padding:0 0.75rem\" \n");
      out.write("                                                                onclick=\"\n");
      out.write("                                                                        var max = 100;\n");
      out.write("                                                                        var newval = parseInt($('#blood-quantity').val()) || 0;\n");
      out.write("                                                                        if (newval < max) {\n");
      out.write("                                                                            $('#blood-quantity').val(newval + 1);\n");
      out.write("                                                                        } else {\n");
      out.write("                                                                            $('#blood-quantity').val(newval);\n");
      out.write("                                                                        }\n");
      out.write("                                                                \">+</button></span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"col s12 m6 l6\">\n");
      out.write("                                        <div class=\"row\" style=\"padding-top: 11px\">\n");
      out.write("                                            <!-- Switch -->\n");
      out.write("                                            <div class=\"switch right\">\n");
      out.write("                                                <label class=\"black-text\" style=\"font-size: 1rem\">\n");
      out.write("                                                       عينة سليمة \n");
      out.write("                                                       <input name=\"statusblood\" type=\"checkbox\">\n");
      out.write("                                                        <span class=\"lever\"></span>\n");
      out.write("                                                        عينة مرفوضة\n");
      out.write("                                                    </label>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row\" style=\"margin-bottom: 0;\">\n");
      out.write("                                    <label for=\"description\" class=\"col s3 right\" style=\"\"><h6 class=\"black-text\">توصيف الحالة </h6></label>\n");
      out.write("\n");
      out.write("                                    <div class=\" col s8 right\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <textarea   class=\"right-align\" rows=\"4\" name=\"description\" id=\"description\" placeholder=\"توصيف الحالة\" required style=\"height: unset;max-width:100%\"></textarea>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                               \n");
      out.write("                                <button type=\"submit\" class=\"btn btn-large waves-effect waves-light green white-text left\" style=\"\">اضافة</button>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <footer class=\" page-footer green\">\n");
      out.write("        <div class=\"footer-copyright\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                © جميع الحقوق محفوظة لمطورين بنك الدم ™ 2017\n");
      out.write("                <span class=\"left\" style=\"margin-left:20px\"> <a class=\"grey-text text-lighten-4 \" href=\"#!\" style=\"margin:30px auto\">الانضمام لنا</a> </span>\n");
      out.write("                <span class=\"left\" style=\"margin-left:20px\"> <a class=\"grey-text text-lighten-4 \" href=\"#!\" style=\"margin:30px auto\">الشروط والاحكام</a> </span>\n");
      out.write("                <span class=\"left\" style=\"margin-left:20px\"> <a class=\"grey-text text-lighten-4 \" href=\"#!\" style=\"margin:30px auto\">مركز المساعدة</a> </span>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!--Import jQuery before materialize.js-->\n");
      out.write("    <script type=\"text/javascript\" src=\"../js/jquery-2.1.1.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"../js/materialize.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"../js/script.js\"></script>\n");
      out.write("    <script>\n");
      out.write("                                                                $(document).ready(function () {\n");
      out.write("                                                                    \"use strict\";\n");
      out.write("                                                                    console.clear();\n");
      out.write("                                                                    $('input.autocomplete').autocomplete({\n");
      out.write("                                                                        data: {\n");
      out.write("                                                                              \n");
      out.write("                                                                            \"123456\": null,\n");
      out.write("                                                                            \"1234567\": null,\n");
      out.write("                                                                            \"1234568\": null\n");
      out.write("                                                                        },\n");
      out.write("                                                                        limit: 20, // The max amount of results that can be shown at once. Default: Infinity.\n");
      out.write("                                                                    });\n");
      out.write("                                                                });\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
