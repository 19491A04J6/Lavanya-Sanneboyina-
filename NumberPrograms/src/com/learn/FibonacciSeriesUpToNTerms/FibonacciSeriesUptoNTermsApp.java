package com.learn.FibonacciSeriesUpToNTerms;

import java.util.Scanner;

public class FibonacciSeriesUptoNTermsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int num=sc.nextInt();  
		
		FibonacciSeriesUptoNTerms fib=new FibonacciSeriesUptoNTerms();
		fib.fibonacci(num);

	}

}
