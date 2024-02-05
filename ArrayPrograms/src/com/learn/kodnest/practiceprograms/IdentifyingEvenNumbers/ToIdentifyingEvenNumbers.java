package com.learn.kodnest.practiceprograms.IdentifyingEvenNumbers;

public class ToIdentifyingEvenNumbers {
	public static void identifyingEvenNumbers(int []arr)
	{
		int count=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
			{
				count++;
			}
		}
		System.out.println("The count of even numbers are: "+count);
	}

}
