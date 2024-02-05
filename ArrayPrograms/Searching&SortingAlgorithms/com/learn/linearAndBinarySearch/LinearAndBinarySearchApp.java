package com.learn.linearAndBinarySearch;

import java.util.Scanner;

public class LinearAndBinarySearchApp {

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
		
		//reading key element
		System.out.println("Enter the key element to search in the array");
		int key=sc.nextInt();
		
		//asking user to enter an option based on which operation has to be performed
		System.out.println("enter 1 to perform linear search and 2 to perform binary search");
		int opt=sc.nextInt();
		
		switch(opt)
		{
		case 1 : System.out.print(LinearAndBinarySearch.LinearSearch(arr,key));
		         break;
		         
		case 2 : System.out.print(LinearAndBinarySearch.BinarySearch(arr,key));
		         break;
		         
		default : System.out.println("Invalid option");
		}

	}

}
