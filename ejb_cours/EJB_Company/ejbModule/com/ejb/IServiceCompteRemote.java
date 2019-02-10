package com.ejb;

import javax.ejb.Remote;

@Remote
public interface IServiceCompteRemote {

	
	public double getSolde(String numCompte);
}
