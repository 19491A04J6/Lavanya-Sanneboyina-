package com.learn.FindTheSquareRootOfaNumber;

import java.util.Scanner;

public class SquareRootApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		
		SquareRoot sqrt=new SquareRoot();
		sqrt.squareRoot(num);

	}

}
