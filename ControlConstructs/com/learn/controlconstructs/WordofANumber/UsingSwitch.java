package com.learn.controlconstructs.WordofANumber;

import java.util.Scanner;

public class UsingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		switch(num)
		{
		case 1:System.out.println("One");
		       break;
		       
		case 2:System.out.println("Two");
	       break;
	       
		case 3:System.out.println("Three");
	       break;
	       
		case 4:System.out.println("Four");
	       break;
	       
		case 5:System.out.println("Five");
	       break;
	       
	    default : System.out.println("Input Out Of Range");
		}

	}

}
