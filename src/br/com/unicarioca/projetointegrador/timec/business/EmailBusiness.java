package br.com.unicarioca.projetointegrador.timec.business;

import java.io.Serializable;

import javax.ejb.Stateless;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.SimpleEmail;


public class EmailBusiness  {


	/*
	public void enviarEmail(String emailDestino) {
		
		String meuEmail = "jsnprogramer@gmail.com";
		String senha = "Guitarra$13";
		SimpleEmail email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator(meuEmail, senha));
		email.setSSLOnConnect(true);
		
		try {
			email.setFrom(emailDestino);
			email.setSubject("TREINO EMAIL GOOGLE");
			email.setMsg("Desenvolvedor Jeison Muniz ALUNO UNICARIOCA TESTE DE SERVIÇO EMAIL UTILIZANDO SERVIDOR smtp.gmail.com da Google");
		    email.addTo(emailDestino);
			email.send();
		}catch(Exception e) {
			
		}
		
		
	}
*/
}
