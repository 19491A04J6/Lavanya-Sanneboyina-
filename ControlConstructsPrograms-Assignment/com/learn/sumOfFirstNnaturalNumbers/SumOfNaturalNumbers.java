package com.learn.sumOfFirstNnaturalNumbers;

public class SumOfNaturalNumbers {
	public static void sumOfNaturalNumbers(int num)
	{
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum of natural numbers are "+sum);
	}

}
