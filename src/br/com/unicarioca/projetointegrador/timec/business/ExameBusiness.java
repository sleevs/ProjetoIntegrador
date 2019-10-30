package br.com.unicarioca.projetointegrador.timec.business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.SimpleEmail;

import br.com.unicarioca.projetointegrador.timec.dao.ExameDao;
import br.com.unicarioca.projetointegrador.timec.dao.NotificacaoDao;
import br.com.unicarioca.projetointegrador.timec.model.BeneficiarioModel;
import br.com.unicarioca.projetointegrador.timec.model.ExameModel;


/*autor : jeison muniz
 * backlog: Push de Notificação por email de Agendamento de Exame 
 * Background:  
 * Scenario: Eu como beneficiário da empresa 
 * desejo receber uma notificação do agendamento 
 * do exame para saber que o exame foi confirmado
*/




@Stateless
public class ExameBusiness {
	
	
	@EJB
	NotificacaoDao notificacaoDao;

	@EJB
	ExameDao exameDao ;
	
	@EJB
	BeneficiarioBusiness beneficiarioBusiness;
	
	@EJB
	EmailBusiness emailBusiness;
	
	 /*Enginner: jeison muniz
	 *backlog: 
	 *Background: buscar todos os exames
	 *cenario:   buscar todos os exames
	 

	*/
	
	public List<ExameModel> listar(){
		
		return exameDao.findAll();
		
	}
	
	  /*Enginner: jeison muniz
		 *backlog: 
		 *Background: buscar exames  "Realizado"
		 *cenario:  buscar exames  "Realizado" 
		 

		*/
	
  public List<ExameModel> listarAgendados(){

	   
   return exameDao.localizarExames();
		
	}
  
  /*Enginner: jeison muniz
	 *backlog: 
	 *Background: atualizar o campo ds_notificacao
	 *cenario:  atualizar o campo ds_notificacao 
	  Dado uma entidade  ExameModel

	*/
  public ExameModel atualizarExames(ExameModel e) {
	
	 return  notificacaoDao.atualizar(e);
  }
	
	/*autor: jeison muniz
	 *backlog: 
	 *Background: Push de Notificação por email de Agendamento de Exame 
	 *cenario:  Enviar confirmação do agendamento do exame 
	  Dado que o agendamento do exame foi feito
	  Quando o médico analisar o agendamento e confirmar
	  Então enviar notificação de confirmação do exame 
	*/
	
   
   public List<ExameModel> noficicarExame() {

	  
	   List<ExameModel> listaExames = exameDao.localizarExamesNaoNotificados();
	   List<ExameModel> examesNotificados = new ArrayList<>();
	   
	   for (ExameModel e : listaExames) {
		   
			   Integer m = e.getIdBeneficiario();
			   BeneficiarioModel b = beneficiarioBusiness.bucarBeneficiariosPorMatricula(m);
		 
			   emailBusiness.enviarEmail(b.getEmail(), e.getDescricao(), e.getStatus());
			  
			   e.setDsNotificacao("ENVIADO");  
			   examesNotificados.add(notificacaoDao.atualizar(e));
	
			 
	   }
	 return examesNotificados;
  }
	  
   
   /*Enginner: jeison muniz
 	 *backlog: 
 	 *Background: buscar todos os exames notificados
 	 *cenario:  buscar todos os exames  notificados 
 	 

 	*/
	public List<ExameModel> listarExamesNotificados() {
		return  exameDao.localizarExamesNotificados();
		 
	}
	   
	
	   /*Enginner: jeison muniz
	 	 *backlog: 
	 	 *Background: buscar todos os exames com não notificados
	 	 *cenario:  buscar todos os exames com não notificados 
	 	 

	 	*/
	   
	   public List<ExameModel> listarExamesSemNotificacao() {

		   return exameDao.localizarExamesNaoNotificados();	  
    }

	

}
