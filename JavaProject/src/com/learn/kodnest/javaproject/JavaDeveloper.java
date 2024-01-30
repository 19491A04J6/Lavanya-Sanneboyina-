package com.learn.kodnest.javaproject;

public class JavaDeveloper extends BackendDeveloper//achieving inheritance using extends keyword
{
	@Override//overridden methods
	public void doBackendProject()
	{
		System.out.println("Java Developer is Doing Backend Project");
	}
	//child specific methods
	public void learnjava()
	{
		System.out.println("Java Developer is learning java");
	}


}
