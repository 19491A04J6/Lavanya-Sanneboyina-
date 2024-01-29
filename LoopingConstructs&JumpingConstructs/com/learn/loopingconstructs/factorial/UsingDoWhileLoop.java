package com.learn.loopingconstructs.factorial;

import java.util.Scanner;

public class UsingDoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		int fact=1;
		int i=1;
		do
		{
			fact=fact*i;
			i++;
		}while(i<=num);
		System.out.println(fact);
	}

}
