package com.learn.kodnest.practiceprograms.ArraySum;

public class CreatingAnArrayAndStoringTheSumOfTwoArrayElements {
	public static void storingArrayElements(int []arr1,int []arr2)
	{
		
		int []arr3=new int[arr1.length];
		
		System.out.println("The array elements after sum are: ");
		for(int i=0;i<=arr1.length-1;i++)
		{
			   arr3[i]=arr1[i]+arr2[i];
		     System.out.print(arr3[i]+" ");
		}
	}

}
