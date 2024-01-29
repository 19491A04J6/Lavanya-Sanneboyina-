package com.learn.findTheLargestDigitInaNumber;

public class LargetsDigit {
	public static void largestDigit(int num)
	{
		int LargestNumber=0,n1=0;
		while(num!=0)
		{
			n1=num%10;
			num=num/10;
			if(n1>LargestNumber)
			{
				LargestNumber=n1;
			}
		}
		System.out.println("Largest digit of a number is "+LargestNumber);
	}

}
