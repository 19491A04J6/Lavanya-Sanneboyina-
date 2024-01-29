package com.learn.methodprograms;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter principal amount");
		 double a =sc.nextDouble();
		 System.out.println("enter rate of interest");
		 double b =sc.nextDouble();
		 System.out.println("enter time");
		 double c =sc.nextDouble();
		 double d=finance(a,b,c);
		 System.out.println(d);
	}
		public static double finance(double x,double y,double z)
		{
			double q=x*y*z;
			return q;
		}

}
