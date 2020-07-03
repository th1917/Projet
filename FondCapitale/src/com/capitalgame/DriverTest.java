package com.capitalgame;

import com.questiongenerate.CapitalCityQuestionGenerator;
import com.quiz.ConsoleQuiz;
import com.quiz.GUIQuiz;
import com.quiz.Quiz;
import com.questiongenerate.Math;

public class DriverTest {

	public static void main(String[] args) {
		Quiz quiz = new GUIQuiz(new Math(2));
		quiz.start();
		quiz.displayResults();
	}

}
