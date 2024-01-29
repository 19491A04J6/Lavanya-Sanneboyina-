package com.learn.methodprograms;

import java.util.Scanner;

public class HalvingANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		double a=sc.nextDouble();
		double b=halving(a);
		System.out.println("the halving of a number is "+b);

	}
	public static double halving(double x)
	{
		double y=x/2;
		return y;

	}

}
