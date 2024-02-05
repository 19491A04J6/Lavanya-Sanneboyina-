package com.learn.SortingAlgorithms.QuickSort;

public class QuickSort {
	public static void qSort(int []arr,int low,int high)
	{
		if(low<=high)
		{
			int pi=partition(arr,low,high);
			System.out.println("pi"+pi);
			
			qSort(arr,low,pi-1);
			qSort(arr,pi+1,high);
		}
	}

	private static int partition(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		System.out.println("Low"+low+"high"+high);
		int pivot=arr[high];
		int i=low-1;
		
		System.out.println("pivot "+pivot+" i "+i);
		
		for(int j=low;j<=high;j++)
		{
			if(arr[j]<pivot)
			{
				i++; System.out.print("i"+i);
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		
		return i+1;
	}

}
