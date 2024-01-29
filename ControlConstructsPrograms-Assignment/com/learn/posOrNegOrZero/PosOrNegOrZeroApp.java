package com.learn.posOrNegOrZero;

import java.util.Scanner;

public class PosOrNegOrZeroApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		PosOrNegOrZero pon=new PosOrNegOrZero();
		pon.PosorNegorZero(num);

	}

}
