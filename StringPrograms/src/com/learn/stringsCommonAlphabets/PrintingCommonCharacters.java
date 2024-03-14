package com.learn.stringsCommonAlphabets;

public class PrintingCommonCharacters {
	public static void commonCharacters(String str1,String str2)
	{
		//to convert the string to lowercase
		String S1=str1.toLowerCase();
		String S2=str2.toLowerCase();
		
		//to replace the spaces
		String st1=S1.replace(" ","");
		String st2=S2.replace(" ","");
		
		System.out.println(st1);
		System.out.println(st2);
		
		//creating new empty strings
		String s1="";
		String s2="";
		
		//for loop to store str1 characters without duplicates
		for(int i=0;i<=st1.length()-1;i++)
		{
			if(!(s1.contains(st1.charAt(i)+"")))
			{
				s1=s1+st1.charAt(i);
			}
		}
		System.out.println(s1);
		
		//for loop to store str1 characters without duplicates
		for(int i=0;i<=st2.length()-1;i++)
		{
			if(!(s2.contains(st2.charAt(i)+"")))
			{
				s2=s2+st2.charAt(i);
			}
		}
		System.out.println(s2);
		
		//printing common alphabets
		System.out.println("common Alphabets are: ");
		for(int i=0;i<=s1.length()-1;i++)
		{
			for(int j=0;j<=s2.length()-1;j++)
			{
				if((s1.charAt(i)+"").equals(s2.charAt(j)+""))
				{
					System.out.println(s1.charAt(i));
				}
			}
		}
	}

}
