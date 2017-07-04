package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class enterpassword_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
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
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/materialize.min.css\"  media=\"screen,projection\"/>\n");
      out.write("        <!--Import Google Icon Font-->\n");
      out.write("        <link href=\"fonts/font.css\" rel=\"stylesheet\">\n");
      out.write("        <!--Let browser know website is optimized for mobile-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Cairo\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Mada\" rel=\"stylesheet\">\n");
      out.write("        <link type=\"text/css\" href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"\" style=\"direction: rtl;background: #f4f4f4\">\n");
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
      out.write("        <div class=\"row lrr\" id=\"login\" style=\"\" >\n");
      out.write("            <div class=\"\"  style=\"max-width: 550px;padding: 10px 0 0;margin: auto;\">\n");
      out.write("                <div class=\" card-panel white\" style=\"\n");
      out.write("                     margin-top:100px;\n");
      out.write("                     padding-top: 0px;\n");
      out.write("                     padding-right: 0px;\n");
      out.write("                     padding-left: 0px;\n");
      out.write("                     padding-bottom: 0px;\n");
      out.write("                     \" >\n");
      out.write("                    <div class=\" \">\n");
      out.write("                        <h3 class=\"center white-text green\" style=\"padding: 40px;margin-top: 0\">\n");
      out.write("                            إعادة تعيين كلمة السر\n");
      out.write("                        </h3>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <form   method=\"Post\"  action=\"RememberPassword \">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                ");

                                    String email = (String) request.getAttribute("email_rc");
                                    String username = (String) request.getAttribute("user_name_rc");
                                    String password = (String) request.getAttribute("newpassword");

                                
      out.write("\n");
      out.write("                                <div class=\"row\">\n");
      out.write("\n");
      out.write("                                    الاسم:&zwnj;  <font style=\"color: #00C853\">       ");
      out.print( username);
      out.write("  </font>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"row\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    الايميل:&zwnj;  <font style=\"color: #00C853\">      ");
      out.print( email);
      out.write("     </font>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                ");

                                    String massege = (String) request.getAttribute("Message");
                                    
      out.write("\n");
      out.write("                                <h5  style=\"color: #00C853\">");
      out.print(massege);
      out.write("</h5>\n");
      out.write("                                <br><br>\n");
      out.write("                                <div class=\"row\" style=\"margin-bottom:0\">\n");
      out.write("                                    <div class=\"input-field col s12\" style=\"margin-top: 0\">\n");
      out.write("                                        <input value=\"");
      out.print(password);
      out.write("\" name =\"code\" id=\"email\" type=\"text\" class=\"validate\" required=\"true\">\n");
      out.write("                                        <label for=\"email\" data-error=\"خطأ\" data-success=\"\">الكود </label>\n");
      out.write("                                    </div>   \n");
      out.write("                                </div>\n");
      out.write(" \n");
      out.write("                             <input type=\"hidden\" name=\"email\" value=\"");
      out.print(email);
      out.write("\">\n");
      out.write("                                <input type=\"hidden\" name=\"username\" value=\"");
      out.print(username);
      out.write("\">\n");
      out.write("                                <input type=\"hidden\" name=\"newpassword\" value=\"");
      out.print(password);
      out.write("\">\n");
      out.write("\n");
      out.write("                              \n");
      out.write("                                <div class=\"modal-footer\">\n");
      out.write("                                       <input  type=\"submit\" class=\"left  modal-trigger modal-close waves-effect waves-light btn center green \" style=\"margin: 0 0.75rem;\" value=\"  الدخول\"/>\n");
      out.write("\n");
      out.write("                                    <input  type=\"submit\" class=\"left  modal-trigger modal-close waves-effect waves-light btn center green \" style=\"margin: 0 0.75rem;\" value=\" ارسال \"/>\n");
      out.write("                                </div>\n");
      out.write("                              \n");
      out.write("\n");
      out.write("\n");
      out.write("                               \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <br> \n");
      out.write("                            </form>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>               \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--Import jQuery before materialize.js-->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-2.1.1.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/script.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
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
