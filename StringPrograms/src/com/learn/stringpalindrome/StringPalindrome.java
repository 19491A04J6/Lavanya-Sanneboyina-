package com.learn.stringpalindrome;

public class StringPalindrome {
	public static void stringpalindrome(String str)
	{
		char []ch=str.toCharArray();
		
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		
		System.out.println(rev);
		
		if(rev.equals(str))
		{
			System.out.println("String is a palindrome");
		}
		else
		{
			System.out.println("String is not a palindrome");
		}
	}

}
