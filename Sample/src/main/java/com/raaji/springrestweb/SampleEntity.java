package com.raaji.springrestweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SampleEntity {

	private int id;
	private String name;
	private int year;
	@Autowired
	private SampleProduct prod;
	public SampleProduct getProd() {
		return prod;
	}

	public void setProd(SampleProduct prod) {
		this.prod = prod;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String toString()
	{
		prod.display();
		return id+" "+name+" "+year;
	}
	
}
