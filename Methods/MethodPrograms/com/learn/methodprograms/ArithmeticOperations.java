package com.learn.methodprograms;

import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter first number");
		int num1=sc.nextInt();
		System.out.println("enter second number");
		int num2=sc.nextInt();
		System.out.println(subtractNumbers(num1,num2));
		
		System.out.println("enter first number");
		int num3=sc.nextInt();
		System.out.println("enter second number");
		int num4=sc.nextInt();
		System.out.println(multiplyNumbers(num3,num4));
		
		System.out.println("enter first number");
		int num5=sc.nextInt();
		System.out.println("enter second number");
		int num6=sc.nextInt();
		System.out.println(divideNumbers(num5,num6));
		
		System.out.println("enter first number");
		int num7=sc.nextInt();
		System.out.println("enter second number");
		int num8=sc.nextInt();
		System.out.println(findRemainder(num7,num8));


	}
	public static int subtractNumbers(int num1,int num2)
	{
		return num1-num2;
	}
	
	public static int multiplyNumbers(int num1,int num2)
	{
		return num1*num2;
	}
	public static double divideNumbers(int num1,int num2)
	{
		return num1/num2;
	}
	public static int findRemainder(int num1,int num2)
	{
		return num1%num2;
	}

}
