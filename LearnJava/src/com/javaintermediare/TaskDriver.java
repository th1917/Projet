package com.javaintermediare;

public class TaskDriver {

	public static void main(String[] args){
		Task tache1 = new Task("Faire un tutoriel", "Description 1");
		Task tache2 = new Task("Aller au cinema", "Description 2");
		Task tache3 = new Task("Dire Mamamiya a la fin de la video", "Description 3");
		tache2.complete();
		System.out.println(tache2.title);
		System.out.println(tache2.description);
	}
}
