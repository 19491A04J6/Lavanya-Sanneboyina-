package com.learn.numIsPosOrNeg;

import java.util.Scanner;

public class PositiveOrNegativeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		PositiveOrNegative pon=new PositiveOrNegative();
		pon.PositiveOrNegative(num);

	}

}
