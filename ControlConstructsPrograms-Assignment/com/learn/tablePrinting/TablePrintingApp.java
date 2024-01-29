package com.learn.tablePrinting;

import java.util.Scanner;

public class TablePrintingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		
		TablePrinting tp=new TablePrinting();
		tp.tablePrinting(num);

	}

}
