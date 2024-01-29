package com.learn.unaryOperators;

import java.util.Scanner;

public class UnaryOperators {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		
		//increment and decrement operators
		System.out.println(a++);//post-increment
		System.out.println(++b);//pre-increment
		System.out.println(a--);//post-decrement
		System.out.println(--b);//pre-decrement
		
		//unary plus(+) and unary minus(-)
		System.out.println(+a);
		System.out.println(-b);
		
		//logical not-it takes boolean values 
		System.out.println(!true);

	}

}
