package com.learn.controlconstructs;

import java.util.Scanner;

public class ToCheckAndPrintRangeOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		
		if(num>=1 && num<=10)
		{
			System.out.println("range1");
		}
		else if(num>=11 && num<=20)
		{
			System.out.println("range2");
		}
		else if(num>=21 && num<=30)
		{
			System.out.println("range3");
		}
		else if(num>=31 && num<=40)
		{
			System.out.println("range4");
		}
		else if(num>=41 && num<=50)
		{
			System.out.println("range5");
		}
		else
		{
			System.out.println("Outside Range");
		}
	}

}
