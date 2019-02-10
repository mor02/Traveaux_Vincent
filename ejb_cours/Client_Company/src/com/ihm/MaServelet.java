package com.ihm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ejb.IServiceCompteLocal;
import com.ejb.IServiceCompteRemote;

/**
 * Servlet implementation class MaServelet
 */
@WebServlet("/MaServelet")
public class MaServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   //Injection
	@EJB
	IServiceCompteLocal ejbServiceCompte;
	
	@EJB
	IServiceCompteRemote ejbServiceCompteRemote;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MaServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Debut DoGet");
		PrintWriter out = response.getWriter();
		out.println("<h1>"+ejbServiceCompte.getDetailsComptes("Fr00")+"</h1>");
		
		
		Context context = null;
		IServiceCompteRemote helloService = null;
		try {
			context = new InitialContext();
			helloService = (IServiceCompteRemote) context.lookup("java:global/EAR_Compant/EJB_Company/ServiceCompte!com.ejb.ServiceCompte");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		out.println("<h1>"+helloService.getSolde("Fr00")+"</h1>");
		System.out.println("Fin DoGet");
	}

	
	

}
