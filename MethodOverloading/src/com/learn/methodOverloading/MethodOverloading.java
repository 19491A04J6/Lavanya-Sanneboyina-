package com.learn.methodOverloading;

import java.util.Scanner;

public class MethodOverloading {

	     //multiple methods with same name but the different order of parameters
	    //datatypes of parameters
	    //no. of parameters
		 public static void calcArea(int side)
		{
		 int p=side*side;
		 System.out.println("the area of a square is"+p);
		}
		public static void calcArea(float radius)
		{
		 float q=3.14F*radius*radius;
		 System.out.println("the area of a circle is"+q);
		}
		public static void calcArea(int length,int breadth)
		{
		 int r=length*breadth;
		 System.out.println("the area of a rectangle is"+r);
		}
		
		//main method
		public static void main(String[] args)
		{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter a side");
		 int a=sc.nextInt();
		 System.out.println("enter the radius");
		 float b=sc.nextFloat();
		 System.out.println("enter the length");
		 int c=sc.nextInt();
		 System.out.println("enter the breadth");
		 int d=sc.nextInt();
		 calcArea(a);
		 calcArea(b);
		 calcArea(c,d);
		}


}
