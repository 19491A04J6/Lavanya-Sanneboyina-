package com.learn.oneDarrays;

import java.util.Scanner;

public class ToStoreTheNmaesOf10Employees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of employees");
		int emp=sc.nextInt();
		
		String []arr=new String[emp];
		System.out.println("enter the names of employees");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextLine();
		}
		
		System.out.println("Names of 10 employees are: ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		


	}

}
