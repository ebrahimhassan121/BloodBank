package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.sql.ResultSet;
import query.Model_hospital;

public final class hospitals_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
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
 response.setContentType("text/html;charset=UTF-8");
   request.setCharacterEncoding("UTF-8");


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
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/materialize.min.css\"  media=\"screen,projection\" />\n");
      out.write("        <!--Import Google Icon Font-->\n");
      out.write("        <link href=\"fonts/font.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Cairo\" rel=\"stylesheet\">\n");
      out.write("        <!--Let browser know website is optimized for mobile-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Cairo\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Mada\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://cdn.rawgit.com/chingyawhao/materialize-clockpicker/master/dist/css/materialize.clockpicker.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link type=\"text/css\" href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body style=\"direction: rtl;background: #f4f4f4;\" class=\"\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");

    Object UN = session.getAttribute("email");
    Object Pass = session.getAttribute("password");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<ul id=\"slide-out\" class=\"side-nav green\" style=\"padding-right: 0;\">\n");
      out.write("    <li class=\"white\"> \n");
      out.write("        <a href=\"index.jsp\" class=\" green-text  \" style=\"\"><img src=\"logo.png\" class=\"brand-logo right\" width=\"48\"/><h5 style=\"margin-top: 0px;padding-top: 20px\"> بنك الدم</h5></a>\n");
      out.write("    </li> \n");
      out.write("    <li class=\"\" style=\"border-bottom: 1px solid white\">\n");
      out.write("        <a href=\"index.html\" style=\"\">\n");
      out.write("\n");
      out.write("            <h5 class=\"white-text\"> الرئيسية</h5>\n");
      out.write("\n");
      out.write("        </a>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"white-text\" style=\"border-bottom: 1px solid white\">\n");
      out.write("        <a href=\"aboutUs.jsp\" style=\"\">\n");
      out.write("\n");
      out.write("            <h5 class=\"white-text\"> من نحن</h5>\n");
      out.write("\n");
      out.write("        </a>\n");
      out.write("    </li>\n");
      out.write("\n");
      out.write("    <li class=\"\" style=\"border-bottom: 1px solid white\">\n");
      out.write("        <a href=\"questions.jsp\" style=\"\">\n");
      out.write("\n");
      out.write("            <h5 class=\"white-text\"> نصائح و اسئلة</h5>\n");
      out.write("\n");
      out.write("        </a>\n");
      out.write("    </li>\n");
      out.write("\n");
      out.write("    <li class=\"\" style=\"border-bottom: 1px solid white\">\n");
      out.write("        <a href=\"hospitals.jsp\" style=\"\">\n");
      out.write("\n");
      out.write("            <h5 class=\"white-text\"> المستشفيات</h5>\n");
      out.write("\n");
      out.write("        </a>\n");
      out.write("    </li>\n");
      out.write("    ");
if (UN == null || Pass == null) {
      out.write("\n");
      out.write("    <li class=\"\" style=\"border-bottom: 1px solid white\">\n");
      out.write("        <a href=\"register.jsp\" style=\"\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <h5 class=\"white-text\"> التسجيل</h5>\n");
      out.write("\n");
      out.write("        </a>\n");
      out.write("    </li>\n");
      out.write("    ");
}
      out.write("\n");
      out.write("    <li class=\"\" style=\"border-bottom: 1px solid white\">\n");
      out.write("        <a href=\"login.jsp\" style=\"\">\n");
      out.write("            ");
if (UN == null || Pass == null) {
      out.write("\n");
      out.write("            <h5 class=\"white-text\">تسجيل الدخول</h5>\n");
      out.write("            ");

            } else {
      out.write("\n");
      out.write("            <h5 class=\"white-text\">حسايي</h5>\n");
      out.write("            ");
  }
            
      out.write("\n");
      out.write("        </a>\n");
      out.write("    </li>\n");
      out.write("         ");
