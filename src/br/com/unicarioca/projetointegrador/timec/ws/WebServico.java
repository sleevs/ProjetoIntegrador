package br.com.unicarioca.projetointegrador.timec.ws;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import br.com.unicarioca.projetointegrador.timec.business.BeneficiarioBusiness;
import br.com.unicarioca.projetointegrador.timec.business.CoreBusiness;
import br.com.unicarioca.projetointegrador.timec.business.EmailBusiness;
import br.com.unicarioca.projetointegrador.timec.business.ExameBusiness;
import br.com.unicarioca.projetointegrador.timec.model.BeneficiarioModel;
import br.com.unicarioca.projetointegrador.timec.model.ExameModel;

/*
 * UNICARIOCA
 * autor jeison muniz
 * TIME C - PROJETO INTEGRADOR - BDD
 * 
 * Background:
 * Scenario:
 * Given:
 * And:
 * But:
 * When:
 * then: */
 
/*Background:DEPLOY JAVA APPLICATION SSH NO SERVIDOR GOOGLE
 * Scenario:DEPLOY 
 * Given: PROTOTIPO.WAR 
 * And: VM UBUNTU 
 * then:  SERVIDOR GOOGLE */

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public class WebServico {

	@EJB
	EmailBusiness emailBusiness;
	
	@EJB
	CoreBusiness coreBusiness;
	
	@EJB
	BeneficiarioBusiness beneficiarioBusiness ;

	@EJB
	ExameBusiness notificacaoExame ;
	

	@EJB
	ExameBusiness exameBusiness;
	
	/* * Background:
 * Scenario:
 * Given:
 * And:
 * But:
 * When:
 * then: */
	
	@WebMethod
	public String teste() {
		// TODO Auto-generated method stub
		return "TIME C -TESTE DO SERVICE - SOLICIR REEMBOLSO";
	}
	
	
	/* * Background:
 * Scenario:
 * Given:
 * And:
 * But:
 * When:
 * then: */
	
	@WebMethod
	public List<BeneficiarioModel> buscarTodosBeneficiarios() {
		// TODO Auto-generated method stub
		return beneficiarioBusiness.listarBeneficiarios();
	}
	
	@WebMethod
	public List<BeneficiarioModel> buscarBeneficiariosPorMatricula(List<Integer> lista) {
		// TODO Auto-generated method stub
		return beneficiarioBusiness.listarBeneficiariosPorMatricula(lista);
	}
	
	/* * Background:
 * Scenario:
 * Given:
 * And:
 * But:
 * When:
 * then: */
	
	@WebMethod
	public List<ExameModel> buscarTodos() {
		// TODO Auto-generated method stub
		return notificacaoExame.listar();
	}
	
	@WebMethod
	public ExameModel atualizarExame(ExameModel e) {
		// TODO Auto-generated method stub
		return exameBusiness.atualizarExames(e);
	}
	
	
	@WebMethod
	public List<ExameModel> buscarTodosNaoNotificados() {
		// TODO Auto-generated method stub
		return notificacaoExame.listarExamesSemNotificacao();
	}
	@WebMethod
	public List<ExameModel> buscarTodosAgendamentos() {
		// TODO Auto-generated method stub
		return notificacaoExame.listarAgendados();
	}
	
	@WebMethod
	public List<ExameModel> buscarExamesProntos() {
		// TODO Auto-generated method stub
		return exameBusiness.listarExamesNotificados();
	}
	
	@WebMethod
	public String notificarExame() {
		 System.out.println("INICIALIZAR VARREDURA DE NOTIFICAÇÃO");
		  List<ExameModel> examesNotificados =  exameBusiness.noficicarExame();
		  String resultado = " EXAMES NOTIFICADOS : " + examesNotificados.size();
	      
		return resultado;
	}
	 
	
	@WebMethod
	public void enviarEmail(String emailDestino,String descricao, String assunto) {
	//	emailBusiness = new EmailBusiness();
		emailBusiness.enviarEmail(emailDestino, descricao, assunto);
		
	}
	
}
	