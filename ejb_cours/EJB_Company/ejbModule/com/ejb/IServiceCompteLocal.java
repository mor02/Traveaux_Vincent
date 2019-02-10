package com.ejb;

import javax.ejb.Local;

@Local
public interface IServiceCompteLocal {

	public String getDetailsComptes(String numCompte);
	
	//public double getSolde(String numCompte);
}
