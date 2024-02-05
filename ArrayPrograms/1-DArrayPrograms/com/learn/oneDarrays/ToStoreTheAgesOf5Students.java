package com.learn.oneDarrays;

import java.util.Scanner;

public class ToStoreTheAgesOf5Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of students");
		int stu=sc.nextInt();
		
		int []arr=new int[stu];
		System.out.println("enter the ages");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The ages of students are");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
