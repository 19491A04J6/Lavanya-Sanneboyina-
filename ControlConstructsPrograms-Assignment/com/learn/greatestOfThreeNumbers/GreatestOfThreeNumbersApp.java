package com.learn.greatestOfThreeNumbers;

import java.util.Scanner;

public class GreatestOfThreeNumbersApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		
		System.out.println("enter second number");
		int b=sc.nextInt();
		
		System.out.println("enter third number");
		int c=sc.nextInt();
		
		GreatestOfThreeNumbers gre=new GreatestOfThreeNumbers();
		gre.greatestOfThreeNumbers(a,b,c);

	}

}
