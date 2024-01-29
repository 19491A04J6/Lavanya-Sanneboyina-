package com.learn.printingEvenNumbers;

import java.util.Scanner;

public class EvenNumsFrom1ToNApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		
		EvenNumsFrom1ToN even=new EvenNumsFrom1ToN();
		even.evenNumbers(num);

	}

}
