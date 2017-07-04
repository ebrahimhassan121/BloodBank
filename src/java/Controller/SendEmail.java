package 
        Controller;

// File Name SendEmail.java

import java.io.*;
import java.security.SecureRandom;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class SendEmail extends HttpServlet {
    private static String USER_NAME = "ebrahimhassan121";  // GMail user name (just the part before "@gmail.com")
    private static String PASSWORD = ""; // GMail password
    private static String RECIPIENT = "ebrahimhassan121@outlook.com";
    
    
static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
static SecureRandom rnd = new SecureRandom();

String randomString( int len ){
   StringBuilder sb = new StringBuilder( len );
   for( int i = 0; i < len; i++ ) 
      sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
   return sb.toString();
}


  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
// Recipient's email ID needs to be mentioned.
String to = "ahmed.salama.fci2015@gmail.com";
// Sender's email ID needs to be mentioned
        String from = "bloodbank951@gmail.com";
// Assuming you are sending email from localhost
        String host = "localhost";
// Get system properties
        Properties properties = System.getProperties();
// Setup mail server
        properties.setProperty("mail.smtp.host", host);
// Get the default Session object.
        Session session = Session.getDefaultInstance(properties);
// Set response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
// Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);
// Set From: header field of the header.
            message.setFrom(new InternetAddress(from));
// Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(to));
// Set Subject: header field
            message.setSubject("This is the Subject Line!");
// Now set the actual message
            message.setText("This is actual message");
// Send message
            Transport.send(message);
            String title = "Send Email";
            String res = "Sent message successfully....";
            String docType
                    = "<!doctype html public \"-//w3c//dtd html 4.0 "
                    + "transitional//en\">\n";
            out.println(docType
                    + "<html>\n"
                    + "<head><title>" + title + "</title></head>\n"
                    + "<body bgcolor=\"#f0f0f0\">\n"
                    + "<h1 align=\"center\">" + title + "</h1>\n"
                    + "<p align=\"center\">" + res + "</p>\n"
                    + "</body></html>");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
              String from = USER_NAME;
        String pass = PASSWORD;
        String[] to = { RECIPIENT }; // list of recipient email addresses
        String subject = "اعادة تعين كلمة سر حسابك في بنك الدم";
        String body = "لقد تم تعين كلمة السر"
                + "\n"
                + ";كلمة السر الجديدة :"
                 +randomString(8);

        sendFromGMail(from, pass, to, subject, body);
       
       
    
    }
    private static void sendFromGMail(String from, String pass, String[] to, String subject, String body) {
        Properties props = System.getProperties();
        String host = "smtp.gmail.com";
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password", pass);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(from));
            InternetAddress[] toAddress = new InternetAddress[to.length];

            // To get the array of addresses
            for( int i = 0; i < to.length; i++ ) {
                toAddress[i] = new InternetAddress(to[i]);
            }

            for( int i = 0; i < toAddress.length; i++) {
                message.addRecipient(Message.RecipientType.TO, toAddress[i]);
            }

            message.setSubject(subject);
            message.setText(body);
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        }
        catch (AddressException ae) {
            ae.printStackTrace();
        }
        catch (MessagingException me) {
            me.printStackTrace();
        }
    }


    
}
