package main.java;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class TesteEmail {
	
	
	public static void main(String args[]) {
	
	String meuEmail = "jsnprogramer@gmail.com";
	String senha = "Guitarra$13";
	String emailDestino ;
	String descricao = "TESTE COMM JAVAX.EMAIL" ;
	String assunto = "TESTE COMM JAVAX.EMAIL";
	
	/*
	SimpleEmail email = new SimpleEmail();
	email.setHostName("smtp.gmail.com");
	email.setSmtpPort(465);
	email.setAuthenticator(new DefaultAuthenticator(meuEmail, senha));
	email.setSSLOnConnect(true);
	
	try {
		email.setFrom("jsnprogramer@gmail.com");
		email.setSubject("TREINO EMAIL GOOGLE");
		email.setMsg("Desenvolvedor Jeison Muniz ALUNO UNICARIOCA TESTE DE SERVIÇO EMAIL UTILIZANDO SERVIDOR smtp.gmail.com da Google");
	    email.addTo("jsn_13_13@hotmail.com");
		email.send();
	}catch(Exception e) {
		
	}
	*/
	
	/*
	String host="smtp.gmail.com";  
	  final String user="jsnprogramer@gmail.com";//change accordingly  
	  final String password="Guitarra$13";//change accordingly  
	    
	  String to= "jsnprogramer@gmail.com";//change accordingly  
	  
	   //Get the session object  
	   Properties props = new Properties();  
	   props.put("mail.smtp.host",host);  
	   props.put("mail.smtp.auth", "true");  
	   props.put("mail.smtp.port", "465"); 
	   props.put("mail.smtp.socketFactory.port", "465");
	   props.put("mail.smtp.starttls.enable","true");
	   props.put("mail.smtp.socketFactory.fallback", "false");
	   props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
	     
	   Session session = Session.getDefaultInstance(props,  
	    new javax.mail.Authenticator() {  
	      protected PasswordAuthentication getPasswordAuthentication() {  
	    return new PasswordAuthentication(user,password);  
	      }  
	    });  
	  
	   //Compose the message  
	    try {  
	     MimeMessage message = new MimeMessage(session);  
	     message.setFrom(new InternetAddress(user));  
	     message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
	     message.setSubject(assunto);  
	     message.setText(descricao); 
	     
	       
	    //send the message  
	     Transport.send(message);  
	  
	     System.out.println("MENSAGGEM ENVIAAD COM SUCESSO...");  
	   
	     } catch (MessagingException e) {e.printStackTrace();}
	
	
	
	
	*/
	
	
	
	
	
	
	}

}
