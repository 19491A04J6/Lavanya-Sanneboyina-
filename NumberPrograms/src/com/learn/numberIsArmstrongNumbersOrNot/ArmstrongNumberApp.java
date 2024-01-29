package com.learn.numberIsArmstrongNumbersOrNot;

import java.util.Scanner;

public class ArmstrongNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		
		ArmstrongNumber arm=new ArmstrongNumber();
		arm.armstrongNumber(num);

	}

}
