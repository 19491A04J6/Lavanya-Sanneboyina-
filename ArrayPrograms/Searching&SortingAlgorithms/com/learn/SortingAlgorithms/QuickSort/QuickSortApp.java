package com.learn.SortingAlgorithms.QuickSort;

import java.util.Scanner;

public class QuickSortApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		
		//creating an integer array 
		int []arr=new int[size];
		
		//reading the array elements
		System.out.println("enter array elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		QuickSort.qSort(arr,0,arr.length-1);
		
		for(int x:arr)
		{
			System.out.print(x+" ");
		}

	}

}
