package com.learn.oneDarrays;

import java.util.Scanner;

public class ToStoreWhetheraStudentHaveBacklogOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of semesters");
		int size=sc.nextInt();
		
		boolean []arr=new boolean[size];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter the student "+(i+1)+" has backlog");
			arr[i]=sc.nextBoolean();
		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Backlog in semester "+(i+1)+" : "+arr[i]);
		}

	}

}
