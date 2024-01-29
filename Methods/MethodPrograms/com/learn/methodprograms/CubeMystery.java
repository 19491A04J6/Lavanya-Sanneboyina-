package com.learn.methodprograms;

import java.util.Scanner;

public class CubeMystery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		
		System.out.println(CubeMyster(num));

	}
	public static int CubeMyster(int num)
	{
		 int c=num*num*num;
		 return c;
	}


}
