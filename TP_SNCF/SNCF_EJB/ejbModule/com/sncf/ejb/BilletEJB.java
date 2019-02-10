package com.sncf.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.sncf.entities.Billet;

/**
 * Session Bean implementation class BilletEJB
 */
@Stateless
@LocalBean
public class BilletEJB implements BilletEJBLocal {

    /**
     * Default constructor. 
     */
    public BilletEJB() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<Billet> getListBillet() {
		// TODO logic
		Billet b1 = new Billet("Paris", "Nice", 50.00);
		Billet b2 = new Billet("Paris", "Brest", 50.00);
		Billet b3 = new Billet("Paris", "Lyon", 50.00);
		Billet b4 = new Billet("Paris", "Bordeaux", 50.00);
		Billet b5 = new Billet("Paris", "Ajaccio", 50.00);
		Billet b6 = new Billet("Paris", "Lille", 50.00);
		Billet b7 = new Billet("Paris", "Bastia", 50.00);
		
		List<Billet> listeBillets = new ArrayList<Billet>();
		listeBillets.add(b1);
		listeBillets.add(b2);
		listeBillets.add(b3);
		listeBillets.add(b4);
		listeBillets.add(b5);
		listeBillets.add(b6);
		listeBillets.add(b7);

		return listeBillets;
	}

	@Override
	public void reserverBillet(Billet billetAReserver) {
		//TODO LOGIC
		
	}

}
