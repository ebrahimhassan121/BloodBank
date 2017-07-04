/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_servlate;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ahmed
 */
@WebServlet(name = "RememberPassword", urlPatterns = {"/RememberPassword"})
public class RememberPassword extends HttpServlet {

    private String host;
    private String port;
    private String user;
    private String pass;
    int test=0;
    GenerateRandomPassword generateRandomPassword = new GenerateRandomPassword();
    SendPassword sendPassword = new SendPassword();

    public void init() {
        // reads SMTP server setting from web.xml file
        ServletContext context = getServletContext();
        host = context.getInitParameter("host");
        port = context.getInitParameter("port");
        user = context.getInitParameter("user");
        pass = context.getInitParameter("pass");
    }

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // reads form fields
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String to = request.getParameter("email") ;
        String username = request.getParameter("username") ;
        int password = generateRandomPassword.generate();
        String resultMessage = "";

         try {
            sendPassword.sendEmail(host, port, user, pass, to, username, password);
            resultMessage = "تَمَّ ارسال الرِّسَالَةَ بِنجَاحِ";
            test=1;
        } catch (Exception ex) {
            ex.printStackTrace();
            resultMessage = "هُنَاكَ مُشْكِلَةٌ ! مَنّ فَضْلِكَ اُعْدُ الْمُحَاوَلَةَ";
             System.out.println(resultMessage);
        } finally {
            request.setAttribute("user_name_rc", username);

            request.setAttribute("email_rc", to);
            request.setAttribute("newpassword", String.valueOf(password)  );

            request.setAttribute("Message", resultMessage);
 
        } 
         if(test==1){
             
                         request.getRequestDispatcher("entersecuritycode.jsp").forward(request, response);

         }else{
                         request.getRequestDispatcher("send_email.jsp").forward(request, response);

         }
       
       
    }
}
