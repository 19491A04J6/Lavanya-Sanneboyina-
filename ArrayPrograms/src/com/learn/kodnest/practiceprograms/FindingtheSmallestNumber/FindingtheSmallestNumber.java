package com.learn.kodnest.practiceprograms.FindingtheSmallestNumber;

public class FindingtheSmallestNumber {
	public static void findSmallestNum(int []arr)
	{
		int smallestNum = 0;
		for(int i=0;i<=arr.length-2;i++)
		{
			if(arr[i]!=arr[i+1] &&arr[i]<arr[i+1])
			{
				smallestNum=arr[i];
			}
			else
			{
				smallestNum=arr[i+1];
			}
		}
		System.out.println("Smallest number is: "+smallestNum);
	}

}