if (UN != null || Pass != null) {
      out.write("\n");
      out.write("    <li class=\"\" style=\"border-bottom: 1px solid white\">\n");
      out.write("        <a href=\"./Logout\" style=\"\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <h5 class=\"white-text\"> تسجيل الخروج</h5>\n");
      out.write("\n");
      out.write("        </a>\n");
      out.write("    </li>\n");
      out.write("    ");
}
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"navbar-fixed \">\n");
      out.write("    <nav class=\"white\">\n");
      out.write("        <div class=\"nav-wrapper  \">\n");
      out.write("\n");
      out.write("            <a href=\"index.jsp\" class=\"brand-logo green-text right\" style=\"margin-right: 1%;\"><img class=\"responsive-img\" src=\" imgs/logo.png\" width=\"50\" alt=\"logo\"/> بنك الدم</a>\n");
      out.write("            <a href=\"#\" data-activates=\"slide-out\" class=\"button-collapse hide-on-med-and-up\"><i class=\"material-icons green-text\">menu</i></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <ul class=\" hide-on-small-and-down left\" style=\"direction: rtl;\">\n");
      out.write("                  ");
 if(UN!=null || Pass!=null){
      out.write("\n");
      out.write("                <li class=\"left\"><a href=\"./Logout\" style=\"\"><span class=\"left hide-on-med-and-down\">  تسجيل الخروج</span><span class=\"right\"></span></a></li>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("                \n");
      out.write("                <li class=\"left\"><a href=\"login.jsp\" style=\"\">\n");
      out.write("                        <div class=\"\" style=\"\">\n");
      out.write("                            ");
 if (UN == null || Pass == null) {
      out.write("\n");
      out.write("                            <span class=\"left hide-on-med-and-down \">تسجيل الدخول</span><span class=\"right\">\n");
      out.write("                                <i class=\"material-icons tiny \" style=\"\" >input</i></span>\n");
      out.write("                                ");
} else {
      out.write("\n");
      out.write("                            <span class=\"left hide-on-med-and-down \">حسابي</span><span class=\"right\">\n");
      out.write("                                <i class=\"material-icons tiny \" style=\"\" >input</i></span>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            ");
 }
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                ");
 if(UN==null || Pass==null){
      out.write("\n");
      out.write("                <li class=\"left\"><a href=\"register.jsp\" style=\"\"><span class=\"left hide-on-med-and-down\">  التسجيل</span><span class=\"right\"><i class=\"material-icons tiny \" style=\"\" >person_add</i></span></a></li>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("                <li class=\"left\"><a href=\"hospitals.jsp\" style=\"\"><span class=\"left hide-on-med-and-down\"> المستشفيات</span><span class=\"right\"><i class=\"material-icons tiny \" style=\"\" >local_hospital</i></span></a></li>\n");
      out.write("\n");
      out.write("                <li class=\"left\"><a href=\"questions.jsp\" style=\"\"><span class=\"left hide-on-med-and-down\"> نصائح واسئلة</span><span class=\"right\"><i class=\"material-icons tiny \" style=\"\" >question_answer</i></span></a></li>\n");
      out.write("                <li class=\"left \"><a href=\"aboutUs.jsp\" style=\"\"><span class=\"left hide-on-med-and-down\"> من نحن</span><span class=\"right\"><i class=\"material-icons tiny \" style=\"\" >info</i></span></a></li>\n");
      out.write("                <li class=\"left\"><a href=\"index.jsp\" style=\"\"><span class=\"left hide-on-med-and-down\">الرئيسية</span><span class=\"right\"><i class=\"material-icons tiny \" style=\"\" >home</i></span></a></li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <nav class=\"green\" id=\"breadcrumb\">\n");
      out.write("                <div class=\"nav-wrapper\">\n");
      out.write("                    <div class=\"col s12\">\n");
      out.write("                        <a href=\"index.jsp\" class=\"breadcrumb\">الرئيسية</a>\n");
      out.write("                        <a href=\"hospitals.jsp\" class=\"breadcrumb\"> المستشفيات</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row \">\n");
      out.write("            <div class=\" col l6 m12 s12 offset-l2 center \">\n");
      out.write("                <div class=\"row \" style=\"min-height: 80vh;\">\n");
      out.write("                    <div class=\"col  left s12  card white \" style=\"\">\n");
      out.write("\n");
      out.write("                        <h5 class=\"right black-text\" >دليل المستشفيات</h5>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row \">\n");
      out.write("                        <form action=\"Hospital\" method=\"Post\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <select  name =\"state\"class=\"col  l4 m6 s12 right browser-default\" style=\"\">\n");
      out.write("                                <option value=\"\" disabled selected>اختيار المحافظة</option>\n");
      out.write("\n");
      out.write("                                ");

                                    Model_hospital MH = new Model_hospital();
                                    ArrayList<String> arr = MH.selectHospittalStates();
                                    for (int i = 0; i < arr.size(); i++) {

                                
      out.write("\n");
      out.write("                                <option value=\"");
      out.print(arr.get(i));
      out.write('"');
      out.write('>');
      out.print(arr.get(i));
      out.write("</option> \n");
      out.write("\n");
      out.write("                                ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </select>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <button type=\"submit\" class=\"btn  left col l2 m3 s4 green white-text\" style=\"\" >تطبيق</button>\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col  left s12  card white \" style=\"padding: 20px\">\n");
      out.write("                        ");


                            ServletContext context = getServletContext();
                            ResultSet rs = null;
                            String state = (String) context.getAttribute("state");
                            Model_hospital model_hospital = new Model_hospital();
                            if (request.getMethod().toLowerCase().equals("get")) {
                                //System.out.println(state);
                                if (state == null) {
                                    rs = model_hospital.selectHospittalAll();
                                } else if (state == "all") {
                                    rs = model_hospital.selectHospittalAll();
                                } else {
                                    rs = model_hospital.selectHospittal(state);
                                }
                            } else if (request.getMethod().toLowerCase().equals("post")) {
                                String government = request.getParameter("government");
                                String type = request.getParameter("type").toUpperCase();
                                switch (type) {
                                    
                                    case "A": {
                                        
                                        rs = model_hospital.selectHospitalsByStateAndBloodType( government, "apositive");
                                    }break;
                                    case "B": {
                                        rs = model_hospital.selectHospitalsByStateAndBloodType(government, "bpositive");
                                    }break;
                                    case "O": {
                                        rs = model_hospital.selectHospitalsByStateAndBloodType(government, "opositive");
                                    }break;
                                    case "NA": {
                                        rs = model_hospital.selectHospitalsByStateAndBloodType(government, "anegative");
                                    }break;
                                    case "NB": {
                                        rs = model_hospital.selectHospitalsByStateAndBloodType(government, "bnegative");
                                    }break;
                                    case "NO": {
                                        rs = model_hospital.selectHospitalsByStateAndBloodType(government, "onegative");
                                    }break;
                                    case "AB": {
                                        rs = model_hospital.selectHospitalsByStateAndBloodType(government, "abpositive");
                                    }break;
                                    case "NAB": {
                                        rs = model_hospital.selectHospitalsByStateAndBloodType(government, "abnegative");
                                    }break;
                                }
                            }
                            context.setAttribute("state", null);
                        
      out.write("\n");
      out.write("                        <table class=\"white gridview highlight\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("                            <thead style=\"border: 1px #333 solid\">\n");
      out.write("                                <tr >\n");
      out.write("                                    <th><h5 class=\"center\">   المستشفي</h5></th>\n");
      out.write("                                    <th><h5 class=\"center\"> العنوان</h5></th>\n");
      out.write("                                    <th><h5 class=\"center\"> رقم التليفون</h5></th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody class=\"\" style=\"\">\n");
      out.write("                                ");

                                    while (rs.next()) {
                                        int id = rs.getInt(1);
                                        ArrayList<String> phone = model_hospital.select_phone_hospittal(id);
                                
      out.write("\n");
      out.write("\n");
      out.write("                                <tr >\n");
      out.write("                                    <td><h6 class=\"center\"> ");
      out.print( rs.getString(2));
      out.write("</h6></td>\n");
      out.write("                                    <td><h6 class=\"center\"> ");
      out.print( rs.getString(6));
      out.write('-');
      out.print( rs.getString(5));
      out.write(" </h6></td>\n");
      out.write("                                    <td>\n");
      out.write("                                        ");

                                            for (int i = 0; i < phone.size(); i++) {
      out.write("\n");
      out.write("\n");
      out.write("                                        <h6 class=\"center\">\n");
      out.write("                                            <span class=\"\" style=\"display: block;border-bottom: 1px solid #757575;\"><a href=\"tel:02-26844195\">");
      out.print(phone.get(i));
      out.write("</a></span>\n");
      out.write("                                        </h6>\n");
      out.write("\n");
      out.write("                                        ");
  }  
      out.write("\n");
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                ");
 }
                                    model_hospital.closeResultSet(rs);
                                    model_hospital.closeConnection();

                                
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
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
      out.write("\n");
      out.write("\n");
      out.write("        <!--Import jQuery before materialize.js-->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-2.1.1.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/materialize.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/script.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://cdn.rawgit.com/chingyawhao/materialize-clockpicker/master/dist/js/materialize.clockpicker.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>\n");
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
