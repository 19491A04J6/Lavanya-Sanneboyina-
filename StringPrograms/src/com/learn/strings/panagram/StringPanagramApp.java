package com.learn.strings.panagram;

import java.util.Scanner;

public class StringPanagramApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str1=sc.nextLine();
        
		StringPanagram pana=new StringPanagram();
		pana.stringPanagram(str1);
	}

}
