package com.learn.eligibleForSeniorCitizen;

import java.util.Scanner;

public class SeniorCitizenApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		
		SeniorCitizen sec=new SeniorCitizen();
		sec.seniorcitizen(age);

	}

}
