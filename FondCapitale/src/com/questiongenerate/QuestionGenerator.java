package com.questiongenerate;

import java.util.ArrayList;

abstract public class QuestionGenerator {
	
    protected int nbreQuestions;
	
	public QuestionGenerator(int nbreQuestions) {
		this.nbreQuestions = nbreQuestions;
	}
	
	abstract public ArrayList<Question> generate() throws Exception;
	
	public int getNbreQuestions() {
		
		return nbreQuestions;
	}
}
