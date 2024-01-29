package com.learn.binaryOperators;

import java.util.Scanner;

public class RelationalOperators {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		
		//relational Operators-used to perform comparison between operands,it returns boolean values
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a>=b);
		System.out.println(a==b);
		System.out.println(a!=b);

	}

}
