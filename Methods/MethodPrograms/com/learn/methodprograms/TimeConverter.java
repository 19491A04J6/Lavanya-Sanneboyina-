package com.learn.methodprograms;

import java.util.Scanner;

public class TimeConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the time in minutes");
		int a=sc.nextInt();
		double b=timeconverter(a);
		System.out.println("the conversion of minutes to hour is: "+b);
	}
	public static double timeconverter(int x)
	{
		return x/60;
		
	}

}
