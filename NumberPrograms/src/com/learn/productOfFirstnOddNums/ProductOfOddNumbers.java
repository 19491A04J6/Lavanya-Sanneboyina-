package com.learn.productOfFirstnOddNums;

public class ProductOfOddNumbers {
	public static void productOfOdd(int num)
	{
		int pro=1;
		for(int i=1;i<=num;i++)
		{
			if(i%2!=0)
			{
				pro=pro*i;
			}
		}
		System.out.println("product of n odd numbers is "+pro);
	}

}
