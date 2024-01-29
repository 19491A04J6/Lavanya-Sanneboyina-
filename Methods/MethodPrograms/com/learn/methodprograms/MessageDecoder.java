package com.learn.methodprograms;

import java.util.Scanner;

public class MessageDecoder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a character");
		char ch=sc.next().charAt(0);
		
		System.out.println(unicode(ch));

	}
	public static int unicode(char ch)
	{
		int a=ch;
		return a;
	}

}
