package com.learn.kodnest.practiceprograms.sumOfPosNumbers;

public class sumOfPosNumbers {
	public static void sum(int []arr)
	{
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>0)
			{
				sum=sum+arr[i];
			}
		}
		System.out.println("The sum of positive numbers in an array is: "+sum);
	}

}
