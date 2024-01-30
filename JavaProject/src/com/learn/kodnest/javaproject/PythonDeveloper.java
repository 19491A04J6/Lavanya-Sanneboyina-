package com.learn.kodnest.javaproject;

public class PythonDeveloper extends BackendDeveloper //achieving inheritance using extends keyword
{
    @Override//overridden methods
	public void doBackendProject()
	{
		System.out.println("python developer is doing backend project");
	}
  //child specific methods
	public void learnpython()
	{
		System.out.println("python developer is learning python");
	}
	

}
