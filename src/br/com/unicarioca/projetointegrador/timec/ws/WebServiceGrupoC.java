package br.com.unicarioca.projetointegrador.timec.ws;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import br.com.unicarioca.projetointegrador.timec.business.BeneficiarioBusiness;
import br.com.unicarioca.projetointegrador.timec.business.ExameBusiness;
import br.com.unicarioca.projetointegrador.timec.model.BeneficiarioModel;
import br.com.unicarioca.projetointegrador.timec.model.ExameModel;

/*
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
public class WebServiceGrupoC {

	
	@EJB
	BeneficiarioBusiness beneficiarioBusiness ;

	@EJB
	ExameBusiness notificacaoExame ;
	
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
	public List<ExameModel> buscarTodosAgendamentos() {
		// TODO Auto-generated method stub
		return notificacaoExame.listarAgendados();
	}
}
	