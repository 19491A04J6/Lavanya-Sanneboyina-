package com.learn.SortingAlgorithms;

public class SortingAlgorithms {
	public static void bubbleSortAsc(int []arr)
	{
		int temp;
		for(int i=0;i<=arr.length-2;i++)
		{
			for(int j=0;j<=arr.length-i-2;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		//printing array elements after performing bubble sort in ascending order
		System.out.println("Array elements after performing bubble sort in ascending order: ");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}
	
	public static void selectionSortAsc(int []arr)
	{
		int temp;
		int min;
		int pos;
		for(int i=0;i<=arr.length-2;i++)
		{
			min=arr[i];
			pos=i;
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					pos=j;
				}
			}
			temp=arr[pos];
			arr[pos]=arr[i];
			arr[i]=temp;
		}
		
		//printing array elements after performing selection sort in ascending order
		System.out.println("Array elements after performing selection sort in ascending order: ");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}
	
	public static void insertionSortAsc(int []arr)
	{
		int element;
		for(int i=1;i<=arr.length-1;i++)
		{
			int j=i-1;
			element=arr[i];
			while(j>=0 && arr[j]>=element)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=element;
		}
		
		//printing array elements after performing insertion sort in ascending order
		System.out.println("Array elements after performing insertion sort in ascending order: ");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}
	
	public static void bubbleSortDesc(int []arr)
	{
		int temp;
		for(int i=0;i<=arr.length-2;i++)
		{
			for(int j=0;j<=arr.length-i-2;j++)
			{
				if(arr[j]<arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		//printing array elements after performing bubble sort in descending order
		System.out.println("Array elements after performing bubble sort in descending order: ");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}
	
	public static void selectionSortDesc(int []arr)
	{
		int max,pos,temp;
		for(int i=0;i<=arr.length-2;i++)
		{
			max=arr[i];
			pos=i;
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[j]>max)
				{
					max=arr[j];
					pos=j;
				}
			}
			temp=arr[pos];
			arr[pos]=arr[i];
			arr[i]=temp;
		}
		//printing array elements after performing selection sort in descending order
		System.out.println("Array elements after performing selection sort in descending order: ");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}
	
	public static void insertionSortDesc(int []arr)
	{
		for(int i=1;i<=arr.length-1;i++)
		{
			int j=i-1;
			int element=arr[i];
			while(j>=0 && arr[j]<=element)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=element;
		}
		
		//printing array elements after performing insertion sort in descending order
		System.out.println("Array elements after performing insertion sort in descending order: ");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}

}
