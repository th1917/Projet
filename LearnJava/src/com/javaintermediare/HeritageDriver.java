package com.javaintermediare;

public class HeritageDriver {

	public static void main(String[] args) {
		Formes[] tab = new Formes[3];
		tab[0] = new Carre("toto",5);
		tab[1] = new Cercle();
		tab[2] = new Triangle();
		
		for(Formes forme : tab) {
			System.out.println(forme.aire());
		}
		
	}
}
