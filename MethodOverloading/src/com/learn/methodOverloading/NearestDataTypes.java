package com.learn.methodOverloading;

import java.util.Scanner;

public class NearestDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter a and b");
		 int a=sc.nextInt();
		 int b=sc.nextInt();
		 System.out.println("enter x and y");
		 float x=sc.nextFloat();
		 float y=sc.nextFloat();
		 System.out.println("enter p and q");
		 double p=sc.nextDouble();
		 double q=sc.nextDouble();
		 System.out.println(add(x,y));//add(2.5,2.5)
		}
		public static int add(int x,int y)
		{
		return x+y;
		}
		public static double add(double x,float y)//this method will be called because double is nearest to float  
		//or here one parameter type is float
		{
		return x+y;
		}
		
}
