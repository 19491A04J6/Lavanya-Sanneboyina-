package com.learn.kodnest.javaproject;

//Achieving Abstraction using abstract class
public abstract class SoftwareEngineer implements SoftwareEngineer1//achieving inheritance using implements keyword
{
	//abstract method
	public abstract void attendMeeting();
	
	//concrete method
	public void testcode()
	{
		System.out.println("Software Engineer is testing the code");
	}

}
