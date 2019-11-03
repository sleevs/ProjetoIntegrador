package br.com.unicarioca.projetointegrador.timec.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.unicarioca.projetointegrador.timec.model.ExameModel;

@Stateless
public class NotificacaoDao {

	@PersistenceContext(unitName = "ProjetoIntegradorPU")
	private EntityManager em;

	
	
	public NotificacaoDao() {
	
		// TODO Auto-generated constructor stub
	}
	

	
	public EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}

	
	
	/* * Background:
 * Scenario: atualizar a tabela exame moedificar o campo ds_notificacao
 * Given: entidaade ExameModel
 * then:  atualizar a tabela exame moedificar o campo ds_notificacao*/
	
	public ExameModel atualizar(ExameModel e) {

		try {
			ExameModel exame = em.find(ExameModel.class, e.getExameId());
			exame.setDsNotificacao(e.getDsNotificacao());
			em.merge(exame);
			em.flush();
			return em.find(ExameModel.class, exame.getExameId());
		} catch (Exception exp) {

		}
		return null;
	}
	
	
	
	
	

}
