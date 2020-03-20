package com.fms.entity;

import java.util.List;


import org.springframework.data.annotation.Id;

public class QuestionModel {
	
	
	private String question;
	
	private String feedbackType;
	
	private List<Answer> answers;

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getFeedbackType() {
		return feedbackType;
	}

	public void setFeedbackType(String feedbackType) {
		this.feedbackType = feedbackType;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	
	

}
