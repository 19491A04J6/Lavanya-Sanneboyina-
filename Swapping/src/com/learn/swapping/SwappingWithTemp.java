package com.learn.swapping;

import java.util.Scanner;

public class SwappingWithTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=sc.nextInt();
		
		System.out.println("enter second number");
		int num2=sc.nextInt();
		
		System.out.println("Before swapping "+num1+" "+num2);

		int temp;
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After swapping "+num1+" "+num2);
	}

}
