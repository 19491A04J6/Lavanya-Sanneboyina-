package com.learn.kodnest.practiceprograms.replaceNegativeArrayElementsWithZero;

public class ReplacingNegativeArrayElementsWithZero {
	public static void replacingWithZero(int []arr)
	{
		//loop to display the array elements
		System.out.println("Array elements after replacing negative elements with zero are:");
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]<0)
			{
				arr[i]=0;
			}
			System.out.print(arr[i]+" ");
		}
	}

}
