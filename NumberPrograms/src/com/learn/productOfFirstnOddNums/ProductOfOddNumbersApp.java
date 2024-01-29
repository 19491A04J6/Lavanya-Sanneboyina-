package com.learn.productOfFirstnOddNums;

import java.util.Scanner;

public class ProductOfOddNumbersApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		
		ProductOfOddNumbers pro=new ProductOfOddNumbers();
		pro.productOfOdd(num);

	}

}
