package com.learn.methodprograms;

import java.util.Scanner;

public class HeightConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the height in inches");
		double inches=sc.nextDouble();
		
		System.out.println(inchesToFeet(inches));

	}
	public static double inchesToFeet(double inches)
	{
		double feet=inches/12;
		return feet;
	}

}
