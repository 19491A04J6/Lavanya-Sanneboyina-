package com.learn.stringreverse;

import java.util.Scanner;

public class StringReverseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str1=sc.next();
		
		StringReverse sr=new StringReverse();
		sr.stringreverse(str1);

	}

}
