package com.learn.java.reverseLetters;

import java.util.Scanner;


public class ReverseCharactersApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str1=sc.nextLine();
		
		
		ReverseCharacters se=new ReverseCharacters();
		se.reverseCharacters(str1);

	}

}
