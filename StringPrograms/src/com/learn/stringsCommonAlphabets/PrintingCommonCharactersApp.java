package com.learn.stringsCommonAlphabets;

import java.util.Scanner;

public class PrintingCommonCharactersApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first name");
		String str1=sc.nextLine();
		
		System.out.println("enter last name");
		String str2=sc.nextLine();
		
		PrintingCommonCharacters com=new PrintingCommonCharacters();
		com.commonCharacters(str1,str2);

	}

}
