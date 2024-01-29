package com.learn.jumpingconstructs.ToSkipTheIterationWhenAnumIsN;

import java.util.Scanner;

public class UsingWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		int i=1;
		while(i<=num)
		{
			if(i==6)
			{
				continue;
			}
			System.out.print(i+" ");
			i++;
		}


	}

}
