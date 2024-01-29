package com.learn.printingFirstnPrimeNumbers;

import java.util.Scanner;

public class PrintingFirstnPrimeNumbersApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt(); 
		
		PrintingFirstnPrimeNumbers pri=new PrintingFirstnPrimeNumbers();
		pri.primeNumbers(num);

	}

}
