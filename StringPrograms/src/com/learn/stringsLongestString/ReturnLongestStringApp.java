package com.learn.stringsLongestString;

import java.util.Scanner;

public class ReturnLongestStringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String str1=sc.nextLine();
		
		ReturnLongestString ret=new ReturnLongestString();
		String s=ret.longestString(str1);
		System.out.println("Longest string is: "+s);

	}

}
