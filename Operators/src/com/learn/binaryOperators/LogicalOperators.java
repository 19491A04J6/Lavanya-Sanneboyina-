package com.learn.binaryOperators;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first number");
	int a=sc.nextInt();
	System.out.println("enter second number");
	int b=sc.nextInt();
	
	//Logical Operators-it checks the two individual conditions,it return boolean values
	System.out.println(a>b && b<a);//return true if both conditions are true
	System.out.println(a>b || b<a);//return true if any one conditions are true
	System.out.println(!(a>b));//return inverse value 

	}

}
