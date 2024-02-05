package com.learn.ThreeDArrays.JaggedArrays;

import java.util.Scanner;

public class ToStoreTheMarksOfStudentsPresentInClassesOfDifferentSchools {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of schools");
		int sch=sc.nextInt();
		
		int [][][]arr=new int[sch][][];
		
		for(int i=0;i<=arr.length-1;i++)
		{
					System.out.println("enter the no of classes in school "+(i+1)+" : ");
					int cls=sc.nextInt();
					arr[i]=new int[cls][];
		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
					System.out.println("enter the no of students in school"+(i+1)+" class "+(j+1)+" : ");
					int stu=sc.nextInt();
					arr[i][j]=new int[stu];
			}
		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.println("Enter the marks of school "+(i+1)+" class "+(j+1)+" student "+(k+1)+" : ");
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
