package com.learn.factorial;

public class FactorialOfANumber 
{
public static void factorial(int num)
{
	int fact=1;
	for(int i=1;i<=num;i++)
	{
		fact=fact*i;
	}
	System.out.println("factorial of a number is "+fact);
}
}
