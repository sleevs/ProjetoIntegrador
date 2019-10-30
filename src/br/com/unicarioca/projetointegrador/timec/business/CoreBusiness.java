package br.com.unicarioca.projetointegrador.timec.business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.unicarioca.projetointegrador.timec.dao.NotificacaoDao;
import br.com.unicarioca.projetointegrador.timec.model.BeneficiarioModel;
import br.com.unicarioca.projetointegrador.timec.model.ExameModel;

@Stateless
public class CoreBusiness {

	@EJB
	ExameBusiness exameBusiness;
	
	@EJB
	BeneficiarioBusiness beneficiarioBusiness;
	
	@EJB
	EmailBusiness emailBusiness;
	
	@EJB
	NotificacaoDao notificacaoDao;
	
	   public List<ExameModel> noficicarExame() {

			  
		   List<ExameModel> listaExames = exameBusiness.listarAgendados();
		   List<ExameModel> examesNotificados = new ArrayList<>();
		   
		   for (ExameModel e : listaExames) {
			   
			   if(!e.getDsNotificacao().equals("ENVIADO")) {
			
				   Integer m = e.getIdBeneficiario();
				   BeneficiarioModel b = beneficiarioBusiness.bucarBeneficiariosPorMatricula(m);
				 
				   emailBusiness.enviarEmail(b.getEmail(), e.getDescricao(), e.getStatus());
				
				   examesNotificados.add(notificacaoDao.atualizar(e));
				   
			   }
				 
		   }
		   
		
		   
		   return examesNotificados;
		  
	    }

}
