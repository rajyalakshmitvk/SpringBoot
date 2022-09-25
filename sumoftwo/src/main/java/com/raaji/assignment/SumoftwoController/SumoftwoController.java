package com.raaji.assignment.SumoftwoController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raaji.assignment.services.SumofTwoServiceImpl;

@RestController
public class SumoftwoController {
@Autowired
private SumofTwoServiceImpl impl;

@RequestMapping("/sum/{id}/{id1}")
	public int calculateSum(@PathVariable int id,@PathVariable int id1)
	{
		return impl.calculateSum(id, id1);
	}
	
}
