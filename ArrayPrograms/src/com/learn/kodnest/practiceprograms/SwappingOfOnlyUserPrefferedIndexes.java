package com.learn.kodnest.practiceprograms;

import java.util.Scanner;

public class SwappingOfOnlyUserPrefferedIndexes {

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
		
		//displaying the array elements before swapping
		System.out.println("The array elements before swapping are :");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("enter the indexes to be swapped: ");
		int indx1=sc.nextInt();
		int indx2=sc.nextInt();
		
		//displaying the array elements after swapping
		System.out.println("The array elements after swapping are :");
		int temp=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(i==indx1 || i==indx2)
			{
				temp=arr[i];
				arr[i]=arr[indx2];
				arr[indx2]=temp;
				
			}
			System.out.print(arr[i]+" ");
		}


	}

}
