package com.questiongenerate;

import java.util.ArrayList;
import java.util.Random;

public class CapitalCityQuestionGenerator extends QuestionGenerator {
	
	public CapitalCityQuestionGenerator(int nbreQuestions) {
		super(nbreQuestions);
	}

	public ArrayList<Question> generate(){
		
		String tableau[][] = getData();
		
		if (nbreQuestions > tableau.length) {
			throw new IllegalArgumentException("Il n'y a que " + tableau.length + " questions maximum");
		}
		ArrayList<Question>questions = new ArrayList<>();
		
		int index;
		
		ArrayList<Integer> indexalreadytaken = new ArrayList<>();
		indexalreadytaken.clear();
		
		for(int i = 0; i < nbreQuestions; i++) { 
			
			do {
				Random random = new Random();
				index = random.nextInt(tableau.length);
			}while(indexalreadytaken.contains(index));
			
			indexalreadytaken.add(index);
			
			String pays = tableau[index][0];
			String capital = tableau[index][1];
			
			String questiontext = String.format("Quelle est la capitale de ce pays: %s.", pays);
			
			questions.add(new Question(questiontext,capital));
		}
			
		return questions;
	}
	
	private static String[][] getData() {
		String tab[][] = {
				{"Allemagne","Berlin"},
				{"Cameroun","Yaounde"},
				{"Senegal","Dakar"},
				{"Perou","Lima"},
				{"Italie","Rome"},
				{"France","Paris"},
				{"Belgique","Bruxelles"},
				{"Angleterre","Londres"},
				{"Chine","Pekin"},
				{"Mali","Bamako"}
	};
		return tab;
	}

}
