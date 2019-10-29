package main.java;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.SimpleEmail;

public class TesteEmail {
	
	
	public static void main(String args[]) {
	
	String meuEmail = "jsnprogramer@gmail.com";
	String senha = "Guitarra$13";
	SimpleEmail email = new SimpleEmail();
	email.setHostName("smtp.gmail.com");
	email.setSmtpPort(465);
	email.setAuthenticator(new DefaultAuthenticator(meuEmail, senha));
	email.setSSLOnConnect(true);
	
	try {
		email.setFrom("jsn_13_13@hotmail.com");
		email.setSubject("TREINO EMAIL GOOGLE");
		email.setMsg("Desenvolvedor Jeison Muniz ALUNO UNICARIOCA TESTE DE SERVIÇO EMAIL UTILIZANDO SERVIDOR smtp.gmail.com da Google");
	    email.addTo("jsn_13_13@hotmail.com");
		email.send();
	}catch(Exception e) {
		
	}
	
	}

}
