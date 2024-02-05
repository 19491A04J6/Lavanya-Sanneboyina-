package com.learn.kodnest.practiceprograms.SortedArray;

import java.util.Scanner;

public class ToCheckWhetherArrayIsSortedOrNotApp {

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
		
		System.out.println(ToCheckWhetherArrayIsSortedOrNot.sortedArray(arr));

	}

}
