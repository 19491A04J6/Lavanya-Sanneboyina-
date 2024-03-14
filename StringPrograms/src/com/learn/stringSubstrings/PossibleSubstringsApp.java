package com.learn.stringSubstrings;

import java.util.Scanner;

public class PossibleSubstringsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str1=sc.next();
		
		PossibleSubstrings sub=new PossibleSubstrings();
		sub.possibleSubstrings(str1);

	}

}
