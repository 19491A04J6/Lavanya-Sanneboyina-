package com.learn.assignments.DisplayNumbersInDescendingOrder;

import java.util.Scanner;

public class UsingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		
		for(int i=60;i>=n;i--)
		{
			System.out.print(i+" ");
		}

	}

}
