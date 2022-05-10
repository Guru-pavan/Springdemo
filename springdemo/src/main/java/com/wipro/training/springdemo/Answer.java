package com.wipro.training.springdemo;

import java.util.Date;

public class Answer {

	private int id;
    private String answer;
    private Date postedDate;
    
	protected Answer() {
		// TODO Auto-generated constructor stub
	}

	protected Answer(int id, String answer, Date postedDate) {
		this.id = id;
		this.answer = answer;
		this.postedDate = postedDate;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", answer=" + answer + ", postedDate=" + postedDate + "]";
	}

	
	
	
    
    
}
