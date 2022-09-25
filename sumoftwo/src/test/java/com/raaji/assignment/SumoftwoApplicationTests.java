package com.raaji.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.raaji.assignment.dao.SumofTwoDAOImpl;
import com.raaji.assignment.services.SumofTwoService;
import com.raaji.assignment.services.SumofTwoServiceImpl;

@SpringBootTest
class SumoftwoApplicationTests {
	
	@Autowired
	//SumofTwoService service;
	SumofTwoServiceImpl service;

	@Test
	void testSumCalculation() {
	assertEquals(36, service.calculateSum(27,9));
	}

}
