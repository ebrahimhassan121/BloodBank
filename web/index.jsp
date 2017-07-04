<%-- 
    Document   : index
    Created on : Mar 12, 2017, 10:05:26 AM
    Author     : ahmed
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="query.Model_hospital"%>
<%@page import="query.Model_donors"%>
<%@page import="query.Model_typeblood"%>
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
        <title>  BLood </title>
    </head>
    <body style="direction: rtl">
        <%@include  file="header.jsp" %>
      
            <div class="" style=" 
             background-attachment: fixed;
             background-size: cover;
             background-repeat: no-repeat;
             background-image: url('imgs/backgr.jpg');

             background-color: #333;height: 70vh">


            <div class="container header_content "> 
                <div class="row" style="padding-top: 40px;padding-bottom: 100px"> 
                    <div class="col m8 l8 s12 right  ">
                        <div class="header_statment" > 
                            <h1 ><span  class="white-text" style="background: rgba(0,0,0,0.7)">مرحبا بك</span></h1> 
                            
                            <h5 class="hide-on-small-and-down" style="line-height: 2"><span class="white-text" style="padding: 4px;background: rgba(0,0,0,0.7)">متبرع واحد بالدم يمكن أن ينقذ ثلاثة حالات</span></h5>
                             <h6 class="hide-on-med-and-up" style="line-height: 2"><span class="white-text" style="padding: 4px;background: rgba(0,0,0,0.7)">متبرع واحد بالدم يمكن أن ينقذ ثلاثة حالات</span></h6>
                             
                            <h5 class="hide-on-med-and-down"  style="line-height: 2">
                                <span class="white-text" style="padding: 4px;background: rgba(0,0,0,0.7)">ساعدونا ليكون البنك جاهزًا لإنقاذ أكبر عدد من الحالات</span>
                            </h5>
                             <h6 class="hide-on-large-only"  style="line-height: 2">
                                <span class="white-text" style="padding: 4px;background: rgba(0,0,0,0.7)">ساعدونا ليكون البنك جاهزًا لإنقاذ أكبر عدد من الحالات</span>
                            </h6>
                            
                            <h5 class="hide-on-small-and-down" style="line-height: 2">
                                <span class="white-text" style="padding: 4px;background: rgba(0,0,0,0.7)"><sub style="">قال تعالي</sub> (<b class="green-text"> وَمَنْ أَحْيَاهَا فَكَأَنَّمَا أَحْيَا النَّاسَ جَمِيعًا </b>)<sub>صدَقَ الله العَظِيم</sub></span>
                            </h5>
                            <h6 class="hide-on-med-and-up" style="line-height: 2">
                                <span class="white-text" style="padding: 4px;background: rgba(0,0,0,0.7)"><sub style="">قال تعالي</sub>( <b class="green-text "> وَمَنْ أَحْيَاهَا فَكَأَنَّمَا أَحْيَا النَّاسَ جَمِيعًا </b>)<sub>صدَقَ الله العَظِيم</sub></span>
                            </h6>
                            
                        </div>
                    </div>
                    
                    <div class="col m4  s12 left card green " style="">

                        <h5 class="right white-text" >بحث عن فصيلة دم</h5>
                        <form style="display: block;" method="post" action="hospitals.jsp">

                            <select class="browser-default" style="" name="government">
                                <option value="" disabled selected>المحافظة</option>
                                                                <% 
                                    Model_hospital MH=new Model_hospital();
                                    ArrayList<String> arr= MH.selectHospittalStates();
                                    for(int i=0;i<arr.size();i++){
                                
                                %>
                                <option value="<%=arr.get(i)%>"><%=arr.get(i)%></option> 
                                
                                <% } %>
                            </select>
                            <br>
                          
                            <select class="browser-default" name="type" style="">
                                <option value="" disabled selected>فصيلة الدم</option>
                                <option value="A">+A</option>
                                <option value="B">+B</option>
                                <option value="O">+O</option>
                                <option value="AB">+AB</option>            
                                <option value="NAB">-AB</option>            
                                <option value="NA">-A</option>
                                <option value="NB">-B</option>
                                <option value="NO">-O</option>
                            </select>
                            <br>
                            <button type="submit" class=" btn btn-large col s12 white green-text" >بحث </button>
                            <br><br><br>
                        </form>
                        <br>
                    </div>
                    
                </div>
            </div>
        </div>
        <br><br>
        <div class="row container">
            <h4 class="center">مِنْ نَحْنُ </h4>
            <p class="center">
                نَحْن هَيْئَة غَيْر رِبْحِيَّة تَهْدِف لِتَسْهِيل وَتَنْظِيم عَمَلِيَّة التَّبَرُّع بِالدَّم وَمُسَاعَدَة الْمُسْتَشْفَيَات فِي ادارة تِلْك الْعَمَلِيَّة وايضا فِي تَقْديم الارشادات وَالنَّصَائِح لِلْمُتَبَرِّعِين
            </p>
        </div>
        <div class="row" style="">
            
            <div class=" col l6 m6 s12 right" id="collapse1" style="border-right:2px solid #565656">
                <h4>أسئلة شائعة</h4>
                <ul class="collapsible" data-collapsible="accordion">
                    <li class="active">
                    <div class="collapsible-header active"><i class="material-icons left">remove_circle_outline</i> ماهى الشروط التى تتوافر فى المتبرع ؟
                    </div>
                    <div class="collapsible-body" style="display: block;">
                        ان يكون المتبرع يتمتع بصحه جيده ان يكون عمره اكثر من 18 عاما ان يكون مر اكثر من 3 اشهر على اخر مره تم فيها التبرع ان يكون
                        المتبرع لم يسبق له زياره طبيب الاسنان او قام باجراء عمليه جراحيه لمده اقل من 3 اشهر

                    </div>
                </li>
                   <li>
                    <div class="collapsible-header"><i class="material-icons left">add_circle_outline</i>
                 ما  المدة اللازمة للتبرع مرة اخري ؟
                    </div>
                    <div class="collapsible-body">
                        تتراوح مابين 3الى 4 اشهر
                    </div>
                </li>
                 <li>
                    <div class="collapsible-header"><i class="material-icons left">add_circle_outline</i> ماهى اسباب منع التبرع ؟
                    </div>
                    <div class="collapsible-body">
                        التبرع بالدم خلال الثلاثه اشهر الماضيه
                        <br> وجود اى تعب من المتاعب الصحيه التاليه
                        <br>
                        <ol>
                            <li>
                                جميع انواع الانيميا
                            </li>
                            <li> امراض القلب والحمى</li>
                            <li>
                                امراض القلب والحمى الروماتزميه
                            </li>
                            <li>
                                الامراض الصدريه المزمنه
                            </li>
                            <li>
                                الحمل وامراض نزيف الدم
                            </li>
                            <li>
                                الامراض النفسيه
                            </li>
                            <li>
                                ان يكون المتبرع قد قام باجراء عمليه جراحيه خلال الثلاثه اشهر من قبل عمليه التبرع
                            </li>
                        </ol>
                    </div>
                </li>
                   <li>
                    <div class="collapsible-header"><i class="material-icons left">add_circle_outline</i> هل توجد مضاعفات للتبرع بالدم ؟
                    </div>
                    <div class="collapsible-body">
                        لا توجد اى مضاعفات للتبرع بالدم طالما قام الطبيب باجراء الفحص الشامل قبل عمليه التبرع ولكن من الممكن ان يشعر المتبرع بالغثيان
                        فينصح بان يتناول بعض من العصائر

                    </div>
                </li>
                </ul>
            </div><div class="col l6 m6 s12 right" id="collapse2" style="border-right:2px solid #565656">
                <h4>اهم النصائح</h4>
                <ul class="collapsible" data-collapsible="accordion">
                     <li>
                    <div class="collapsible-header"><i class="material-icons left">add_circle_outline</i>فوائد التبرع بالدم</div>
                    <div class="collapsible-body">
                        <span>
                        <ol>
                            <li>تنشيط الدورة الدموية</li>
                            <li>يتم تنشيط نخاع العظم لإنتاج خلايا الدم المختلفة بعد التبرع بالدم</li>
                             <li>التقليل من احتمال الإصابة بأمراض القلب</li>
                              <li>التقلليل من انسداد الشرايين </li>
                               <li>-التبرع بالدم يقلل نسبة الحديد في الدم والتي ثبت علمياً أن زيادة نسبة الحديد تزيد من نسبة الإصابة من هذه</li>
                                <li>التاكد من سلامه المتبرع عن طريق قيام فحص شامل له</li>
                        </ol>
                        </span>
                    </div>
                </li>
                 <li>
                    <div class="collapsible-header"><i class="material-icons left">add_circle_outline</i>نصائح قبل عملية التبرع</div>
                    <div class="collapsible-body">
                        <span>
                        <ol>
                            <li>ان لا يكون المتبرع قد قام باجراء اى عمليه جراحيه قبل التبرع بمده اقل من 6 اشهر </li>
                            <li>ان لا يكون المتبرع قد سبق له التبرع لمده تقل عن 3 اشهر </li>
                             <li>التقليل من احتمال الإصابة بأمراض القلب</li>
                              <li>ان يتناول وجبه غدائيه صصحيه قبل التبرع  </li>
                               <li>تناول بعض العصائر </li>
                                <li>ان لايكون قد تناول بعض العقاقير الطبيه مثل الاسبرين لمده تقل عن 48ساعه </li>
                        </ol>
                        </span>
                    </div>
                </li>
                 <li>
                    <div class="collapsible-header"><i class="material-icons left">add_circle_outline</i>نصائح اثناء عمليه التبرع بالدم</div>
                    <div class="collapsible-body">
                        <span>
                        <ol>
                            <li>ن تتاكد من ان نسبه ضغط الدم ليست اقل من المعدل الطبيعى </li>
                            <li>اكد من ان الادوات المستخدمه لم تستخدم من قبل </li>
                             <li>التقليل من احتمال الإصابة بأمراض القلب</li>
                              <li>اذا شعرت بغثيان اثناء التبرع قم بالنوم على ظهرك وارفع قدميك الى اعلى </li>
                               <li>تناول بعض العصائر </li>
                                <li>	تاكد من ان اللاصقه وضعت بشكل صحيح ومنعت  نزول الدم من الجسم </li>
                        </ol>
                        </span>
                    </div>
                </li>
                <li>
                    <div class="collapsible-header"><i class="material-icons left">add_circle_outline</i>نصائح بعد عملية التبرع</div>
                    <div class="collapsible-body">
                        <span>
                        <ol>
                            <li>تناول العصائر بكميات كبيره</li>
                            <li>البعد عن القيام باعمال مرهقه</li>
                            <li>- اللجوء للراحه عند الشعور بغثيان</li>
                            <li>التقليل من تناول السجائر</li>
                            <li>اذا شعر بغثيان ينام على الظهر ورفع القدمين الى اعلى</li>
                        </ol>
                        </span>
                    </div>
                </li>
                </ul>
            </div>

        </div>
        <br><br>
        <div class="row " style="background: #f5f5f5">
            <br><br>
            <% 
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
            
            %>
            
            
            <div class=" right col s12 m7 l6" style="border-right:2px solid #565656">
                <h4 class="right "> إِحْصَائِيَات  لِكُلُّ الْمَرَاكِزِ و الْمُسْتَشْفَيَاتِ بِنَوِّكَ الدَّمِ</h4>

                <table class="white  highlight " cellpadding="0" cellspacing="0">
                    <thead style="border: 1px #333 solid">
                        <tr >
                            <th><h5 class="center"> فَصِيلَة الدَّم</h5></th>
                                    <th><h5 class="center"> الْأَكْيَاس الْمُتَوَفِّرَة</h5></th>
                                    <th><h5 class="center"> الحد الادنى للْأَكْيَاس الْمَطْلُوبَة</h5></th>
                                    <th><h5 class="center"> الْأَكْيَاس الْمَطْلُوبَة</h5></th>


                        </tr>
                    </thead>
                    <tbody class="" style="">

                         <tr >    
                                    <td><h6 class="center">-O</h6></td>
                                    <td><h6 class="center"><%=  onegative%> </h6></td>
                                    <td><h6 class="center"><%=count%></h6></td>
                                        <% if (onegative > count) {%>
                                    <td><h6 class="center"> المخزون متوفر</h6></td> 
                                    <%} else if (onegative == count) {
                                    %>
                                    <td><h6  style="color: #ffea00" class="center">     المخزون متوفر</h6></td> 
                                    <%} else {%>
                                    <td><h6  style="color: #ee2200" class="center"> <%= count - onegative%></h6></td> 
                                    <% }%>                                
                                </tr>
                                <tr >
                                    <td><h6 class="center">+O</h6></td>
                                    <td><h6 class="center"><%= opositive%></h6></td>
                                    <td><h6 class="center"><%=count%></h6></td>

                                    <% if (opositive > count) {%>
                                    <td><h6 class="center"> المخزون متوفر</h6></td> 
                                    <%} else if (opositive == count) {
                                    %>
                                    <td><h6  style="color: #ffea00" class="center">     المخزون متوفر</h6></td> 
                                    <%} else {%>
                                    <td><h6  style="color: #ee2200" class="center"> <%= count - opositive%></h6></td> 
                                    <% }%>
                                </tr>
                                <tr >
                                    <td><h6 class="center">-AB</h6></td>   
                                    <td><h6 class="center"><%= abnegative%></h6></td>
                                    <td><h6 class="center"><%=count%></h6></td>

                                    <% if (abnegative > count) {%>
                                    <td><h6 class="center"> المخزون متوفر</h6></td> 
                                    <%} else if (abnegative == count) {
                                    %>
                                    <td><h6  style="color: #ffea00" class="center">     المخزون متوفر</h6></td> 
                                    <%} else {%>
                                    <td><h6  style="color: #ee2200" class="center"> <%= count - abnegative%></h6></td> 
                                    <% }%>                                </tr>
                                <tr >
                                    <td><h6 class="center">+AB</h6></td>
                                    <td><h6 class="center"><%= abpositive%></h6></td>
                                    <td><h6 class="center"><%=count%></h6></td>

                                    <% if (abpositive > count) {%>
                                    <td><h6 class="center"> المخزون متوفر</h6></td> 
                                    <%} else if (abpositive == count) {
                                    %>
                                    <td><h6  style="color: #ffea00" class="center">     المخزون متوفر</h6></td> 
                                    <%} else {%>
                                    <td><h6  style="color: #ee2200" class="center"> <%= count - abpositive%></h6></td> 
                                    <% }%>                                </tr>
                                <tr >
                                    <td><h6 class="center">-A</h6></td>
                                    <td><h6 class="center"><%= anegative%></h6></td>
                                    <td><h6 class="center"><%=count%></h6></td>

                                    <% if (anegative > count) {%>
                                    <td><h6 class="center"> المخزون متوفر</h6></td> 
                                    <%} else if (anegative == count) {
                                    %>
                                    <td><h6  style="color: #ffea00" class="center">     المخزون متوفر</h6></td> 
                                    <%} else {%>
                                    <td><h6  style="color: #ee2200" class="center"> <%= count - anegative%></h6></td> 
                                    <% }%>                                </tr>
                                <tr >
                                    <td><h6 class="center">+A</h6></td>
                                    <td><h6 class="center"><%= apositive%></h6></td>
                                    <td><h6 class="center"><%=count%></h6></td>
                                   
                                    <% if (apositive > count) {%>
                                    <td><h6 class="center"> المخزون متوفر</h6></td> 
                                    <%} else if (apositive == count) {
                                    %>
                                    <td><h6  style="color: #ffea00" class="center">     المخزون متوفر</h6></td> 
                                    <%} else {%>
                                    <td><h6  style="color: #ee2200" class="center"> <%= count - apositive%></h6></td> 
                                    <% }%> 
                                </tr>
                                <tr >
                                    <td><h6 class="center">-B</h6></td>
                                    <td><h6 class="center"><%= bnegative%></h6></td>
                                    <td><h6 class="center"><%=count%></h6></td>

                                    <% if (bnegative > count) {%>
                                    <td><h6 class="center"> المخزون متوفر</h6></td> 
                                    <%} else if (bnegative == count) {
                                    %>
                                    <td><h6  style="color: #ffea00" class="center">     المخزون متوفر</h6></td> 
                                    <%} else {%>
                                    <td><h6  style="color: #ee2200" class="center"> <%= count - bnegative%></h6></td> 
                                    <% }%>                                </tr>
                                <tr >
                                    <td><h6 class="center">+B</h6></td>
                                    <td><h6 class="center"><%= bpositive%></h6></td>
                                    <td><h6 class="center"><%=count%></h6></td>

                                    <% if (bpositive > count) {%>
                                    <td><h6 class="center"> المخزون متوفر</h6></td> 
                                    <%} else if (bpositive == count) {
                                    %>
                                    <td><h6  style="color: #ffea00" class="center">     المخزون متوفر</h6></td> 
                                    <%} else {%>
                                    <td><h6  style="color: #ee2200" class="center"> <%= count - bpositive%></h6></td> 
                                    <% }%>                                </tr>
                    </tbody>
                </table>
                <br><br>
            </div>


            <div class="right center col s12 l6 m5 " style="border-right:2px solid #565656">
                <h4 class="right">  مَوَاقِع الْمُسْتَشْفَيَات عُلِي الْخَرِيطَة</h4>
                <br><br>
                <iframe  src="https://www.google.com/maps/embed?pb=!1m16!1m12!1m3!1d3587367.3027080465!2d34.649947289519325!3d28.591124260924733!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!2m1!1shospital+in+egypt!5e0!3m2!1sar!2seg!4v1486944393445" height="550" frameborder="0" style="border:0;width:80%"  ></iframe>
            </div>

        </div>
        <div class="row">
            <h4 class="center">  عَ‍‍‍‍‍‍‍‍‍ــدَادَ الْمُتَبَرِّعِين بِالدَّم </h4>
            <h5 class="center green-text"><%=numberofdonor %></h5>
            <br><br>
        </div>
            
            
            
      
        
        
        
        
        
        
        <%@include  file="footer.jsp" %>
        
         <script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
        <script type="text/javascript" src="js/materialize.min.js"></script>
        <script type="text/javascript" src="js/script.js"></script>
    </body>
</html>
