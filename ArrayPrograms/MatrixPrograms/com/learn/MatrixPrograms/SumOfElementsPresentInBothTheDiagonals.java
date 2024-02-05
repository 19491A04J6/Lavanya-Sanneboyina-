package com.learn.MatrixPrograms;

import java.util.Scanner;

public class SumOfElementsPresentInBothTheDiagonals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int rows=sc.nextInt();
		System.out.println("enter the number of columns");
		int col=sc.nextInt();
		
		int [][]arr=new int[rows][col];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("enter the value of row "+(i+1)+" column "+(j+1)+" : ");
				arr[i][j]=sc.nextInt();
			}
		}
		
		//sum of elements present in diagonal 
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				if(i==j)
				{
					sum=sum+arr[i][j];
				}
			}
		}
		System.out.println("The sum of diagonal elements are: "+sum);
		
		//sum of elements present in reverse diagonal 
				int sum1=0;
				for(int i=0;i<=arr.length-1;i++)
				{
					for(int j=0;j<=arr[i].length-1;j++)
					{
						if(i+j==4 || i==j)
						{
							sum1=sum1+arr[i][j];
						}
					}
				}
				System.out.println("The sum of reverse diagonal elements are: "+sum1);
	}

}
