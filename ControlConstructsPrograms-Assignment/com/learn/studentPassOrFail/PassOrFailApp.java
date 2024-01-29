package com.learn.studentPassOrFail;

import java.util.Scanner;

public class PassOrFailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the grade");
		int grade=sc.nextInt();
		
		PassOrFail pof=new PassOrFail();
		pof.passOrFail(grade);
		

	}

}
