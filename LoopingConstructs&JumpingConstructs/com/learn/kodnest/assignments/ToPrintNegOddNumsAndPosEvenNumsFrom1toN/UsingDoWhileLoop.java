package com.learn.kodnest.assignments.ToPrintNegOddNumsAndPosEvenNumsFrom1toN;

import java.util.Scanner;

public class UsingDoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		
		System.out.print("postitive even numbers until n are:");
		int i=0;
		do
		{
			if(i%2==0 && i!=0)
			{
				System.out.print(i+" ");
			}
			i++;
		}while(i<=n);
		
		System.out.println();
		
		System.out.print("Negative odd numbers until n are:");
		i=0;
	    do
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
			i--;
			if(i==(-n))
			{
				break;
			}
		}while(i>=(-n));

	}

}
