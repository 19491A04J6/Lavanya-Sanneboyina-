package com.learn.factorial;

import java.util.Scanner;

public class FactorialOfANumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt(); 
		
		FactorialOfANumber fac=new FactorialOfANumber();
		fac.factorial(num);

	}

}
