package com.learn.TwoDarrays.JaggedArrays;

import java.util.Scanner;

public class ToStoreThePercentageOfStudentsPresentInEachClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of classes");
		int cls=sc.nextInt();
		
		float [][]arr=new float[cls][];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter the number of students in class "+(i+1)+" : ");
			int stu=sc.nextInt();
			arr[i]=new float[stu];
		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("enter the percentage of class "+(i+1)+" student "+(j+1)+":");
				arr[i][j]=sc.nextFloat();
			}
		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("The percentage of class "+(i+1)+" student "+(j+1)+"is:"+arr[i][j]);
			}
		}

	}

}
