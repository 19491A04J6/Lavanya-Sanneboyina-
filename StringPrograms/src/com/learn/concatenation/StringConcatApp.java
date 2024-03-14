package com.learn.concatenation;

import java.util.Scanner;


public class StringConcatApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
    Scanner sc=new Scanner(System.in);
	System.out.println("enter first string");
	String str1=sc.next();
	
	System.out.println("enter second string");
	String str2=sc.next();
	
	StringConcat se=new StringConcat();
	se.stringsconcat(str1,str2);

}
}
