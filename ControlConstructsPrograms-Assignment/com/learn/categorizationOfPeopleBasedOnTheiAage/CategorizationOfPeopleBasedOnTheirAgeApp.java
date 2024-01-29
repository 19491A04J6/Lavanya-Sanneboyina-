package com.learn.categorizationOfPeopleBasedOnTheiAage;

import java.util.Scanner;

public class CategorizationOfPeopleBasedOnTheirAgeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		
		CategorizationOfPeopleBasedOnTheirAge cat=new CategorizationOfPeopleBasedOnTheirAge();
		cat.categorization(age);

	}

}
