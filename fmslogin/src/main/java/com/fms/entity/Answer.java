package com.fms.entity;


import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Answer {
	
	@Id
	private long id;
	
	private String answer;
	
	@JsonIgnore
	private long questionId;
	
	public Answer(String answer, long questionId) {
		super();
		this.answer = answer;
		this.questionId = questionId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}

	
	
	

}
