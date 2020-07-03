package com.quiz;

import com.questiongenerate.Question;
import com.questiongenerate.QuestionGenerator;

abstract public class Quiz {
		private QuestionGenerator generator;
		private int score;
		private long timeElapse;
		private boolean done = false;
		
		public Quiz(QuestionGenerator generator) {
			this.generator = generator;
		}
		
		abstract public void displayMessage(String message);
		
		abstract public String retrieveAnswer(String prompt); 
		
		public void start() {
			try {
				long startTime = System.currentTimeMillis();
				
				askQuestions();
				
				done = true;
				
				long endTime = System.currentTimeMillis();
				
				timeElapse = (endTime - startTime)/1000;
						
			}catch(Exception e) {
				done = false;
				System.out.println(e.getMessage());
			}
			
		}

		private void askQuestions() throws Exception {
			for(Question questions:generator.generate()) {
				
				String userAnswer = retrieveAnswer(questions.getText());
				
				if(userAnswer.equalsIgnoreCase(questions.getResponse())) {
					displayMessage("Bonne reponse!");
					score ++;
				}else {
					displayMessage(String.format("Mauvaise reponse. Il fallait repondre %s. \n", questions.getResponse()));
				}
			}
		}
		
		public void displayResults() {
			if(done) {
				displayMessage(String.format("C'est terminé. Votre score est << %d/%d >>", score, generator.getNbreQuestions()));
				displayMessage(String.format("Il vous a fallu environ %d secondes pour repondre aux questions ", timeElapse));
			}
		}
		
		
}

