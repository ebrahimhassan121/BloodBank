/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahmed;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.internet.*;
import javax.ejb.Stateless;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author ahmed
 */
@Stateless
public class MailSenderBean {

    public void send(String to, String username, int passwords) {
        String massege = "مرحبًا " + username + "،\n"
                + "\n"
                + "لقد تلقينا طلبًا لإعادة تعيين كلمة السر الخاصة بك على  موقعنا (بنك الدم).\n"
                + "\n"
                + "\n"
                + "    إدخال رمز إعادة تعيين كلمة السر:\n"
                + "" + passwords + "\n";

        String subject = " " + passwords + "  هو رمز استرداد حسابك على بنك الدم ";

//Get properties object    
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");

        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.fallback", "false");

        //get Session   
        Session sessions = Session.getInstance(props, null);
        sessions.setDebug(true);
        //compose message    
        try {
            MimeMessage message = new MimeMessage(sessions);
            message.setFrom(new InternetAddress("bloodbank951@gmail.com"));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setContent(massege, "text/html");
            message.setSubject(subject);

            //send message 
            Transport transport=sessions.getTransport("smtp");
            transport.connect("smtp.gmail.com","blood bank","1234zxcv");
            
            Transport.send(message,message.getAllRecipients());
            System.out.println("message sent successfully");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }

    }
    
}
class SendMailSSL{    

    MailSenderBean mailSenderBean = lookupMailSenderBeanBean();
 public static void main(String[] args) {    
     //from,password,to,subject,message 
        MailSenderBean bean=new MailSenderBean();
             bean.send("ahmed.salama.fci2015@gmail.com" , "ahmed salama", 234567);

       
//bloodbank951@gmail.com
      
     //change from, password and to  
 }    

    private MailSenderBean lookupMailSenderBeanBean() {
        try {
            Context c = new InitialContext();
            return (MailSenderBean) c.lookup("java:global/blood_bank_v1.2/MailSenderBean!com.ahmed.MailSenderBean");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

}