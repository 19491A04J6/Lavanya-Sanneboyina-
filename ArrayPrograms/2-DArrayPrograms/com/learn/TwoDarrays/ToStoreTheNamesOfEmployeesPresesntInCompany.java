package com.learn.TwoDarrays;

import java.util.Scanner;

public class ToStoreTheNamesOfEmployeesPresesntInCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of companies");
		int com=sc.nextInt();
		
		System.out.println("enter the no of employees");
		int emp=sc.nextInt();
		
		String [][]arr=new String[com][emp];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("enter the marks of class "+(i+1)+" student "+(j+1));
				arr[i][j]=sc.next();
				
			}
		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr.length-1;j++)
			{
				System.out.println("The name of company "+(i+1)+" employee "+(j+1)+" is: "+arr[i][j]);
			}
		}

	}

}
