package com.learn.kodnest.javaproject;

public class SoftwareEngineerApp{
	public static void main(String []args)
	{
		//creating objects of the classes 
		BackendDeveloper bd = new BackendDeveloper();//Tight Coupling
		FrontendDeveloper fd = new FrontendDeveloper();//Tight Coupling
		
		//creating objects of the classes 
		BackendDeveloper jd = new JavaDeveloper();//upcasting-assigning child class object to parent class reference
		BackendDeveloper pd = new PythonDeveloper();//upcasting/LooseCoupling
		
		//calling the methods of the classes by passing the reference
		//polymorphism-1:many relationships
		doActivity(bd);
		
		System.out.println("---------------------------------");
		
		doActivity(fd);
		
		System.out.println("---------------------------------");
		
		doActivity(jd);
		
		System.out.println("---------------------------------");
		
		doActivity(pd);
	}
	public static void doActivity(SoftwareEngineer se)
	{
		se.attendMeeting();
		se.testcode();
		
		//calling child specific methods/specialized methods of back end developer class
		if(se instanceof BackendDeveloper)
		{
			((BackendDeveloper) se).doBackendProject();//downcasting-giving the object reference
			                                           //from parent back to the child
		}
		
		//calling child specific methods/specialized methods of Front end developer class
		else if(se instanceof FrontendDeveloper)
		{
			((FrontendDeveloper) se).doFrontendProject();//down casting
			((FrontendDeveloper) se).learnFrontendLanguage();//down casting
		}
		
		//calling overridden and child-specific methods of java developer class
		else if(se instanceof JavaDeveloper)
		{
			((JavaDeveloper) se).doBackendProject();//down casting
			((JavaDeveloper) se).learnjava();//down casting
		}
		
		//calling overridden and child-specific methods of python developer class
		else if(se instanceof PythonDeveloper)
		{
			((PythonDeveloper) se).doBackendProject();//down  casting
			((PythonDeveloper) se).learnpython();//down casting
		}
		
	}

}
