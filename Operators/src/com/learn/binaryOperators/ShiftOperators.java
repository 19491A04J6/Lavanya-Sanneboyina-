package com.learn.binaryOperators;

import java.util.Scanner;

public class ShiftOperators {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		
		//shift Operators-performs operations on bit-level
		System.out.println(a>>2);////right shift-right shift the bits upto 2 positions and returns the result
		System.out.println(a<<2);////left shift-left shift the bits upto 2 positions and returns the result
		
	}

}
