package com.learn.kodnest.practiceprograms.SortedArray;

public class ToCheckWhetherArrayIsSortedOrNot {
	public static String sortedArray(int []arr)
	{
		for(int i=0;i<=arr.length-2;i++)
		{
			if(!(arr[i]<arr[i+1]))
			{
				return "Array is not sorted";
			}
		}
		return "Array is sorted";
	}

}
