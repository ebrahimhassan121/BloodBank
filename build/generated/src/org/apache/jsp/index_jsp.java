package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import query.Model_donors;
import query.Model_typeblood;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <link type=\"text/css\" rel=\"stylesheet\" href=\"css/materialize.min.css\"  media=\"screen,projection\"/>\n");
      out.write("        <!--Import Google Icon Font-->\n");
      out.write("        <link href=\"fonts/font.css\" rel=\"stylesheet\">\n");
      out.write("        <!--Let browser know website is optimized for mobile-->\n");
      out.write("        <meta charset=\"UTF-8\" name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Cairo\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Mada\" rel=\"stylesheet\">\n");
      out.write("        <link type=\"text/css\" href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <title>  BLood </title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"direction: rtl\">\n");
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
      out.write("      \n");
      out.write("            <div class=\"\" style=\" \n");
      out.write("             background-attachment: fixed;\n");
      out.write("             background-size: cover;\n");
      out.write("             background-repeat: no-repeat;\n");
      out.write("             background-image: url('imgs/backgr.jpg');\n");
      out.write("\n");
      out.write("             background-color: #333;height: 70vh\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"container header_content \"> \n");
      out.write("                <div class=\"row\" style=\"padding-top: 40px;padding-bottom: 100px\"> \n");
      out.write("                    <div class=\"col m8 l8 s12 right  \">\n");
      out.write("                        <div class=\"header_statment\" > \n");
      out.write("                            <h1 ><span  class=\"white-text\" style=\"background: rgba(0,0,0,0.7)\">مرحبا بك</span></h1> \n");
      out.write("                            \n");
      out.write("                            <h5 class=\"hide-on-small-and-down\" style=\"line-height: 2\"><span class=\"white-text\" style=\"padding: 4px;background: rgba(0,0,0,0.7)\">متبرع واحد بالدم يمكن أن ينقذ ثلاثة حالات</span></h5>\n");
      out.write("                             <h6 class=\"hide-on-med-and-up\" style=\"line-height: 2\"><span class=\"white-text\" style=\"padding: 4px;background: rgba(0,0,0,0.7)\">متبرع واحد بالدم يمكن أن ينقذ ثلاثة حالات</span></h6>\n");
      out.write("                             \n");
      out.write("                            <h5 class=\"hide-on-med-and-down\"  style=\"line-height: 2\">\n");
      out.write("                                <span class=\"white-text\" style=\"padding: 4px;background: rgba(0,0,0,0.7)\">ساعدونا ليكون البنك جاهزًا لإنقاذ أكبر عدد من الحالات</span>\n");
      out.write("                            </h5>\n");
      out.write("                             <h6 class=\"hide-on-large-only\"  style=\"line-height: 2\">\n");
      out.write("                                <span class=\"white-text\" style=\"padding: 4px;background: rgba(0,0,0,0.7)\">ساعدونا ليكون البنك جاهزًا لإنقاذ أكبر عدد من الحالات</span>\n");
      out.write("                            </h6>\n");
      out.write("                            \n");
      out.write("                            <h5 class=\"hide-on-small-and-down\" style=\"line-height: 2\">\n");
      out.write("                                <span class=\"white-text\" style=\"padding: 4px;background: rgba(0,0,0,0.7)\"><sub style=\"\">قال تعالي</sub> (<b class=\"green-text\"> وَمَنْ أَحْيَاهَا فَكَأَنَّمَا أَحْيَا النَّاسَ جَمِيعًا </b>)<sub>صدَقَ الله العَظِيم</sub></span>\n");
      out.write("                            </h5>\n");
      out.write("                            <h6 class=\"hide-on-med-and-up\" style=\"line-height: 2\">\n");
      out.write("                                <span class=\"white-text\" style=\"padding: 4px;background: rgba(0,0,0,0.7)\"><sub style=\"\">قال تعالي</sub>( <b class=\"green-text \"> وَمَنْ أَحْيَاهَا فَكَأَنَّمَا أَحْيَا النَّاسَ جَمِيعًا </b>)<sub>صدَقَ الله العَظِيم</sub></span>\n");
      out.write("                            </h6>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <br><br>\n");
      out.write("        <div class=\"row container\">\n");
      out.write("            <h4 class=\"center\">مِنْ نَحْنُ </h4>\n");
      out.write("            <p class=\"center\">\n");
      out.write("                نَحْن هَيْئَة غَيْر رِبْحِيَّة تَهْدِف لِتَسْهِيل وَتَنْظِيم عَمَلِيَّة التَّبَرُّع بِالدَّم وَمُسَاعَدَة الْمُسْتَشْفَيَات فِي ادارة تِلْك الْعَمَلِيَّة وايضا فِي تَقْديم الارشادات وَالنَّصَائِح لِلْمُتَبَرِّعِين\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\" style=\"\">\n");
      out.write("            \n");
      out.write("            <div class=\" col l6 m6 s12 right\" id=\"collapse1\" style=\"border-right:2px solid #565656\">\n");
      out.write("                <h4>أسئلة شائعة</h4>\n");
      out.write("                <ul class=\"collapsible\" data-collapsible=\"accordion\">\n");
      out.write("                    <li class=\"active\">\n");
      out.write("                    <div class=\"collapsible-header active\"><i class=\"material-icons left\">remove_circle_outline</i> ماهى الشروط التى تتوافر فى المتبرع ؟\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"collapsible-body\" style=\"display: block;\">\n");
      out.write("                        ان يكون المتبرع يتمتع بصحه جيده ان يكون عمره اكثر من 18 عاما ان يكون مر اكثر من 3 اشهر على اخر مره تم فيها التبرع ان يكون\n");
      out.write("                        المتبرع لم يسبق له زياره طبيب الاسنان او قام باجراء عمليه جراحيه لمده اقل من 3 اشهر\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                   <li>\n");
      out.write("                    <div class=\"collapsible-header\"><i class=\"material-icons left\">add_circle_outline</i>\n");
      out.write("                 ما  المدة اللازمة للتبرع مرة اخري ؟\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"collapsible-body\">\n");
      out.write("                        تتراوح مابين 3الى 4 اشهر\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                 <li>\n");
      out.write("                    <div class=\"collapsible-header\"><i class=\"material-icons left\">add_circle_outline</i> ماهى اسباب منع التبرع ؟\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"collapsible-body\">\n");
      out.write("                        التبرع بالدم خلال الثلاثه اشهر الماضيه\n");
      out.write("                        <br> وجود اى تعب من المتاعب الصحيه التاليه\n");
      out.write("                        <br>\n");
      out.write("                        <ol>\n");
      out.write("                            <li>\n");
      out.write("                                جميع انواع الانيميا\n");
      out.write("                            </li>\n");
      out.write("                            <li> امراض القلب والحمى</li>\n");
      out.write("                            <li>\n");
      out.write("                                امراض القلب والحمى الروماتزميه\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                الامراض الصدريه المزمنه\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                الحمل وامراض نزيف الدم\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                الامراض النفسيه\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                ان يكون المتبرع قد قام باجراء عمليه جراحيه خلال الثلاثه اشهر من قبل عمليه التبرع\n");
      out.write("                            </li>\n");
      out.write("                        </ol>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                   <li>\n");
      out.write("                    <div class=\"collapsible-header\"><i class=\"material-icons left\">add_circle_outline</i> هل توجد مضاعفات للتبرع بالدم ؟\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"collapsible-body\">\n");
      out.write("                        لا توجد اى مضاعفات للتبرع بالدم طالما قام الطبيب باجراء الفحص الشامل قبل عمليه التبرع ولكن من الممكن ان يشعر المتبرع بالغثيان\n");
      out.write("                        فينصح بان يتناول بعض من العصائر\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                </ul>\n");
      out.write("            </div><div class=\"col l6 m6 s12 right\" id=\"collapse2\" style=\"border-right:2px solid #565656\">\n");
      out.write("                <h4>اهم النصائح</h4>\n");
      out.write("                <ul class=\"collapsible\" data-collapsible=\"accordion\">\n");
      out.write("                     <li>\n");
      out.write("                    <div class=\"collapsible-header\"><i class=\"material-icons left\">add_circle_outline</i>فوائد التبرع بالدم</div>\n");
      out.write("                    <div class=\"collapsible-body\">\n");
      out.write("                        <span>\n");
      out.write("                        <ol>\n");
      out.write("                            <li>تنشيط الدورة الدموية</li>\n");
      out.write("                            <li>يتم تنشيط نخاع العظم لإنتاج خلايا الدم المختلفة بعد التبرع بالدم</li>\n");
      out.write("                             <li>التقليل من احتمال الإصابة بأمراض القلب</li>\n");
      out.write("                              <li>التقلليل من انسداد الشرايين </li>\n");
      out.write("                               <li>-التبرع بالدم يقلل نسبة الحديد في الدم والتي ثبت علمياً أن زيادة نسبة الحديد تزيد من نسبة الإصابة من هذه</li>\n");
      out.write("                                <li>التاكد من سلامه المتبرع عن طريق قيام فحص شامل له</li>\n");
      out.write("                        </ol>\n");
      out.write("                        </span>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                 <li>\n");
      out.write("                    <div class=\"collapsible-header\"><i class=\"material-icons left\">add_circle_outline</i>نصائح قبل عملية التبرع</div>\n");
      out.write("                    <div class=\"collapsible-body\">\n");
      out.write("                        <span>\n");
      out.write("                        <ol>\n");
      out.write("                            <li>ان لا يكون المتبرع قد قام باجراء اى عمليه جراحيه قبل التبرع بمده اقل من 6 اشهر </li>\n");
      out.write("                            <li>ان لا يكون المتبرع قد سبق له التبرع لمده تقل عن 3 اشهر </li>\n");
      out.write("                             <li>التقليل من احتمال الإصابة بأمراض القلب</li>\n");
      out.write("                              <li>ان يتناول وجبه غدائيه صصحيه قبل التبرع  </li>\n");
      out.write("                               <li>تناول بعض العصائر </li>\n");
      out.write("                                <li>ان لايكون قد تناول بعض العقاقير الطبيه مثل الاسبرين لمده تقل عن 48ساعه </li>\n");
      out.write("                        </ol>\n");
      out.write("                        </span>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                 <li>\n");
      out.write("                    <div class=\"collapsible-header\"><i class=\"material-icons left\">add_circle_outline</i>نصائح اثناء عمليه التبرع بالدم</div>\n");
      out.write("                    <div class=\"collapsible-body\">\n");
      out.write("                        <span>\n");
      out.write("                        <ol>\n");
      out.write("                            <li>ن تتاكد من ان نسبه ضغط الدم ليست اقل من المعدل الطبيعى </li>\n");
      out.write("                            <li>اكد من ان الادوات المستخدمه لم تستخدم من قبل </li>\n");
      out.write("                             <li>التقليل من احتمال الإصابة بأمراض القلب</li>\n");
      out.write("                              <li>اذا شعرت بغثيان اثناء التبرع قم بالنوم على ظهرك وارفع قدميك الى اعلى </li>\n");
      out.write("                               <li>تناول بعض العصائر </li>\n");
      out.write("                                <li>\tتاكد من ان اللاصقه وضعت بشكل صحيح ومنعت  نزول الدم من الجسم </li>\n");
      out.write("                        </ol>\n");
      out.write("                        </span>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <div class=\"collapsible-header\"><i class=\"material-icons left\">add_circle_outline</i>نصائح بعد عملية التبرع</div>\n");
      out.write("                    <div class=\"collapsible-body\">\n");
      out.write("                        <span>\n");
      out.write("                        <ol>\n");
      out.write("                            <li>تناول العصائر بكميات كبيره</li>\n");
      out.write("                            <li>البعد عن القيام باعمال مرهقه</li>\n");
      out.write("                            <li>- اللجوء للراحه عند الشعور بغثيان</li>\n");
      out.write("                            <li>التقليل من تناول السجائر</li>\n");
      out.write("                            <li>اذا شعر بغثيان ينام على الظهر ورفع القدمين الى اعلى</li>\n");
      out.write("                        </ol>\n");
      out.write("                        </span>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <br><br>\n");
      out.write("        <div class=\"row \" style=\"background: #f5f5f5\">\n");
      out.write("            <br><br>\n");
      out.write("            ");
 
            Model_typeblood m=new Model_typeblood();
            Model_donors model_donors=new Model_donors();
            int numberofdonor=model_donors.selectNumberOfDonors();
            int opositive, onegative, apositive, anegative, bpositive, bnegative, abnegative, abpositive;
                                opositive = m.selectSumBloodType(  "opositive");
                                onegative = m.selectSumBloodType(  "onegative");
                                apositive = m.selectSumBloodType(  "apositive");
                                anegative = m.selectSumBloodType(  "anegative");
                                bpositive = m.selectSumBloodType(  "bpositive");//          
                                bnegative = m.selectSumBloodType(  "bnegative");
                                abnegative= m.selectSumBloodType(  "abnegative");
                                abpositive = m.selectSumBloodType( "abpositive");
                                 int count = 1000;
            
            
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\" right col s12 m7 l6\" style=\"border-right:2px solid #565656\">\n");
      out.write("                <h4 class=\"right \"> إِحْصَائِيَات  لِكُلُّ الْمَرَاكِزِ و الْمُسْتَشْفَيَاتِ بِنَوِّكَ الدَّمِ</h4>\n");
      out.write("\n");
      out.write("                <table class=\"white  highlight \" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("                    <thead style=\"border: 1px #333 solid\">\n");
      out.write("                        <tr >\n");
      out.write("                            <th><h5 class=\"center\"> فَصِيلَة الدَّم</h5></th>\n");
      out.write("                                    <th><h5 class=\"center\"> الْأَكْيَاس الْمُتَوَفِّرَة</h5></th>\n");
      out.write("                                    <th><h5 class=\"center\"> الحد الادنى للْأَكْيَاس الْمَطْلُوبَة</h5></th>\n");
      out.write("                                    <th><h5 class=\"center\"> الْأَكْيَاس الْمَطْلُوبَة</h5></th>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody class=\"\" style=\"\">\n");
      out.write("\n");
      out.write("                         <tr >    \n");
      out.write("                                    <td><h6 class=\"center\">-O</h6></td>\n");
      out.write("                                    <td><h6 class=\"center\">");
      out.print(  onegative);
      out.write(" </h6></td>\n");
      out.write("                                    <td><h6 class=\"center\">");
      out.print(count);
      out.write("</h6></td>\n");
      out.write("                                        ");
 if (onegative > count) {
      out.write("\n");
      out.write("                                    <td><h6 class=\"center\"> المخزون متوفر</h6></td> \n");
      out.write("                                    ");
} else if (onegative == count) {
                                    
      out.write("\n");
      out.write("                                    <td><h6  style=\"color: #ffea00\" class=\"center\">     المخزون متوفر</h6></td> \n");
      out.write("                                    ");
} else {
      out.write("\n");
      out.write("                                    <td><h6  style=\"color: #ee2200\" class=\"center\"> ");
      out.print( count - onegative);
      out.write("</h6></td> \n");
      out.write("                                    ");
 }
      out.write("                                \n");
      out.write("                                </tr>\n");
      out.write("                                <tr >\n");
      out.write("                                    <td><h6 class=\"center\">+O</h6></td>\n");
      out.write("                                    <td><h6 class=\"center\">");
      out.print( opositive);
      out.write("</h6></td>\n");
      out.write("                                    <td><h6 class=\"center\">");
      out.print(count);
      out.write("</h6></td>\n");
      out.write("\n");
      out.write("                                    ");
 if (opositive > count) {
      out.write("\n");
      out.write("                                    <td><h6 class=\"center\"> المخزون متوفر</h6></td> \n");
      out.write("                                    ");
} else if (opositive == count) {
                                    
      out.write("\n");
      out.write("                                    <td><h6  style=\"color: #ffea00\" class=\"center\">     المخزون متوفر</h6></td> \n");
      out.write("                                    ");
} else {
      out.write("\n");
      out.write("                                    <td><h6  style=\"color: #ee2200\" class=\"center\"> ");
      out.print( count - opositive);
      out.write("</h6></td> \n");
      out.write("                                    ");
 }
      out.write("\n");
      out.write("                                </tr>\n");
      out.write("                                <tr >\n");
      out.write("                                    <td><h6 class=\"center\">-AB</h6></td>   \n");
      out.write("                                    <td><h6 class=\"center\">");
      out.print( abnegative);
      out.write("</h6></td>\n");
      out.write("                                    <td><h6 class=\"center\">");
      out.print(count);
      out.write("</h6></td>\n");
      out.write("\n");
      out.write("                                    ");
 if (abnegative > count) {
      out.write("\n");
      out.write("                                    <td><h6 class=\"center\"> المخزون متوفر</h6></td> \n");
      out.write("                                    ");
} else if (abnegative == count) {
                                    
      out.write("\n");
      out.write("                                    <td><h6  style=\"color: #ffea00\" class=\"center\">     المخزون متوفر</h6></td> \n");
      out.write("                                    ");
} else {
      out.write("\n");
      out.write("                                    <td><h6  style=\"color: #ee2200\" class=\"center\"> ");
      out.print( count - abnegative);
      out.write("</h6></td> \n");
      out.write("                                    ");
 }
      out.write("                                </tr>\n");
      out.write("                                <tr >\n");
      out.write("                                    <td><h6 class=\"center\">+AB</h6></td>\n");
      out.write("                                    <td><h6 class=\"center\">");
      out.print( abpositive);
      out.write("</h6></td>\n");
      out.write("                                    <td><h6 class=\"center\">");
      out.print(count);
      out.write("</h6></td>\n");
      out.write("\n");
      out.write("                                    ");
 if (abpositive > count) {
      out.write("\n");
      out.write("                                    <td><h6 class=\"center\"> المخزون متوفر</h6></td> \n");
      out.write("                                    ");
} else if (abpositive == count) {
                                    
      out.write("\n");
      out.write("                                    <td><h6  style=\"color: #ffea00\" class=\"center\">     المخزون متوفر</h6></td> \n");
      out.write("                                    ");
} else {
      out.write("\n");
      out.write("                                    <td><h6  style=\"color: #ee2200\" class=\"center\"> ");
      out.print( count - abpositive);
      out.write("</h6></td> \n");
      out.write("                                    ");
 }
      out.write("                                </tr>\n");
      out.write("                                <tr >\n");
      out.write("                                    <td><h6 class=\"center\">-A</h6></td>\n");
      out.write("                                    <td><h6 class=\"center\">");
      out.print( anegative);
      out.write("</h6></td>\n");
      out.write("                                    <td><h6 class=\"center\">");
      out.print(count);
      out.write("</h6></td>\n");
      out.write("\n");
      out.write("                                    ");
 if (anegative > count) {
      out.write("\n");
      out.write("                                    <td><h6 class=\"center\"> المخزون متوفر</h6></td> \n");
      out.write("                                    ");
} else if (anegative == count) {
                                    
      out.write("\n");
      out.write("                                    <td><h6  style=\"color: #ffea00\" class=\"center\">     المخزون متوفر</h6></td> \n");
      out.write("                                    ");
} else {
      out.write("\n");
      out.write("                                    <td><h6  style=\"color: #ee2200\" class=\"center\"> ");
      out.print( count - anegative);
      out.write("</h6></td> \n");
      out.write("                                    ");
 }
      out.write("                                </tr>\n");
      out.write("                                <tr >\n");
      out.write("                                    <td><h6 class=\"center\">+A</h6></td>\n");
      out.write("                                    <td><h6 class=\"center\">");
      out.print( apositive);
      out.write("</h6></td>\n");
      out.write("                                    <td><h6 class=\"center\">");
      out.print(count);
      out.write("</h6></td>\n");
      out.write("                                   \n");
      out.write("                                    ");
 if (apositive > count) {
      out.write("\n");
      out.write("                                    <td><h6 class=\"center\"> المخزون متوفر</h6></td> \n");
      out.write("                                    ");
} else if (apositive == count) {
                                    
      out.write("\n");
      out.write("                                    <td><h6  style=\"color: #ffea00\" class=\"center\">     المخزون متوفر</h6></td> \n");
      out.write("                                    ");
} else {
      out.write("\n");
      out.write("                                    <td><h6  style=\"color: #ee2200\" class=\"center\"> ");
      out.print( count - apositive);
      out.write("</h6></td> \n");
      out.write("                                    ");
 }
      out.write(" \n");
      out.write("                                </tr>\n");
      out.write("                                <tr >\n");
      out.write("                                    <td><h6 class=\"center\">-B</h6></td>\n");
      out.write("                                    <td><h6 class=\"center\">");
      out.print( bnegative);
      out.write("</h6></td>\n");
      out.write("                                    <td><h6 class=\"center\">");
      out.print(count);
      out.write("</h6></td>\n");
      out.write("\n");
      out.write("                                    ");
 if (bnegative > count) {
      out.write("\n");
      out.write("                                    <td><h6 class=\"center\"> المخزون متوفر</h6></td> \n");
      out.write("                                    ");
} else if (bnegative == count) {
                                    
      out.write("\n");
      out.write("                                    <td><h6  style=\"color: #ffea00\" class=\"center\">     المخزون متوفر</h6></td> \n");
      out.write("                                    ");
} else {
      out.write("\n");
      out.write("                                    <td><h6  style=\"color: #ee2200\" class=\"center\"> ");
      out.print( count - bnegative);
      out.write("</h6></td> \n");
      out.write("                                    ");
 }
      out.write("                                </tr>\n");
      out.write("                                <tr >\n");
      out.write("                                    <td><h6 class=\"center\">+B</h6></td>\n");
      out.write("                                    <td><h6 class=\"center\">");
      out.print( bpositive);
      out.write("</h6></td>\n");
      out.write("                                    <td><h6 class=\"center\">");
      out.print(count);
      out.write("</h6></td>\n");
      out.write("\n");
      out.write("                                    ");
 if (bpositive > count) {
      out.write("\n");
      out.write("                                    <td><h6 class=\"center\"> المخزون متوفر</h6></td> \n");
      out.write("                                    ");
} else if (bpositive == count) {
                                    
      out.write("\n");
      out.write("                                    <td><h6  style=\"color: #ffea00\" class=\"center\">     المخزون متوفر</h6></td> \n");
      out.write("                                    ");
} else {
      out.write("\n");
      out.write("                                    <td><h6  style=\"color: #ee2200\" class=\"center\"> ");
      out.print( count - bpositive);
      out.write("</h6></td> \n");
      out.write("                                    ");
 }
      out.write("                                </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("                <br><br>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"right center col s12 l6 m5 \" style=\"border-right:2px solid #565656\">\n");
      out.write("                <h4 class=\"right\">  مَوَاقِع الْمُسْتَشْفَيَات عُلِي الْخَرِيطَة</h4>\n");
      out.write("                <br><br>\n");
      out.write("                <iframe  src=\"https://www.google.com/maps/embed?pb=!1m16!1m12!1m3!1d3587367.3027080465!2d34.649947289519325!3d28.591124260924733!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!2m1!1shospital+in+egypt!5e0!3m2!1sar!2seg!4v1486944393445\" height=\"550\" frameborder=\"0\" style=\"border:0;width:80%\"  ></iframe>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <h4 class=\"center\">  عَ‍‍‍‍‍‍‍‍‍ــدَادَ الْمُتَبَرِّعِين بِالدَّم </h4>\n");
      out.write("            <h5 class=\"center green-text\">");
      out.print(numberofdonor );
      out.write("</h5>\n");
      out.write("            <br><br>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("      \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
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
      out.write("        \n");
      out.write("         <script type=\"text/javascript\" src=\"js/jquery-2.1.1.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/script.js\"></script>\n");
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
