package com.learn.binaryOperators;

import java.util.Scanner;

public class BitwiseOperators {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		
		//Bitwise Operators-performs operations on bit level
		System.out.println(a&b);//bitwise And-return 1 if both the bits are 1 or true
		System.out.println(a|b);//bitwise or-return 1 if any one of the bits are 1 or true
		System.out.println(a^b);//bitwise xor-returns 1 if corresponding bits are different
		System.out.println(~b);//bitwise complement-returns the inverse value of bits

	}

}
