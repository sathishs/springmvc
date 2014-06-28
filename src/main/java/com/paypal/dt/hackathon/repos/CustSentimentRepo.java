package com.paypal.dt.hackathon.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.paypal.dt.hackathon.model.CustSentiment;

@Repository
public interface CustSentimentRepo extends
		CrudRepository<CustSentiment, Integer> {

}
