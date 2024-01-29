package com.learm.assignment.ToDisplaySumAndCountOfNumsDivBy3;

import java.util.Scanner;

public class UsingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0)
			{
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("count "+count);

	}

}
