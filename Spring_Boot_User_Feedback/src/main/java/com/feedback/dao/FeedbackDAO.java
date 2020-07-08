package com.feedback.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.feedback.model.Feedback;

@Repository
public interface FeedbackDAO extends JpaRepository<Feedback, Integer>{

	public List<Feedback> findByEmailId(String emailId);

	public List<Feedback> findByShoppingExperience(int shoppingExperience);

	public List<Feedback> findByDeliveryRating(int deliveryRating);

	public List<Feedback> findByProductRating(int productRating);	
	
}
