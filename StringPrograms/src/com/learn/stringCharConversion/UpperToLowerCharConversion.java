package com.learn.stringCharConversion;

public class UpperToLowerCharConversion {
	public static void UpperToLowercharConversion(String str)
	{
		//using .tolowercase() method
		String str1=str.toLowerCase();
		System.out.println("With in-built method: ");
		System.out.println("The conversion of string "+str+" to lowercase is: "+str1);
		
		//without lowercase
		char []ch=new char[str.length()];
		
		for(int i=0;i<=str.length()-1;i++)
		{
			ch[i]=(char) (str.charAt(i)+32);
		}
		
		String s=new String(ch);
		System.out.println("Without in-built method: ");
		System.out.println("The conversion of string "+str+" to lowercase is: "+str1);
		
	}

}
