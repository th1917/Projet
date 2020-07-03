package com.javaintermediare;

public class Interrupteur {
	private boolean position;
	private Lampe lampe;
	
	public Interrupteur(Lampe lampe) {
		this.lampe = lampe;
		this.position = lampe.isEstAllumee();
	}
	
	public boolean isPosition(){
		return position; 	
	}

	public void setPosition(boolean position, Lampe lampe){
		lampe.setEstAllumee(position);
		this.position = lampe.isEstAllumee();
	}
}
