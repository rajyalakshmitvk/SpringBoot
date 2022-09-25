package com.raaji.core;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;

import com.raaji.core.services.PaymentService;
import com.raaji.core.services.PaymentServiceImpl;

//@RunWith(SpringRunner.class)
@SpringBootTest
class CoreApplicationTests {

	@Autowired
	PaymentServiceImpl service;
	
	
	@Test
	void testDependencyInjection() {
		assertNotNull(service.getDao());
	}

}
