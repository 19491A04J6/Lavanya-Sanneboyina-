package com.learn.unicodes;

import java.util.Scanner;

public class UnicodesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str1=sc.next();
		
		Unicodes u=new Unicodes();
		u.unicodes(str1);

	}

}
