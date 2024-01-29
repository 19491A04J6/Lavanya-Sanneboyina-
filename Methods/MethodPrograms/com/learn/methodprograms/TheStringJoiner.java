package com.learn.methodprograms;

import java.util.Scanner;

public class TheStringJoiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first name");
		String fname=sc.next();
		
		System.out.println("enter Last name");
		String lname=sc.next();
		
		System.out.println(StringJoiner(fname,lname));

	}
	public static String StringJoiner(String fname,String lname)
	{
		return fname.concat(lname);
	}

}
