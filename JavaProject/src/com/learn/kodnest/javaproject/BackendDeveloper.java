package com.learn.kodnest.javaproject;

public class BackendDeveloper extends SoftwareEngineer //achieving inheritance using extends keyword
{
    
	@Override //overridden methods
	public void attendMeeting() {
		System.out.println("Backend Developer is attending meeting");
		
	}
	
	@Override //overridden methods
	public void testcode()
	{
		System.out.println("Backend Developer is testing the code");
	}

	//child specific methods
	public void doBackendProject()
	{
		System.out.println("Backend Developer is doing backend project");
	}

}
