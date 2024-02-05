package com.learn.MatrixPrograms;

import java.util.Scanner;

public class ToCreateaMatrix {

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
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
