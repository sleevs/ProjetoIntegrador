package br.com.unicarioca.projetointegrador.timec.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public class ProjetoIntegradorWebService {
	
	@WebMethod
	public String teste() {
		// TODO Auto-generated method stub
		return "TIME C -TESTE DO SERVICE - SOLICIR REEMBOLSO";
	}
	


}
