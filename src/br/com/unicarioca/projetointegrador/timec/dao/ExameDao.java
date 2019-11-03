package br.com.unicarioca.projetointegrador.timec.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import br.com.unicarioca.projetointegrador.timec.model.ExameModel;
import br.com.unicarioca.projetointegrador.timec.model.ReembolsoModel;


/*autor: jeison muniz 1.0
 * backlog: 
 * Background: acesso a banco de dados  
 * Scenario: 
* Given:
  Then:
   And:
*/
@Stateless
public class ExameDao extends AbstractFacade<ExameModel> {

	@PersistenceContext(unitName = "ProjetoIntegradorPU")
	private EntityManager em;

	
	
	public ExameDao() {
		super(ExameModel.class);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}

	

/*enginner: jeison muniz
 * backlog: Push de Notificação por email de Agendamento de Exame
 * Background:  ExameBusiness
 * Scenario: buscar todos os exames com sn_status "Agendado"

*/
	
	
	public List<ExameModel> localizarExames(){
		String valor = "Agendado";
		
		try {
			Query query = em.createQuery("SELECT e FROM ExameModel e WHERE e.status = :tipo", ExameModel.class)
					.setParameter("tipo", valor);
			return (List<ExameModel>) query.getResultList();
		} catch (Exception e) {

		}

		return null;
	}
	
	

/*enginner: jeison muniz
 * backlog: Push de Notificação por email de Agendamento de Exame
 * Background:  ExameBusiness
 * Scenario: buscar todos os exames com ds_notificacao "Enviado"

*/
	public List<ExameModel> localizarExamesNotificados(){
		String valor = "Enviado";
		
		try {
			Query query = em.createQuery("SELECT e FROM ExameModel e WHERE e.dsNotificacao = :tipo", ExameModel.class)
					.setParameter("tipo", valor);
			return (List<ExameModel>) query.getResultList();
		} catch (Exception e) {

		}

		return null;
	}
	
	

/*enginner: jeison muniz
 * backlog: Push de Notificação por email de Agendamento de Exame
 * Background:  ExameBusiness
 * Scenario: buscar todos os exames com 
 * ds_notificacao "PROCESSANDO" e sn_status "Agendado"

*/
	public List<ExameModel> localizarExamesNaoNotificados(){
		String notificacaoExame = "PROCESSANDO";
		String statusExame = "Agendado";
		
		try {
			Query query = em.createQuery("SELECT e FROM ExameModel e WHERE e.dsNotificacao = :nt AND e.status = :st", ExameModel.class)
					.setParameter("nt", notificacaoExame)
			        .setParameter("st", statusExame);
			return (List<ExameModel>) query.getResultList();
		} catch (Exception e) {

		}

		return null;
	}

}
