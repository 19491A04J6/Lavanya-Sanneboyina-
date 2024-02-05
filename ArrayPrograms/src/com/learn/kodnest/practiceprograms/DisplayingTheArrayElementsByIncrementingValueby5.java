package com.learn.kodnest.practiceprograms;

import java.util.Scanner;

public class DisplayingTheArrayElementsByIncrementingValueby5 {

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
		
		//displaying the array elements
		System.out.println("The array elements are :");
		for(int a:arr)
		{
		  System.out.print(a+" ");
		}
			
		System.out.println();
		//displaying the array elements incrementing by 5
		System.out.println("The array elements after incrementing by 5 are :");
		for(int x:arr)
		{
			System.out.print((x+5)+" ");
		}


	}

}
