package com.learn.kodnest.practiceprograms.arrayElementsPrintingInForAndRevDirections;

public class PrintArray {
	public static void printArray(int []arr)
	{
		//printing array elements in forward direction
		System.out.println("Array elements in forward direction are:");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		
		//printing array elements in reverse direction
		System.out.println("Array elements in reverse direction are:");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
