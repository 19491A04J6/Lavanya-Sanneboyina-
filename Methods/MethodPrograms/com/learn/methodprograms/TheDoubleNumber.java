package com.learn.methodprograms;

import java.util.Scanner;

public class TheDoubleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		
		System.out.println(doubleTheNumber(num));

	}
	
	public static int doubleTheNumber(int num)
	{
		num=num*2;
		return num;
	}

}
