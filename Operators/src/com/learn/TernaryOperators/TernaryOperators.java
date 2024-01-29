package com.learn.TernaryOperators;

import java.util.Scanner;

public class TernaryOperators {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		
		//Ternary Operator-it is a short hand if-else condition 
		//if(condition)?true:false-returns true if the condition is true else return false
		System.out.println((a>b)?true:false);

	}

}
