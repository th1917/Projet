package com.javaintermediare;

public class Cercle implements Formes {
	protected int rayon = 4;
	@Override
	public double aire() {
		return rayon*rayon*Math.PI;
	}

}
