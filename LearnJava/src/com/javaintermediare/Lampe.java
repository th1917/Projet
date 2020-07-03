package com.javaintermediare;

public class Lampe {
	private boolean estAllumee;
	 
	public Lampe(boolean etat) {
		estAllumee = etat;
	}
	
	public boolean isEstAllumee() {
		return estAllumee;
	}

	public void setEstAllumee(boolean estAllumee) {
		this.estAllumee = !estAllumee;
	}

	

}
