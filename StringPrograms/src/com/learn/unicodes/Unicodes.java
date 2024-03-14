package com.learn.unicodes;

public class Unicodes {
	public static void unicodes(String str)
	{
		for(int i=0;i<=str.length()-1;i++)
		{
			int a=(int)str.charAt(i);
			System.out.println("unicode value of "+str.charAt(i)+" is: "+a);
		}
	}

}
