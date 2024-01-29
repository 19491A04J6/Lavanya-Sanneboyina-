package com.learn.printingFirstnPrimeNumbers;

public class PrintingFirstnPrimeNumbers {
	public static void primeNumbers(int num)
	{
		int count=0;
		System.out.println("The prime numbers upto n are:");
		for(int i=1;i<=num;i++)
		{
			count=0;
			for(int j=2;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.print(i+" ");
			}
		}
	}

}
