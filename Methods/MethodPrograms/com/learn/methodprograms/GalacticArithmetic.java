package com.learn.methodprograms;

import java.util.Scanner;

public class GalacticArithmetic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		long num1=sc.nextLong();
		
		System.out.println("enter second number");
		long num2=sc.nextLong();
		
		System.out.println(add(num1,num2));
		
	}
	public static long add(long num1,long num2)
	{
		return num1+num2;
	}

}
