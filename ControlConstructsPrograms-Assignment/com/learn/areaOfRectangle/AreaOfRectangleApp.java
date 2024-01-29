package com.learn.areaOfRectangle;

import java.util.Scanner;

public class AreaOfRectangleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		double len=sc.nextDouble();
		System.out.println("enter the width");
		double wid=sc.nextDouble();
		
		AreaOfRectangle aor=new AreaOfRectangle();
		double d=aor.CalculateRectangleArea(len,wid);
		System.out.println("Area of rectangle is "+d);

	}

}
