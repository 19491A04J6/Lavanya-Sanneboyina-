package com.learn.positiveNumberPrinting;

import java.util.Scanner;

public class PositiveNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		
		PositiveNumber pn=new PositiveNumber();
		pn.printpos(n);

	}

}
