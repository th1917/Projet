package com.javaintermediare;

public class Personne {
	private String nom;
	private String prenom;
	private int age;
	
	public static final int NOMBRE_MAX_OREILLES = 2;
	static int nombreTotalDePersonnes = 0;
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		nombreTotalDePersonnes++;
	}
	public String full_Name(){
		return nom + " " + prenom;
	}
	
	public String full_Name(String debut){
		return debut + " " + nom + " " + prenom;
	}
	
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public static int nombreTotalDePersonnes(){
		return nombreTotalDePersonnes;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNom() {
		return nom;
	}

	public void setAge(int age) {
		if (age<15) {
			throw new IllegalArgumentException("Interdit au moins de 15 ans");
		}else {
			this.age = age;
		}	
	}
	
	public int getAge(){
		return this.age;
	}
}
