package com.learn.printTheArmstrongNumbersFrom1ton;

import java.util.Scanner;

public class ArmstrongNumbersApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		
		ArmstrongNumbers arm=new ArmstrongNumbers();
		arm.armstrong(num);

	}

}
