package com.javaintermediare;

public class Task {
	public String description;
	public boolean completed = false;
	public String title;
	public Task(String title, String description) {
		this.title = title;
		this.description = description;
		
	}
	public void complete() {
		completed = true;
	}
	
}
