package com.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class ServiceCompte
 */
@Stateless
@LocalBean
public class ServiceCompte implements IServiceCompteLocal,IServiceCompteRemote {

    /**
     * Default constructor. 
     */
    public ServiceCompte() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String getDetailsComptes(String numCompte) {
		return "Ce service est en cours de construction";
	}

	public double getSolde(String numCompte) {
		return 100;
	}
}
