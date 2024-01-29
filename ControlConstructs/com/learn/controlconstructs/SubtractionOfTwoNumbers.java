package com.learn.controlconstructs;

import java.util.Scanner;

public class SubtractionOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=sc.nextInt();
		
		System.out.println("enter second number");
		int num2=sc.nextInt();
		
		if(num1>num2)
		{
			System.out.println("The subtraction value is: "+(num1-num2));
		}
		else
		{
			System.out.println("Cannot be done");
		}

	}

}
