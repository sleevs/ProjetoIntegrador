package br.com.projetointegrador.ws;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

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


@WebService
@SOAPBinding(style = Style.DOCUMENT)
public class WebServiceTeste {

	
	/*Background:DEPLOY JAVA APPLICATION SSH NO SERVIDOR GOOGLE
	 * Scenario:DEPLOY 
	 * Given: PROTOTIPO.WAR 
	 * And: VM UBUNTU 
	 * then:  SERVIDOR GOOGLE */
	
	@WebMethod
	public String teste() {
		// TODO Auto-generated method stub
		return "TIME C -TESTE DO SERVICE - SOLICIR REEMBOLSO";
	}
}
	