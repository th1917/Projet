package com.javaintermediare;

public class Triangle implements Formes {
	protected int base = 4;
	protected int hauteur = 2;
	
	public Triangle() {
		super();
	}
	@Override
	public double aire() {
		return base*hauteur*0.5;
	}
}
