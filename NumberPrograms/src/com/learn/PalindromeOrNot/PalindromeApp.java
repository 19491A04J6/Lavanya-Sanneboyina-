package com.learn.PalindromeOrNot;

import java.util.Scanner;

public class PalindromeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();   
		
		Palindrome p=new Palindrome();
		p.palindrome(num);

	}

}
