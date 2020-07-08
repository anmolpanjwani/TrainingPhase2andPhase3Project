package com.feedback.service.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feedback.dao.FeedbackDAO;
import com.feedback.exception.BusinessException;
import com.feedback.model.Feedback;
import com.feedback.service.FeedbackService;

@Service
public class FeedbackServiceImpl implements FeedbackService {
	@Autowired
	private FeedbackDAO feedao;
	
	@Override
	public Feedback createFeedback(Feedback feedback) {
		return feedao.save(feedback);
	}

	@Override
	public Feedback updateFeedback(Feedback feedback) {
		return feedao.save(feedback);
	}

	@Override
	public Feedback getFeedbackByFeedbackId(int feedbackId) throws BusinessException{
		
		if(feedbackId<=0) {
			throw new BusinessException("Id "+feedbackId+" is invalid!");
		}
		Feedback feedback =null;
		try {
			feedback = feedao.findById(feedbackId).get();
		
		} catch(NoSuchElementException e){
			throw new BusinessException("No feedback found for id "+feedbackId);
		}
		return feedback;
	}

	@Override
	public List<Feedback> getFeedbackByShoppingExperience(int shoppingExperience) {
		return feedao.findByShoppingExperience(shoppingExperience);
	}

	@Override
	public List<Feedback> getFeedbackByDeliveryRating(int deliveryRating) {
		return feedao.findByDeliveryRating(deliveryRating);
	}

	@Override
	public List<Feedback> getFeedbackByProductRating(int productRating) {
		return feedao.findByProductRating(productRating);
	}

	@Override
	public List<Feedback> getAllFeedbacks() {
		return feedao.findAll();
	}

	@Override
	public void deleteFeedbackByFeedbackId(int feedbackId) {
		feedao.deleteById(feedbackId);
	}


}
