package br.com.unicarioca.projetointegrador.timec.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.unicarioca.projetointegrador.timec.model.BeneficiarioModel;
import br.com.unicarioca.projetointegrador.timec.model.ExameModel;


@Stateless
public class BeneficiarioDao extends AbstractFacade<BeneficiarioModel> {

	@PersistenceContext(unitName = "ProjetoIntegradorPU")
	private EntityManager em;

	
	
	public BeneficiarioDao() {
		super(BeneficiarioModel.class);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}



	
	public List<BeneficiarioModel> buscarBeneficiario(List<Integer> listaBeneficiario) {
		
		try {

			List<BeneficiarioModel> listaResultado = new ArrayList<>();

				for (Integer matricula : listaBeneficiario) {
		
					//Integer valor = matricula;

					
					Query query = em.createQuery("SELECT b FROM beneficiario b WHERE b.numeroMatricula = :tipo", BeneficiarioModel.class)
							.setParameter("tipo", matricula);
					BeneficiarioModel b = (BeneficiarioModel) query.getSingleResult();
					listaResultado.add(b);
				}
		
				return listaResultado;
			} catch (Exception e) {
			}

			return null;
		
	}
	
}
