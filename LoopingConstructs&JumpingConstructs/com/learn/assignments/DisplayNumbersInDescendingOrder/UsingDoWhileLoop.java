package com.learn.assignments.DisplayNumbersInDescendingOrder;

import java.util.Scanner;

public class UsingDoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		
		int i=60;
		do
		{
			System.out.print(i+" ");
			i--;
		}while(i>=n);

	}

}
