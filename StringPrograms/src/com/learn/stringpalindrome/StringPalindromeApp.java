package com.learn.stringpalindrome;

import java.util.Scanner;

public class StringPalindromeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str1=sc.next();
		
		StringPalindrome se=new StringPalindrome();
		se.stringpalindrome(str1);

	}

}
