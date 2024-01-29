package com.learn.printEvenNumbersFrom1ton;

public class EvenNumbers {
	public static void printEvenNumbers(int num)
	{
		for(int i=1;i<=num;i++)
		{
			if(i%2==0) {
			System.out.print(i+" ");
		    }
		}
	}

}
