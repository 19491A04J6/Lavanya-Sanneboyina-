package com.learn.stringsequal;

public class StringsEqual {
	public static void stringsequal(String str1,String str2)
	{
		int a=str1.length();
		int b=str2.length();
		
		if(a==b)
		{
			System.out.println("Both strings are of same length");
		}
		else
		{
			System.out.println("Both strings are of different length");
		}
	}

}
