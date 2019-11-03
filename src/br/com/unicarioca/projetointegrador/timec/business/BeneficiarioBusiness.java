package br.com.unicarioca.projetointegrador.timec.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.unicarioca.projetointegrador.timec.dao.BeneficiarioDao;
import br.com.unicarioca.projetointegrador.timec.model.BeneficiarioModel;


/*autor: jeison muniz 1.0
 * backlog: GERENCIAR DADOS DO BENEFICIARIO
 * Background:  
 * cenario: classe responsavel por gerenciar os dados do beneficiario
* 

*/


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
    
    
    
public BeneficiarioModel bucarBeneficiariosPorMatricula(Integer b){
		
		
		return beneficiarioDao.find(b);
		
	}
	
}
