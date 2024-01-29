package com.learn.swapping;

import java.util.Scanner;

public class SwappingWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=sc.nextInt();
		
		System.out.println("enter second number");
		int num2=sc.nextInt();
		
		System.out.println("Before swapping "+num1+" "+num2);

		num1=num1+num2;//10+20=30
		num2=num1-num2;//30-20=10
		num1=num1-num2;//30-10=20
		
		System.out.println("After swapping "+num1+" "+num2);

	}

}
