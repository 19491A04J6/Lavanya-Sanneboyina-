package com.learn.linearAndBinarySearch;

public class LinearAndBinarySearch {
	public static String LinearSearch(int []arr,int key)
	{
		//Looping throught the array indexes
		for(int i=0;i<=arr.length-1;i++)
		{
			if(key==arr[i])
			{
				return "Key found at index "+i;
			}
		}
		return "Key not found";
	}
	
	public static String BinarySearch(int []arr,int key)
	{
		int low=0;
		int high=arr.length-1;int mid;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(key==arr[mid])
			{
			  return "Key "+key+" found at index "+mid;
			}
			else if(key>arr[mid])
			{
				low=mid+1;
			}
			else if(key<arr[mid])
			{
				high=mid-1;
		    }
		}
			
	return "Key not found";
	}

}
