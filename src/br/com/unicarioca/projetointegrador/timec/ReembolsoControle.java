package br.com.unicarioca.projetointegrador.timec.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.unicarioca.projetointegrador.timec.business.ReembolsoBusiness;
import br.com.unicarioca.projetointegrador.timec.model.ReembolsoModel;

/**
 * autor jeison muniz 1.0
 * Servlet implementation class ReembolsoControle
 */
@WebServlet("/ReembolsoControle")
public class ReembolsoControle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	@EJB
	ReembolsoBusiness reembolsoBusiness ;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReembolsoControle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	//	String nome = request.getParameter("name").toString();
	   
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		   HttpSession session = request.getSession();
	         
	
		//ReembolsoModel reembolsoModel = new ReembolsoModel();
		String nome = request.getParameter("nome").toString();
		String email = request.getParameter("email").toString();
		String telefone = request.getParameter("telefone").toString();
		String endereco = request.getParameter("endereco").toString();
		String motivo = request.getParameter("motivo").toString();
		String matricula = request.getParameter("matricula").toString();
		PrintWriter out = response.getWriter();
		
		
		
		String resultado=  reembolsoBusiness.solicitacaoDeReembolso(email, telefone, endereco, motivo, matricula);

		out.println(" DETALHES "+ resultado);
		 session.setAttribute("DETALHES", resultado);
         
		response.sendRedirect("solicitacao.jsp");
	
			
	}

}
