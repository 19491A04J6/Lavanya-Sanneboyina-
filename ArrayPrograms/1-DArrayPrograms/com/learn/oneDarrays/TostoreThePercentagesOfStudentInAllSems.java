package com.learn.oneDarrays;

import java.util.Scanner;

public class TostoreThePercentagesOfStudentInAllSems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of semesters");
		int sems=sc.nextInt();
		
		float []arr=new float[sems];
		
		System.out.println("enter the percentages");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextFloat();
		}
		
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("The percentage of student in "+(i+1)+" sem is "+arr[i]);
		}


	}

}
