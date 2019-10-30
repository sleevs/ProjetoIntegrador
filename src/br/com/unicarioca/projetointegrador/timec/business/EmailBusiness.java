package br.com.unicarioca.projetointegrador.timec.business;



import javax.ejb.Stateless;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.*;

import java.util.Properties;

/*autor: jeison muniz 1.0
 * backlog: GERENCIAR envio de email
 * Background:  
 * cenario: classe responsavel por gerenciar o envio de email
*  Dado que  emaildestino , descricao ,assunto

*/


@Stateless
public class EmailBusiness  {


	
	
	
	
	/*autor: jeison muniz 1.0
	 * backlog: gerenciar envio de email
	 * Background:  
	 * cenario: metodo responsavel de envio de email
	* 
	*/

	public void enviarEmail(String emailDestino, String descricao, String assunto) {

		
	      String host="smtp.gmail.com";  
		  final String user="email";
		  final String password="senha";  
		    
		  String to= emailDestino;
		  
		   //cria uma objet de sessao  
		   Properties props = new Properties();  
		   props.put("mail.smtp.host",host);  
		   props.put("mail.smtp.auth", "true");  
		   props.put("mail.smtp.port", "465"); 
		   props.put("mail.smtp.socketFactory.port", "465");
		   props.put("mail.smtp.starttls.enable","true");
		   props.put("mail.smtp.socketFactory.fallback", "false");
		   props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		     
		
		   Session session = Session.getInstance(props,  
		    new javax.mail.Authenticator() {  
		      protected PasswordAuthentication getPasswordAuthentication() {  
		    return new PasswordAuthentication(user,password);  
		      }  
		    });  
		  
		   //construi a mensagem  
		    try {  
		     MimeMessage message = new MimeMessage(session);  
		     message.setFrom(new InternetAddress(user));  
		     message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
		     message.setSubject(assunto);  
		     message.setText(descricao); 
		     
		       
		    //envia mensagem  
		     Transport.send(message);  
		  
		     System.out.println("------- MENSAGEM ENVIADa COM SUCESSO -------");  
		   
		     } catch (MessagingException e) {e.printStackTrace();}
		
		
		 
		
	}

}
