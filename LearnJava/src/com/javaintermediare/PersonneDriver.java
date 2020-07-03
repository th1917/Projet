package com.javaintermediare;

public class PersonneDriver {

	public static void main(String[] args) {
		Personne p1 = new Personne("EWELE", "Thierry");
		try {
			p1.setAge(11);
		}catch(IllegalArgumentException e){
			e.printStackTrace();
//			System.out.println(e.getMessage());
		}
		System.out.println(p1.full_Name());

	}

}
