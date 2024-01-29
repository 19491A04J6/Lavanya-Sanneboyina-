package com.learn.kodnest.assignments.ToPrintNegOddNumsAndPosEvenNumsFrom1toN;

import java.util.Scanner;

public class UsingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		
		System.out.print("postitive even numbers until n are:");
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		
		System.out.print("Negative odd numbers until n are:");
		for(int i=0;i>(-n);i--)
		{
			if(i%2!=0)
			{
				System.out.println(i+" ");
			}
			if(i==(-n))
			{
				break;
			}
		}

	}

}
