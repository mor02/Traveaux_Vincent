package com.school.tests;


import com.school.beans.*;

public class Test {

	public static void main(String[] args) {
		
		
		
		Colleges school1 = new Colleges("Nazareth", false, "CE1", 3, 100);
		
		school1.AjoutEleve(6);
		
		//school1.AjoutEleve(2);
		
		//school1.AjoutEleve(2);
		
		// 1h25 de la première vidéo
		// abstract + interfaces/extends
		
		System.out.println(school1.toString());

	}

}
