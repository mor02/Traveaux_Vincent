package com.ejb.banque;

import javax.ejb.Remote;

@Remote
public interface IServiceInternationalEJBRemote {

	public int getTauxEchangeEurDhMarocain();
}
