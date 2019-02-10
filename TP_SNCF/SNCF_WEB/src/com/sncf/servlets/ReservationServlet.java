package com.sncf.servlets;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sncf.ejb.BilletEJB;
import com.sncf.entities.Billet;

/**
 * Servlet implementation class ReservationServlet
 */
@WebServlet(name = "ReservationServlet", urlPatterns = { "/ReservationServlet" })
public class ReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@EJB
	BilletEJB billetEJB;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReservationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Billet> listeBillets = billetEJB.getListBillet();
		request.setAttribute("listeBillets", listeBillets);
		//Exemple pour récupérer un champ de la jsp
		//ETAPE 1.1 : Récupération des infos du client
		//String name = request.getParameter("name");
		
		//ETAPE1.2 : Construction d'un client (la classe ...)
		
		//ETAPE 2.1 : Récupération du numero du billet (Modif JSP + modif url pour passage de parametre)
		
		//ETAPE 2.2 : Appel de la méthode EJB pour confirmer la reservation
		request.getRequestDispatcher("listeBillets.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
