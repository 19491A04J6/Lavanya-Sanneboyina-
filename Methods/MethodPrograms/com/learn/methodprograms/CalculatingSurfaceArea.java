package com.learn.methodprograms;

import java.util.Scanner;

public class CalculatingSurfaceArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius");
		double radius=sc.nextDouble();
		
		System.out.println(AreaOfSphere(radius));

	}
    public static double AreaOfSphere(double radius)
    {
    	double a=4*Math.PI*radius*radius;
    	return a;
    }
}
