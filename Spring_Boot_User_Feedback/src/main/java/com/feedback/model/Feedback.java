package com.feedback.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int feedbackId;
	private String firstName;
	private String lastName;
	private String emailId;
	private int shoppingExperience;
	private int deliveryRating;
	private int productRating;
	private String liked;
	private String didNotLike;
	private String suggestion;
	
	
	public int getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getShoppingExperience() {
		return shoppingExperience;
	}
	public void setShoppingExperience(int shoppingExperience) {
		this.shoppingExperience = shoppingExperience;
	}
	public int getDeliveryRating() {
		return deliveryRating;
	}
	public void setDeliveryRating(int deliveryRating) {
		this.deliveryRating = deliveryRating;
	}
	public int getProductRating() {
		return productRating;
	}
	public void setProductRating(int productRating) {
		this.productRating = productRating;
	}
	public String getLiked() {
		return liked;
	}
	public void setLiked(String liked) {
		this.liked = liked;
	}
	public String getDidNotLike() {
		return didNotLike;
	}
	public void setDidNotLike(String didNotLike) {
		this.didNotLike = didNotLike;
	}
	public String getSuggestion() {
		return suggestion;
	}
	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}
	
	
	
	
}
