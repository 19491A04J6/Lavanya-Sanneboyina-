package com.learn.voteEligibility;

import java.util.Scanner;

public class VoteEligibleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		
		VoteEligible ve=new VoteEligible();
		ve.voteEligibility(age);

	}

}
