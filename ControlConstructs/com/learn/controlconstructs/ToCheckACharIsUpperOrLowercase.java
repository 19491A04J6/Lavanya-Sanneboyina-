package com.learn.controlconstructs;

import java.util.Scanner;

public class ToCheckACharIsUpperOrLowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a character");
		char ch=sc.next().charAt(0);
		
		if(ch>='A' && ch<='Z')
		{
			System.out.println("Upper case");
		}
		else if(ch>='a' && ch<='z')
		{
			System.out.println("Lower case");
		}
		else
		{
			System.out.println("It is a number");
		}
	}

}
