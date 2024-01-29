package com.learn.characterIdentification;

import java.util.Scanner;

public class CharacterIdentificationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a character");
		char ch=sc.next().charAt(0);
		
		CharacterIdentification ci=new CharacterIdentification();
		ci.identifyCharacter(ch);

	}

}
