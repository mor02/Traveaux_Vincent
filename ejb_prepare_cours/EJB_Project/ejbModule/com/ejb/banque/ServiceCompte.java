package com.ejb.banque;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class serviceCompte
 */
@Stateless
@LocalBean
public class ServiceCompte implements IServiceCompteLocal {

    /**
     * Default constructor. 
     */
    public ServiceCompte() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String getEtatComte(String numCpt) {
		//TODO logique 
		return "O";
	}

}
