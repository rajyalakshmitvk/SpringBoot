package com.raaji.assignment.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raaji.assignment.dao.SumofTwoDAO;

@Service
public class SumofTwoServiceImpl {

	public int a,b;
	
	@Autowired
	private SumofTwoDAO dao;

	public SumofTwoDAO getDao() {
		return dao;
	}

	public void setDao(SumofTwoDAO dao) {
		this.dao = dao;
	}
	
	public int calculateSum(int a,int b)
	{
		return a+b;
	}
	
	
}
