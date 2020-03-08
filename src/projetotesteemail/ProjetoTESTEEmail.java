/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetotesteemail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class ProjetoTESTEEmail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
                return new PasswordAuthentication("jzgjogos@gmail.com","miragemegatron");
            }
        });

    try {

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("jzgjogos@gmail.com"));
        message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse("jonaszaidan@hotmail.com"));
        message.setSubject("Testando o assunto net beans");
        message.setText("aqui é o corpo do email," +
                "\n\n No spam to my email, please!");

        Transport.send(message);

        System.out.println("sucessfull vamos ver");

    } catch (MessagingException e) {
        throw new RuntimeException(e);
    }
        
        
        // TODO code application logic here
    }
    
}
