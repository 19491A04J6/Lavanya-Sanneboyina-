package com.learn.controlconstructs;

import java.util.Scanner;

public class ToCheckMarksGreaterThan90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks");
		int marks=sc.nextInt();
		if(marks>90)
		{
			System.out.println("Welcome to TechClub");
		}

	}

}
