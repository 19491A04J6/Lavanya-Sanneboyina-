package com.learn.stringsCharConversion;

import java.util.Scanner;

public class CharConversionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str1=sc.next();
		
		
		CharConversion cc=new CharConversion();
		cc.charconversion(str1);

	}

}
