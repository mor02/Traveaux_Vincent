package com.sncf.ejb;

import java.util.List;

import javax.ejb.Local;

import com.sncf.entities.Billet;


@Local
public interface BilletEJBLocal {

	public List<Billet> getListBillet();
	
	public void reserverBillet(Billet billetAReserver);
}
