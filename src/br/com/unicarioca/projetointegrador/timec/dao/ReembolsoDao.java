package br.com.unicarioca.projetointegrador.timec.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.unicarioca.projetointegrador.timec.model.ReembolsoModel;


/*enginner: jeison muniz
 * backlog: 
 * Background:  
 * Scenario: 
* Given:
  Then:
   And:
*/

@Stateless
public class ReembolsoDao extends AbstractFacade<ReembolsoModel> {

	@PersistenceContext(unitName = "ProjetoIntegradorPU")
	private EntityManager em;

	
	
	public ReembolsoDao() {
		super(ReembolsoModel.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}

	
	
	public ReembolsoModel criarSolicitacaoReembolso(ReembolsoModel r){
		em.persist(r);
		em.flush();
		return em.find(ReembolsoModel.class, r.getReembolsoId());
	}
}
