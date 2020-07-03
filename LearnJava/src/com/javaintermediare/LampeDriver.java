package com.javaintermediare;

public class LampeDriver {

	public static void main(String[] args) {
		Lampe lp1 = new Lampe(false);
		Interrupteur interrupteur = new Interrupteur(lp1);

		System.out.println(lp1.isEstAllumee());
		System.out.println(interrupteur.isPosition());
		
		interrupteur.setPosition(lp1.isEstAllumee(), lp1);
		
		System.out.println(lp1.isEstAllumee());
		System.out.println(interrupteur.isPosition());

		interrupteur.setPosition(lp1.isEstAllumee(), lp1);
		
		System.out.println(lp1.isEstAllumee());
		System.out.println(interrupteur.isPosition());

//		System.out.println(lp1.isEstAllumee());
	}

}
