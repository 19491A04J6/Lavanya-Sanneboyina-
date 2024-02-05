package com.learn.oneDarrays;

import java.util.Scanner;

public class ToStoreTheNoOfBacklogsOfAStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of semesters");
		int size=sc.nextInt();
		
		int []arr=new int[size];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter the student "+(i+1)+" has backlog");
			boolean res=sc.nextBoolean();
			if(res==true)
			{
				System.out.println("enter the no of backlogs");
				 arr[i]=sc.nextInt();
				
			}
		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Backlogs in semester "+(i+1)+" : "+arr[i]);
		}

	}

}
