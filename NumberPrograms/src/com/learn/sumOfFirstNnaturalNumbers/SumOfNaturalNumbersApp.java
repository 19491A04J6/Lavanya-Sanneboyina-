package com.learn.sumOfFirstNnaturalNumbers;

import java.util.Scanner;

public class SumOfNaturalNumbersApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		
		SumOfNaturalNumbers sum=new SumOfNaturalNumbers();
		sum.sumOfNaturalNumbers(num);

	}

}
