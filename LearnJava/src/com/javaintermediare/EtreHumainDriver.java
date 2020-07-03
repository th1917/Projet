package com.javaintermediare;

import java.util.ArrayList;

public class EtreHumainDriver {

	public static void main(String[] args) {
		ArrayList<EtreHumain> tab = new ArrayList<>();
		tab.add(new Femme());
		tab.add(new Homme());
		tab.add(new Homme());
		tab.add(new Femme());
		
		for(EtreHumain etrehumain : tab) {
			etrehumain.uriner();
		}
	}

}
