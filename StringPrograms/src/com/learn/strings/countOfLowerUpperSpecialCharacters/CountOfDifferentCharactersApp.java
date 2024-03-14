package com.learn.strings.countOfLowerUpperSpecialCharacters;

import java.util.Scanner;

public class CountOfDifferentCharactersApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str1=sc.nextLine();
		
		CountOfDifferentCharacters cou=new CountOfDifferentCharacters();
		cou.countOfSpecificCharacters(str1);

	}

}
