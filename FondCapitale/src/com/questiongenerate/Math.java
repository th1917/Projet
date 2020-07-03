package com.questiongenerate;

import java.util.ArrayList;
import java.util.Random;

public class Math extends QuestionGenerator {

	public Math(int nbreQuestions) {
		super(nbreQuestions);
	}

	@Override
	public ArrayList<Question> generate() {
		ArrayList<Question>questions = new ArrayList<>();
		Random random = new Random();
		char[] operators = {'+','-','*','/'};
		
		for(int i = 0; i < nbreQuestions; i++) {
			int nbre1 = random.nextInt(15);
			int nbre2 = random.nextInt(15) + 1;
			char operator = operators[random.nextInt(operators.length)];
			
			String questionText = String.format("%d %c %d = ?", nbre1, operator, nbre2);
			questions.add(new Question(questionText,calculate(operator,nbre1,nbre2)));
			
		}
				return questions;
	}

	private String calculate(char operator, int nbre1, int nbre2) {
		String response = null;
		switch (operator) {
		case '+':
			response =  String.valueOf(nbre1 + nbre2);
		break;
		
		case '-':
			response =  String.valueOf(nbre1 - nbre2);
		break;
		
		case '/':
			response =  String.valueOf(nbre1 / nbre2);
		break;
		
		case '*':
			response =  String.valueOf(nbre1 * nbre2);
		break;
		}
		return response;
	}

}
