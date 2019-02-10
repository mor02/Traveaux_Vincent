package com.ejb.banque;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class BanqueEJB
 */
@Stateless
@LocalBean
public class BanqueEJB {

    /**
     * Default constructor. 
     */
    public BanqueEJB() {
        // TODO Auto-generated constructor stub
    }
    
    public String informationBanque() {
    	return "BNP Paribas";
    }

}
