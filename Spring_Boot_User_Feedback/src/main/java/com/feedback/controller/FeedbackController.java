package com.feedback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.feedback.exception.BusinessException;
import com.feedback.model.Feedback;
import com.feedback.service.FeedbackService;

@RestController
public class FeedbackController{
	
	@Autowired
	private FeedbackService service;
	
	private MultiValueMap<String, String> map;
	
	@PostMapping("/feedback")
	public Feedback createFeedback(@RequestBody Feedback feedback) {
	
		return service.createFeedback(feedback);
	}
	
	
	@PutMapping("/feedback")
	public Feedback updateFeedback(@RequestBody Feedback feedback) {
		
		return service.updateFeedback(feedback);
	}

	
	@GetMapping("/feedback/{feedbackId}")
	public ResponseEntity<Feedback> getFeedbackByFeedbackId(@PathVariable("feedbackId") int feedbackId) {
		try {
			return new ResponseEntity<Feedback>(service.getFeedbackByFeedbackId(feedbackId),HttpStatus.OK);
		} catch(BusinessException e){
			map=new LinkedMultiValueMap<>();
			map.add("message",e.getMessage());
			return new ResponseEntity<Feedback>(null, map, HttpStatus.NOT_FOUND);
		}
	}

	
	@GetMapping("/feedbacks/shopExp/{shoppingExperience}")
	public List<Feedback> getFeedbackByShoppingExperience(@PathVariable("shoppingExperience") int shoppingExperience) {
	
		return service.getFeedbackByShoppingExperience(shoppingExperience);
	}

	
	@GetMapping("/feedbacks/deliveryRating/{deliveryRating}")
	public List<Feedback> getFeedbackByDeliveryRating(@PathVariable("deliveryRating") int deliveryRating) {
		
		return service.getFeedbackByDeliveryRating(deliveryRating);
	}

	
	@GetMapping("/feedbacks/productRating/{productRating}")
	public List<Feedback> getFeedbackByProductRating(@PathVariable("productRating") int productRating) {
		
		return service.getFeedbackByProductRating(productRating);
	}

	@GetMapping("/feedbacks")
	public List<Feedback> getAllFeedbacks(){
		return service.getAllFeedbacks();
	}

	@DeleteMapping("/feedback/feedbackId/{feedbackId}")
	public void deleteFeedbackByFeedbackId(@PathVariable("feedbackId") int feedbackId) {
		service.deleteFeedbackByFeedbackId(feedbackId);
		
	}

	
}
