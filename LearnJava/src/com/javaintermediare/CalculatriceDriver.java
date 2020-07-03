package com.javaintermediare;

public class CalculatriceDriver {

	public static void main(String[] args) {
		Calculatrice c = new Calculatrice();
		c.additionner(6,6);
		c.soustraire(2,3,2);
		System.out.println(c.getResultat());
	}

}
