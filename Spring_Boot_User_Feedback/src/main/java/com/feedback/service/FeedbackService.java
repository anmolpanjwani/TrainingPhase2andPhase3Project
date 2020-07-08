package com.feedback.service;

import java.util.List;

import com.feedback.exception.BusinessException;
import com.feedback.model.Feedback;

public interface FeedbackService {
	
	public Feedback createFeedback(Feedback feedback);
	public Feedback updateFeedback(Feedback feedback);
	public Feedback getFeedbackByFeedbackId(int feedbackId) throws BusinessException;
	public List<Feedback> getFeedbackByShoppingExperience(int shoppingExperience);
	public List<Feedback> getFeedbackByDeliveryRating(int deliveryRating);
	public List<Feedback> getFeedbackByProductRating(int productRating);
	public List<Feedback> getAllFeedbacks();
	public void deleteFeedbackByFeedbackId(int feedbackId);
	
	
}
