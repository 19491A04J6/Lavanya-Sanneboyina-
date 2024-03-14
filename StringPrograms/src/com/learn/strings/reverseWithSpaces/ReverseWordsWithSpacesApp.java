package com.learn.strings.reverseWithSpaces;

import java.util.Scanner;

public class ReverseWordsWithSpacesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str1=sc.nextLine();
		
		ReverseWordsWithSpaces rev=new ReverseWordsWithSpaces();
		rev.reverseWithSpaces(str1);

	}

}
