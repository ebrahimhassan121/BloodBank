/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_servlate;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author ahmed
 */
public class SendPassword {
     public static void sendEmail(String host, String port,
            final String userName, final String password, String toAddress,
            String usernames,int passwords) throws AddressException,
            MessagingException,
            UnsupportedEncodingException {
 String massege="مرحبًا "+usernames+"،\n" +
"\n" +
"لقد تلقينا طلبًا لإعادة تعيين كلمة السر الخاصة بك على  موقعنا (بنك الدم).\n" +
"\n" +
 
"\n" +
"    إدخال رمز إعادة تعيين كلمة السر:\n" +
""+passwords+"\n" ;


String subject=" "+passwords+"  هو رمز استرداد حسابك على بنك الدم ";
        // sets SMTP server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
 
        // creates a new session with an authenticator
        Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName, password);
            }
        };
 
        Session session = Session.getInstance(properties, auth);
 
        // creates a new e-mail message
        Message msg = new MimeMessage(session);
 
        msg.setFrom(new InternetAddress(userName));
 
        InternetAddress[] toAddresses = { new InternetAddress(toAddress) };
        msg.setRecipients(Message.RecipientType.TO, toAddresses);
         msg.setSentDate(new Date());
        msg.setText(massege);
 
        
 msg.setContent(massege, "text/plain; charset=UTF-8");
        // sends the e-mail
        Transport.send(msg);
 
    }
     public static void main(String[] args) throws MessagingException, AddressException, UnsupportedEncodingException {
            SendPassword sendPassword = new SendPassword();
            sendPassword.sendEmail("smtp.gmail.com", "587","bloodbank951@gmail.com", "1234zxcv", "ahmed.salama.fci2015@gmail.com", "sss", 11);

            
            
    }
}
 
