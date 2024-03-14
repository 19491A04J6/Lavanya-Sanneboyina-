package com.learn.stringduplicates;

public class StringDuplicates {
	public static void stringDuplicates(String str)
	{
		String str1="";
		
		for(int i=0;i<=str.length()-1;i++)
		{
			if(!(str1.contains(str.charAt(i)+"")))
			{
				str1=str1+str.charAt(i);
			}
		}
		System.out.println("The string "+str+" after removing duplicates are: "+str1);
	}

}
