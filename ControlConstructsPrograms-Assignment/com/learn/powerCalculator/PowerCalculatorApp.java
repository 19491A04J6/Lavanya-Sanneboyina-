package com.learn.powerCalculator;

import java.util.Scanner;

public class PowerCalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the base");
		int base=sc.nextInt();
		System.out.println("enter the exponent");
		int exp=sc.nextInt();
		 
		PowerCalculator pc=new PowerCalculator();
		int pow=pc.calculatePower(base,exp);
		System.out.println("power of a number is "+pow);

	}

}
