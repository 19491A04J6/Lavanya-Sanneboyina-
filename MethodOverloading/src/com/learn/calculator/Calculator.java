package com.learn.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter first number");
	   int x=sc.nextInt();
	   System.out.println("enter second number");
	   int y=sc.nextInt();
	   
	   int add=add(x,y);
	   System.out.println(add);
	   
	   int sub=sub(x,y);
	   System.out.println(sub);
	   
	   int mul=mul(x,y);
	   System.out.println(mul);
	   
	   int div=div(x,y);
	   System.out.println(div);
	   

	}
	
	public static int add(int a,int b)
	{
		return a+b;
	}
	
	public static int sub(int a,int b)
	{
		return a-b;
	}
	

	public static int mul(int a,int b)
	{
		return a*b;
	}
	public static int div(int a,int b)
	{
		if(a>b)
		{
		return a/b;
		}
		return 0;
	}

}
