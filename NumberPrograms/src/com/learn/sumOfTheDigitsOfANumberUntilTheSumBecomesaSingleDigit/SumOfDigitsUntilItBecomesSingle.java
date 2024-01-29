package com.learn.sumOfTheDigitsOfANumberUntilTheSumBecomesaSingleDigit;

public class SumOfDigitsUntilItBecomesSingle {
	public static void sumOfDigs(int num)
	{
		int sum=0,n1;
		while(num!=0)
		{
			n1=num%10;
			sum=sum+n1;
			num=num/10;
		}
		if(sum<10)
		{
			System.out.println(sum);
		}
		else
		{
			sumOfDigs(sum);
		}
	}

}
