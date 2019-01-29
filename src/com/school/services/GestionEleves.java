package com.school.services;

import com.school.beans.Etablissements;

public interface GestionEleves {

	public static void AjoutEleve(int nombreAjout) {
		int newNombreEleve = Etablissements.getNombreEleve() + nombreAjout;

	}
}
