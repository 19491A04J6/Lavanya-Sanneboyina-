package com.learn.TwoDarrays;

import java.util.Scanner;

public class ToStoreMarksOfStudentsPresentInClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of classes");
		int cls=sc.nextInt();
		
		System.out.println("enter the no of students");
		int stu=sc.nextInt();
		
		int [][]arr=new int[cls][stu];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("enter the marks of class "+(i+1)+" student "+(j+1));
				arr[i][j]=sc.nextInt();
				
			}
		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("The marks of class "+(i+1)+" student "+(j+1)+" is: "+arr[i][j]);
			}
		}
		

	}

}
