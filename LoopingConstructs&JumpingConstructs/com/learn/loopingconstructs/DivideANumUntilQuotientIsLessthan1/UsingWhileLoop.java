package com.learn.loopingconstructs.DivideANumUntilQuotientIsLessthan1;

import java.util.Scanner;

public class UsingWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		while(num>1)
		{
			num=num/2;
			System.out.print(num+" ");
		}

	}

}
