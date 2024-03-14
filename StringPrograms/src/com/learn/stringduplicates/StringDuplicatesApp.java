package com.learn.stringduplicates;

import java.util.Scanner;

public class StringDuplicatesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str1=sc.next();
		
		StringDuplicates sd=new StringDuplicates();
		sd.stringDuplicates(str1);

	}

}
