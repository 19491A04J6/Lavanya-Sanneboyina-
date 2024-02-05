package com.learn.kodnest.practiceprograms.FindingPrimeNumbers;

public class FindingPrimeNumbers {
	public static void findingPrime(int []arr)
	{
		System.out.println("The prime numbers present in an array are: ");
		int count=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			count=0;
			for(int j=2;j<=arr[i];j++)
			{
				if(arr[i]%j==0)
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}

}
