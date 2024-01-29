package com.learn.loopingconstructs.toprintevennumbers;

import java.util.Scanner;

public class UsingWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		int i=1;
		//if you don't know until where to go
		while(i<=num)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
			i++;
		}

	}

}
