package com.learn.stringCharConversion;

import java.util.Scanner;

public class StringCharConversionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str1=sc.next();
		
		UpperToLowerCharConversion utl=new UpperToLowerCharConversion();
		utl.UpperToLowercharConversion(str1);
		
		LowerToUpperCharConversion ltu=new LowerToUpperCharConversion();
		ltu.LowerToUppercharConversion(str1);

	}

}
