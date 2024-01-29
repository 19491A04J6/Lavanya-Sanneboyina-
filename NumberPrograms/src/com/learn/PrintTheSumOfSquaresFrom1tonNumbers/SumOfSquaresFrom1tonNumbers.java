package com.learn.PrintTheSumOfSquaresFrom1tonNumbers;

public class SumOfSquaresFrom1tonNumbers {
	public static void sumOfSquares(int num)
	{
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			sum=sum+i*i;
		}
		System.out.println("sum of squares of number "+num+" is: "+sum);
	}

}
