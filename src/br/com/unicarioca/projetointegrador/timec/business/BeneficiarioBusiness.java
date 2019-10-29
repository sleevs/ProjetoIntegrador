package br.com.unicarioca.projetointegrador.timec.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.unicarioca.projetointegrador.timec.dao.BeneficiarioDao;
import br.com.unicarioca.projetointegrador.timec.model.BeneficiarioModel;

@Stateless
public class BeneficiarioBusiness {

	@EJB
	BeneficiarioDao beneficiarioDao;
	
	
	List<BeneficiarioModel> lista ;
	
	
	
	
	public List<BeneficiarioModel> listarBeneficiarios(){
		
		
		return beneficiarioDao.findAll();
		
	}
	
    public List<BeneficiarioModel> listarBeneficiariosPorMatricula(List<Integer> lista){
		
		
		return beneficiarioDao.buscarBeneficiario(lista);
		
	}
	
}
