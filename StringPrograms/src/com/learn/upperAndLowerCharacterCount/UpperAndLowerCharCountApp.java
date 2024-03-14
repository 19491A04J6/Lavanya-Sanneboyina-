package com.learn.upperAndLowerCharacterCount;

import java.util.Scanner;

public class UpperAndLowerCharCountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str1=sc.next();
		
		UpperAndLowerCharCount ulc=new UpperAndLowerCharCount();
		ulc.characterCount(str1);

	}

}
