package com.learn.strings.anagrams;

import java.util.Scanner;

public class StringAnagramsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String str1=sc.next();
		
		System.out.println("enter second string");
		String str2=sc.next();
		
		StringAnagrams ana=new StringAnagrams();
		ana.stringAnagram(str1,str2);

	}

}
