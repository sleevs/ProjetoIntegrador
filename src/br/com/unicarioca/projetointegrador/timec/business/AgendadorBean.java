package br.com.unicarioca.projetointegrador.timec.business;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;
import javax.ejb.AccessTimeout;
import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.ScheduleExpression;
import javax.ejb.Stateless;
import javax.ejb.Timeout;
import javax.ejb.TimerConfig;
import javax.ejb.TimerService;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import br.com.unicarioca.projetointegrador.timec.model.ExameModel;

/**
 *
* @author Willy 1.0
 * @author jeison  1.1
 *
 * backlog: Push de Notificação por email de Agendamento de Exame 
 * Background:  
 * Scenario: Eu como beneficiário da empresa 
 * desejo receber uma notificação do agendamento 
 * do exame para saber que o exame foi confirmado
*/

@Stateless
public class AgendadorBean  {

	
	@EJB
	ExameBusiness exameBusiness;
	
	
	/**
	 *
	* @author Willy 1.0
	 * @author jeison  1.1
	 *
	 * backlog: Push de Notificação por email de Agendamento de Exame 
	 * Background:  
	 * Scenario: realizar  a chamada do medoto notificarExame() periodicamente
	 * dado : desejo receber uma notificação do agendamento 
	 * do exame para saber que o exame foi confirmado
	*/
	 
	
     @Timeout 
	 @AccessTimeout(value = 20, unit = TimeUnit.MINUTES) 
	 @Schedule(second = "*/1000", hour = "*", minute = "*")
     public void notificarExamesRealizados() {
		  System.out.println("----- INICIALIZAR VARREDURA DE NOTIFICAÇÕES -----");
		  List<ExameModel> examesNotificados =  exameBusiness.noficicarExame();
	        System.out.println( "--------- NÚMERO DE BENEFICIÁRIOS NOTIFICADOS : " + examesNotificados.size());
	        System.out.println("----- ENCERRAR VARREDURA DE NOTIFICAÇÕES -----");
			  
     }

	 
	}


