package com.learn.strings.countOfWords;

import java.util.Scanner;

public class CountOfEachWordsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str1=sc.nextLine();
		
		CountOfEachWords cot=new CountOfEachWords();
		cot.countOfWords(str1);

	}

}
