package com.spring.dto;

public class FeedbackDTO {

	private String email;
	
	private String feedbackMessage;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFeedbackMessage() {
		return feedbackMessage;
	}

	public void setFeedbackMessage(String feedbackMessage) {
		this.feedbackMessage = feedbackMessage;
	}

	@Override
	public String toString() {
		return "FeedbackDTO [email=" + email + ", feedbackMessage=" + feedbackMessage + "]";
	}

	
}
