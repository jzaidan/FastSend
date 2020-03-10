/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
/**
 *
 * @author Jonas
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import view.EnvioEmail;


public class EnviaEmail {
      
    
   
   public void autentication(String remetente,String password ,String destinatarios,String assunto,String corpoEmail){
           
    Properties props = new Properties();
    
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.socketFactory.port", "465");
    props.put("mail.smtp.socketFactory.class",
            "javax.net.ssl.SSLSocketFactory");
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.port", "465");
    
    Session session = Session.getDefaultInstance(props,
        new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(remetente,password);
            }
        });
    
        enviaEmail(session, remetente, destinatarios,assunto, corpoEmail);
    
    
    }
    public void enviaEmail(Session session,String remetente, String destinatarios,String assunto,String corpoEmail ){
        
         try {

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(remetente));
        message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse(destinatarios));
        message.setSubject(assunto);
        message.setText(corpoEmail);

        Transport.send(message);
        JOptionPane.showMessageDialog(null,"Email enviado com sucesso!");
        
       
        

    } catch (MessagingException e) {
        JOptionPane.showMessageDialog(null, "Email não enviado, favor reiniciar a aplicação");
          System.exit(0);
          throw new RuntimeException(e);
          
             
    }
     
    }
   
    
    
   

   
}

