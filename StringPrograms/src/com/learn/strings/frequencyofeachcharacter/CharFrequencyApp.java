package com.learn.strings.frequencyofeachcharacter;

import java.util.Scanner;

public class CharFrequencyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str1=sc.next();
		
		CharFrequency ch=new CharFrequency();
		ch.charfrequency(str1);
	}

}
