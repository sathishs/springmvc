package com.paypal.dt.hackathon.repos;

import java.util.Date;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.repository.CrudRepository;

import com.paypal.dt.hackathon.model.CustSentiment;

public class ReposTest {
	private static CrudRepository repository;

	@Test
	public void testRepo1() {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-config.xml");
		repository = context.getBean(CustSentimentRepo.class);
		createEmployee("sa@google.com", "twitter", "Y", "Sylvana", "Laptop",
				new Date());
		// createEmployee(23, "Jack", " Dorsey", "Imaginea");
		// createEmployee(24, "Sam", "Fox", "Imaginea");

		context.close();

	}

	private static void createEmployee(String emailId, String type,
			String isPositiveFlag, String merchantId, String prodId, Date date) {

		CustSentiment emp = new CustSentiment(emailId, type, isPositiveFlag,
				merchantId, prodId, date);
		repository.save(emp);
	}
}
