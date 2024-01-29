package com.learn.methodprograms;

import java.util.Scanner;

public class PowerSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		
		System.out.println(PowerSquare(num));

	}
	public static int PowerSquare(int num)
	{
		return num*num;
	}

}
