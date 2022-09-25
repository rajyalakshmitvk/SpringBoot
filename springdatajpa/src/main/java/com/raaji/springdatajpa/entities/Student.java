package com.raaji.springdatajpa.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Student {

	@Id
	@SequenceGenerator(name = "student_sequence", initialValue	= 1 )
	@GeneratedValue(strategy =GenerationType.SEQUENCE,generator = "student_sequence")
	private long id;
	private String name;
	private int testScore;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTestScore() {
		return testScore;
	}
	public void setTestScore(int testScore) {
		this.testScore = testScore;
	}
	
	public String toString()
	{
		return id+" "+name+" "+testScore;
	}
}
