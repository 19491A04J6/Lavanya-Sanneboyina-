package com.learn.strings.wordCount;

import java.util.Scanner;

public class PrintingWordsAndWordCountApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str1=sc.nextLine();
		
		PrintingWordsAndWordCount cout=new PrintingWordsAndWordCount();
		cout.wordCount(str1);

	}

}
