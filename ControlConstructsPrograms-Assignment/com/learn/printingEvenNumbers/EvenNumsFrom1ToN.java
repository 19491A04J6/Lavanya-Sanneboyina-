package com.learn.printingEvenNumbers;

public class EvenNumsFrom1ToN {
	public static void evenNumbers(int num)
	{
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" ");
			}
		}
	}

}
