package com.quiz;

import java.util.Scanner;

import com.questiongenerate.QuestionGenerator;

public class ConsoleQuiz extends Quiz {

	public ConsoleQuiz(QuestionGenerator generator) {
		super(generator);
	}

	Scanner clavier = new Scanner(System.in);
	
	@Override
	public void displayMessage(String message) {
		System.out.println(message);
	}

	@Override
	public String retrieveAnswer(String prompt) {
		displayMessage(prompt);
		return clavier.nextLine();
	}
	
}
	
