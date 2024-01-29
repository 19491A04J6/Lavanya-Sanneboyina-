package com.learn.findTheLargestDigitInaNumber;

import java.util.Scanner;

public class LargetsDigitApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		
		LargetsDigit lar=new LargetsDigit();
		lar.largestDigit(num);

	}

}
