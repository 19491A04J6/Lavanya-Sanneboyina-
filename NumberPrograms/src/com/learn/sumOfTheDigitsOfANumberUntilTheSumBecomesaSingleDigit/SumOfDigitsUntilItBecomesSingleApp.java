package com.learn.sumOfTheDigitsOfANumberUntilTheSumBecomesaSingleDigit;

import java.util.Scanner;

public class SumOfDigitsUntilItBecomesSingleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		
		SumOfDigitsUntilItBecomesSingle sum=new SumOfDigitsUntilItBecomesSingle();
		sum.sumOfDigs(num);

	}

}
