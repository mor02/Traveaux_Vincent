package com.banque.services;

import java.util.List;
import java.util.Scanner;

import com.banque.beans.Compte;

public interface IServiceCompte {

	public Compte saisirCompte(Scanner scInfos); 
	
	public void saisirUnVersement(Scanner sc,List<Compte> comptesBanquairesBdd);
}
