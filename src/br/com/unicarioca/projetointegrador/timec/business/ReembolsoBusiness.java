package br.com.unicarioca.projetointegrador.timec.business;

import java.util.Date;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.unicarioca.projetointegrador.timec.dao.ReembolsoDao;
import br.com.unicarioca.projetointegrador.timec.model.ReembolsoModel;


/*Enginner: jeison muniz
 * backlog: GERENCIAR SERVICO DE SOLICITACAI DE REEMBOLSO
 * Background:  
 *cenario: beneficiário da empresa 
 *desejo receber um reembolso do exame para 
 *receber meu dinheiro de volta. 
 
*/



@Stateless
public class ReembolsoBusiness {

	
   @EJB
   ReembolsoDao reembolsoDao;
/*Enginner: jeison muniz
 * backlog: GERENCIAR SERVICO DE SOLICITACAO DE REEMBOLSO
 * Background:  
 *cenario: Pedido de reembolso aceito
*  Dado que o funcionário peça o reembolso
   Quando o pedido for avaliado e aceito
    Então o funcionário deve receber o reembolso 
*/


/*Enginner: jeison muniz
 * backlog: GERENCIAR SERVICO DE SOLICITACAO DE REEMBOLSO
 * Background:  
 * cenario: Pedido de reembolso negado 
*  Dado que o funcionário peça o reembolso  
*   Quando o pedido for avaliado e negado   
*   Então o funcionário deve ter o reembolso negado 
*/
	/*String nome = request.getParameter("nome").toString();
		String email = request.getParameter("email").toString();
		String telefone = request.getParameter("telefone").toString();
		String endereco = request.getParameter("endereco").toString();
		String motivo = request.getParameter("motivo").toString();
		String matricula = request.getParameter("matricula").toString();*/
	public ReembolsoModel soliciaraReembolso (ReembolsoModel r) {
		return reembolsoDao.criarSolicitacaoReembolso(r);
	}
	
	public String solicitacaoDeReembolso (String email,String telefone,String endereco,String motivo , String matricula) {
		Date dataAtutal = new Date();
		ReembolsoModel reembolsoModel = new ReembolsoModel();
		reembolsoModel.setNomeBeneficiario(Integer.valueOf(matricula));
		 reembolsoModel.setLogradouro(endereco); reembolsoModel.setEmail(email);
		 reembolsoModel.setMotivo(motivo); reembolsoModel.setTelefone(telefone);
		 reembolsoModel.setDataReembolso(dataAtutal);
		 reembolsoModel.setStatus("Em Andamento");
		 ReembolsoModel c = reembolsoDao.criarSolicitacaoReembolso(reembolsoModel);
		 return c.toString();
	}
	
	public String  buscarSolicitacaoDeReembolso(int id) {
		ReembolsoModel c = reembolsoDao.find(id);
		return c.toString();
	}

}
