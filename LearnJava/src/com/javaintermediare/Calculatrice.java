package com.javaintermediare;

public class Calculatrice {
	
	private double resultat;
	
	public void additionner(double... nombres){
		effectuer('+', nombres);	
	}

	public void soustraire(double... nombres){
		effectuer('-', nombres);	
	}

	private void effectuer(char symbole, double... nombres) {
		for(double d : nombres){
			calculer(symbole, d);	
		}
	}

	private void calculer(char symbole, double d) {
		switch (symbole){
		case '+':
			resultat += d;
			break;
		case '-':
			resultat -= d;
			break;
		}
	}
	
	public double getResultat() {
		return resultat;
	}

	public void setResultat(double resultat) {
		this.resultat = resultat;
	}
	
}
