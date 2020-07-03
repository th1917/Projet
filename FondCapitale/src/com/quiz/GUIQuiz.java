package com.quiz;

import javax.swing.JOptionPane;

import com.questiongenerate.QuestionGenerator;

public class GUIQuiz extends Quiz {

	public GUIQuiz(QuestionGenerator generator) {
		super(generator);
	}

	@Override
	public void displayMessage(String message) {
		JOptionPane.showMessageDialog(null,message);
	}

	@Override
	public String retrieveAnswer(String prompt) {
		
		return JOptionPane.showInputDialog(prompt);
	}

}
