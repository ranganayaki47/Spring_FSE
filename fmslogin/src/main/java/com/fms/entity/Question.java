package com.fms.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("question")
public class Question  {
	
	@Id
	private long id;
	
	private String question;
	
	private String feedbackType;
	
	private int totalAns;
	
	

	public Question(String question, String feedbackType, int totalAns) {
		super();
		this.question = question;
		this.feedbackType = feedbackType;
		this.totalAns = totalAns;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getFeedback_type() {
		return feedbackType;
	}

	public void setFeedback_type(String feedback_type) {
		this.feedbackType = feedback_type;
	}

	public int getTotalAns() {
		return totalAns;
	}

	public void setTotalAns(int totalAns) {
		this.totalAns = totalAns;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + ", feedbackType=" + feedbackType + ", totalAns="
				+ totalAns + "]";
	}
	
	

}
