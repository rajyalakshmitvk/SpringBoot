package com.raaji.springrestweb;

public class Student {

	private int sid;
	private String sname;
	private String course;
	private double percentage;
	
	public Student() {}
	
	public Student(int sid,String sname,String course, double percentage)
	{
		super();
		this.sid=sid;
		this.sname=sname;
		this.course=course;
		this.percentage=percentage;
	}
	
	//getters and setters
	public int getSid()
	{
		return sid;
	}
	
	public void setSid(int sid)
	{
		this.sid=sid;
	}
	
	public String getSname()
	{
		return sname;
	}
	
	public void setSname(String sname)
	{
		this.sname=sname;
	}
	
	public String getCourse()
	{
		return course;
	}
	
	public void setCourse(String course)
	{
		this.course=course;
	}
	
	public double getPercentage()
	{
		return percentage;
	}
	
	public void setPercentage(double percentage)
	{
		this.percentage=percentage;
	}
}
