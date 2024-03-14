package com.learn.string.replacewith99;

import java.util.Scanner;

public class ReplaceSpaceWith99App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str1=sc.nextLine();
		
		ReplaceSpaceWith99 rep=new ReplaceSpaceWith99();
		rep.replaceSpace(str1);

	}

}
