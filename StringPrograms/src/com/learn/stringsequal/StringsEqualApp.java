package com.learn.stringsequal;

import java.util.Scanner;

public class StringsEqualApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String str1=sc.next();
		
		System.out.println("enter second string");
		String str2=sc.next();
		
		StringsEqual se=new StringsEqual();
		se.stringsequal(str1,str2);
		

	}

}
