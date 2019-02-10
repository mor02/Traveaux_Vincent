package com.client;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MaServelet2
 */
@WebServlet("/MaServelet2")
public class MaServelet2 extends MaServeletCompte {
	private static final long serialVersionUID = 1L;
     
//	@EJB
//	InitCompte initCompte;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MaServelet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Debut excution MaServlet");
		PrintWriter out = response.getWriter();
		out.write(initCompte.generateNumCompte());
		System.out.println("Fin excution MaServlet");
	}

	

}
