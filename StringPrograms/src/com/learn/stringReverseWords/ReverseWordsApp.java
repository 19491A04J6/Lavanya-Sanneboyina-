package com.learn.stringReverseWords;

import java.util.Scanner;

public class ReverseWordsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str1=sc.nextLine();
		
		ReverseWords rev=new ReverseWords();
		rev.reverseWords(str1);

	}

}
