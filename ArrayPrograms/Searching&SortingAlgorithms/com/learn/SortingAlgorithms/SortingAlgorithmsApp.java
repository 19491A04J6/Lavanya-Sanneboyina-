package com.learn.SortingAlgorithms;

import java.util.Scanner;

import com.learn.linearAndBinarySearch.LinearAndBinarySearch;

public class SortingAlgorithmsApp {

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
		
		//asking user to enter an option based on which operation has to be performed
		System.out.println("enter 1 to perform Bubble sort in ascending order"
				+ " 2 to perform Selection Sort in ascending order "
				+ "3 to perform Insertion Sort in ascending order"
				+ "4 to perform Bubble sort in descending order"
				+ "5 to perform Selection Sort in descending order"
				+ "6 to perform Insertion Sort in descending order");
		int opt=sc.nextInt();
		
		switch(opt)
		{
		case 1 : SortingAlgorithms.bubbleSortAsc(arr);
		         break;
		         
		case 2 : SortingAlgorithms.selectionSortAsc(arr);
		         break;
		         
		case 3 : SortingAlgorithms.insertionSortAsc(arr);
                 break;
        
		case 4 : SortingAlgorithms.bubbleSortDesc(arr);
                 break;
        
		case 5 : SortingAlgorithms.selectionSortDesc(arr);
                 break;
        
		case 6 : SortingAlgorithms.insertionSortDesc(arr);
                 break;
		         
		default : System.out.println("Invalid option");
		}


	}

}
