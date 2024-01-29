package com.learn.printEvenNumbersFrom1ton;

import java.util.Scanner;

public class EvenNumbersApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		
		EvenNumbers en=new EvenNumbers();
		en.printEvenNumbers(num);

	}

}
