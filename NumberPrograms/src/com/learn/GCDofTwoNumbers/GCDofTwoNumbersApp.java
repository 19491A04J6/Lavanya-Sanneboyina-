package com.learn.GCDofTwoNumbers;

import java.util.Scanner;

public class GCDofTwoNumbersApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=sc.nextInt();  

		System.out.println("enter second number");
		int num2=sc.nextInt();  
		
		GCDofTwoNumbers gcd=new GCDofTwoNumbers();
		gcd.gcdOfTwoNumbers(num1,num2);

	}

}
