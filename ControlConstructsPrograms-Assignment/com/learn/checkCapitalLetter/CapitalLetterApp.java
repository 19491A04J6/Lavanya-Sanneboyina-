package com.learn.checkCapitalLetter;

import java.util.Scanner;

public class CapitalLetterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character");
		char ch=sc.next().charAt(0);
		
		CapitalLetter cl=new CapitalLetter();
		cl.checkCapitalLetter(ch);

	}

}
