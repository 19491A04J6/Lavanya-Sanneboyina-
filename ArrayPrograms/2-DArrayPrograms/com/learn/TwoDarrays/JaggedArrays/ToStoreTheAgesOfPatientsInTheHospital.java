package com.learn.TwoDarrays.JaggedArrays;

import java.util.Scanner;

public class ToStoreTheAgesOfPatientsInTheHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of hospitals");
		int hos=sc.nextInt();
		
		int [][]arr=new int[hos][];
		
		for(int i=0;i<=arr.length-1;i++)
		{
				System.out.println("enter the no of patients in hospital "+(i+1));
				int num=sc.nextInt();
				arr[i]=new int[num];
		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("enter the age of hospital "+(i+1)+" patient "+(j+1));
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("the age of hospital "+(i+1)+" patient "+(j+1)+" is: "+arr[i][j]);
			}
		}

	}

}
