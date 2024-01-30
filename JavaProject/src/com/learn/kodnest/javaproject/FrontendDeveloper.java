package com.learn.kodnest.javaproject;

public class FrontendDeveloper extends SoftwareEngineer //achieving inheritance using extends keyword
{
    
	
	@Override//overridden methods
	public void attendMeeting() {
		System.out.println("Frontend Developer is attending meeting");
		
	}
	@Override//overridden methods
	public void testcode()
	{
	System.out.println("Frontend Developer is testing the code");
	}
	//child specific methods
	public void doFrontendProject() {
		System.out.println("Frontend Developer is doing the frontend project");
		
	}
	//child specific methods
	public void learnFrontendLanguage()
	{
		System.out.println("Learning frontend Language");
	}

}
