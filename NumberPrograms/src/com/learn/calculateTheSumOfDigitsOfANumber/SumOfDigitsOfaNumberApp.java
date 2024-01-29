package com.learn.calculateTheSumOfDigitsOfANumber;

import java.util.Scanner;

public class SumOfDigitsOfaNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();   
		
		SumOfDigitsOfaNumber sum=new SumOfDigitsOfaNumber();
		sum.sumOfDigits(num);

	}

}
