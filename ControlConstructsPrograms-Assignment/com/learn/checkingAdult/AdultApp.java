package com.learn.checkingAdult;

import java.util.Scanner;

public class AdultApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		
		Adult a=new Adult();
		a.checkAdult(age);

	}

}
