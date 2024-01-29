package com.learm.assignment.ToDisplaySumAndCountOfNumsDivBy3;

import java.util.Scanner;

public class UsingDoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		
		int count=0,i=1;
	    do
		{
			if(i%3==0)
			{
				System.out.print(i+" ");
				count++;
			}
			i++;
			
		}	while(i<=n);
         System.out.println("count "+count);

	}

}
