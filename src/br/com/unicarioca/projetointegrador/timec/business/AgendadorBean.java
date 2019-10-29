package br.com.unicarioca.projetointegrador.timec.business;

import java.util.List;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.ScheduleExpression;
import javax.ejb.Stateless;
import javax.ejb.TimerConfig;
import javax.ejb.TimerService;

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
	
	
	
	 public void teste() {
	        System.out.println("agendado pela anotacao @Schedule");
	    }

	 @Schedule(second = "*/10", hour = "*", minute = "*")
	 public void notificarExamesRealizados() {
		  System.out.println("INICIALIZAR VARREDURA DE NOTIFICAÇÃO");
		  List<ExameModel> examesNotificados =  exameBusiness.noficicarExame();
	        System.out.println( " EXAMES NOTIFICADOS : " + examesNotificados.size());
	    }

	 
	}


