package com.client;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.banque.InitCompte;
import com.ejb.banque.BanqueEJB;
import com.ejb.banque.IServiceCompteLocal;
import com.ejb.banque.IServiceInternationalEJBRemote;

/**
 * Servlet implementation class MaServlet
 */
@WebServlet("/MaServlet")
public class MaServlet extends MaServeletCompte {
	private static final long serialVersionUID = 1L;
    
	@EJB
	BanqueEJB banqueEjb;
	
	@EJB
	IServiceCompteLocal serviceCpt;
	
	@EJB
	IServiceInternationalEJBRemote serviceInternation;
//	@EJB
//	InitCompte initCompte;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Debut excution MaServlet");
		PrintWriter out = response.getWriter();
		out.write(banqueEjb.informationBanque());
		out.write("\n");
		out.write(serviceCpt.getEtatComte("FR00000"));
		out.write("\n");
		out.write(serviceInternation.getTauxEchangeEurDhMarocain());
		initCompte.saisirNom("amine");
		out.write(initCompte.generateNumCompte());
		System.out.println("Fin excution MaServlet");
	}

	
}
