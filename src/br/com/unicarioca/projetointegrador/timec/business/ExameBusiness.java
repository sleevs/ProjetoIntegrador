package br.com.unicarioca.projetointegrador.timec.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.SimpleEmail;

import br.com.unicarioca.projetointegrador.timec.dao.ExameDao;
import br.com.unicarioca.projetointegrador.timec.model.BeneficiarioModel;
import br.com.unicarioca.projetointegrador.timec.model.ExameModel;


/*Enginner: jeison muniz
 * backlog: Push de Notifica��o por email de Agendamento de Exame 
 * Background:  
 * Scenario: Eu como benefici�rio da empresa 
 * desejo receber uma notifica��o do agendamento 
 * do exame para saber que o exame foi confirmado
*/




@Stateless
public class ExameBusiness {

	@EJB
	ExameDao exameDao ;
	
	
//	@EJB
//	EmailBusiness emailBusiness;
	
	
	public List<ExameModel> listar(){
		
		return exameDao.findAll();
		
	}
	
	
  public List<ExameModel> listarAgendados(){

	  List<ExameModel> listaExames = exameDao.localizarExames();
	  List<BeneficiarioModel> lisBeneficiarios ;
	  
	/*
	 *   for(int i = 0 ; i <= listaExames.size() ; i++){
		  listaExames.get(i).getIdBeneficiario();
		  
		  
	  }
	 * */
	  
   return exameDao.localizarExames();
		
	}
	
	/*Enginner: jeison muniz
	 *backlog: 
	 *Background: Push de Notifica��o por email de Agendamento de Exame 
	 *cenario:  Enviar confirma��o do agendamento do exame 
	  Dado que o agendamento do exame foi feito
	  Quando o m�dico analisar o agendamento e confirmar
	  Ent�o enviar notifica��o de confirma��o do exame 
	*/
	
   public void noficicarExame() {
/*
	   String meuEmail = "jsnprogramer@gmail.com";
		String senha = "Guitarra$13";
		SimpleEmail email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator(meuEmail, senha));
		email.setSSLOnConnect(true);
		
		try {
			email.setFrom(meuEmail);
			email.setSubject("TREINO EMAIL GOOGLE");
			email.setMsg("Desenvolvedor Jeison Muniz ALUNO UNICARIOCA TESTE DE SERVI�O EMAIL UTILIZANDO SERVIDOR smtp.gmail.com da Google");
		    email.addTo(meuEmail);
			email.send();
		}catch(Exception e) {
			
		}
		*/
	  
    }
	
	/* Enginner: jeison muniz
	 * backlog: 
	 * Background: Push de Notifica��o por email de Agendamento de Exame 
	 * cenario:   Enviar cancelamento do exame 
	 * Dado que o agendamento do exame foi feito
	 * Quando m�dico analisar o agendamento e n�o aceitar
	 * Ent�o enviar notifica��o de cancelamento do exame
	*/
	
	

}
