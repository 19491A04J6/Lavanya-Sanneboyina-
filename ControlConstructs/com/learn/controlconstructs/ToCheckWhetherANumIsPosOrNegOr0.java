package com.learn.controlconstructs;

import java.util.Scanner;

public class ToCheckWhetherANumIsPosOrNegOr0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		
		if(num>0)
		{
			System.out.println("Positive number");
		}
		else if(num<0)
		{
			System.out.println("Negative number");
		}
		else
		{
			System.out.println("Zero");
		}

	}

}
