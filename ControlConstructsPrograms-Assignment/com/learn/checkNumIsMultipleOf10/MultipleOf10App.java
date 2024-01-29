package com.learn.checkNumIsMultipleOf10;

import java.util.Scanner;

public class MultipleOf10App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		MultipleOf10 mul=new MultipleOf10();
		mul.multipleof10(num);

	}

}
