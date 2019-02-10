package com.ejb.banque;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class ServiceInternationalEJB
 */
@Stateless
@LocalBean
public class ServiceInternationalEJB implements IServiceInternationalEJBRemote {

    /**
     * Default constructor. 
     */
    public ServiceInternationalEJB() {
        // TODO Auto-generated constructor stub
    }

    public int getTauxEchangeEurDhMarocain() {
    	
    	return 10;
    }
}
