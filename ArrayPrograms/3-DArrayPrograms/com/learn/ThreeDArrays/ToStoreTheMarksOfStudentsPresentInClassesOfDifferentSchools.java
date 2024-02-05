package com.learn.ThreeDArrays;

import java.util.Scanner;

public class ToStoreTheMarksOfStudentsPresentInClassesOfDifferentSchools {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of schools");
		int sch=sc.nextInt();
		System.out.println("enter the no of schools in each school");
		int cls=sc.nextInt();
		System.out.println("enter the no of students in each class");
		int stu=sc.nextInt();
		
		int [][][]arr=new int[sch][cls][stu];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.println("enter the marks of school "+(i+1)+" class "+(j+1)+" student "+(k+1)+" : ");
					arr[i][j][k]=sc.nextInt();
				}
			}
		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.println("The marks of school "+(i+1)+" class "+(j+1)+" student "+(k+1)+"are : "+arr[i][j][k]);
				}
			}
		}

	}

}
