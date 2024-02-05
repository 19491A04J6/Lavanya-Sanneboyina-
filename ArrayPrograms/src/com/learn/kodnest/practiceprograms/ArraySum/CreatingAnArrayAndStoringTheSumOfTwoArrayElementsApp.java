package com.learn.kodnest.practiceprograms.ArraySum;

import java.util.Scanner;

public class CreatingAnArrayAndStoringTheSumOfTwoArrayElementsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		
		//creating an integer array 
		int []arr1=new int[size];
		
		//reading the array elements
		System.out.println("enter first array elements");
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		//creating an integer array 
		int []arr2=new int[size];
				
		//reading the array elements
		System.out.println("enter second array elements");
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		CreatingAnArrayAndStoringTheSumOfTwoArrayElements.storingArrayElements(arr1,arr2);

	}

}
