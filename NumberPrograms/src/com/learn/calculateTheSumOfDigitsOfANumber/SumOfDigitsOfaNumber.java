package com.learn.calculateTheSumOfDigitsOfANumber;

public class SumOfDigitsOfaNumber {
	public static void sumOfDigits(int num)
	{
		int sum=0,n1;
		while(num!=0)
		{
			n1=num%10;
			sum=sum+n1;
			num=num/10;
		}
		System.out.println("sum of digits of number is: "+sum);
	}

}
