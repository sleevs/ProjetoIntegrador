package br.com.unicarioca.projetointegrador.timec.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.unicarioca.projetointegrador.timec.model.ExameModel;
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

	
	
	public List<ExameModel> localizarExames(){
		String valor = "Realizado";
		
		try {
			Query query = em.createQuery("SELECT e FROM ExameModel e WHERE e.status = :tipo", ExameModel.class)
					.setParameter("tipo", valor);
			return (List<ExameModel>) query.getResultList();
		} catch (Exception e) {

		}

		return null;
	}
	

}
