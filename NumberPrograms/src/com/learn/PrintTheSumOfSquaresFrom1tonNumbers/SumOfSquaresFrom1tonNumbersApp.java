package com.learn.PrintTheSumOfSquaresFrom1tonNumbers;

import java.util.Scanner;

public class SumOfSquaresFrom1tonNumbersApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		
		SumOfSquaresFrom1tonNumbers sum=new SumOfSquaresFrom1tonNumbers();
		sum.sumOfSquares(num);

	}

}
