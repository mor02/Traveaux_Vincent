package com.ejb.banque;

import javax.ejb.Local;

@Local
public interface IServiceCompteLocal {

	public String getEtatComte(String numCpt);
}
