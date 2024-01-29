package com.learn.PalindromeOrNot;

public class Palindrome {
	public static void palindrome(int num)
	{
		int temp=num;
		int rev=0,n1;
		while(num!=0)
		{
			n1=num%10;
			rev=rev*10+n1;
			num=num/10;
		}
		if(temp==rev)
		{
			System.out.println("Number is a palindrome");
		}
		else
		{
			System.out.println("Number is not a palindrome");
		}
	}

}
