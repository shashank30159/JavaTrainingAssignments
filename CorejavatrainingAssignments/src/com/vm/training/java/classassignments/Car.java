package com.vm.training.java.classassignments;

public class Car
{
	private int Speed;
	private String Make;
	private int yearModel;
		
	public Car (String n, int Model)
	{	
		Make = n;
		yearModel = Model; 
	}
	
	public int getyearModel ()
	{
		return yearModel;
	}
	
	public String getMake ()
	{
		return Make;
	}
	
	public int getSpeed ()
	{
		return Speed;
	}	
		
	public void accelerate ()
	{
		if (Speed !=90)
			Speed = Speed +5;
	}
	
	public void brake ()
	{
		if (Speed !=0)
			Speed = Speed -5;
	}
}
