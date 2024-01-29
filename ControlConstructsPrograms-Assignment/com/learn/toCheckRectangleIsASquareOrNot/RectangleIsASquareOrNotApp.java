package com.learn.toCheckRectangleIsASquareOrNot;

import java.util.Scanner;

public class RectangleIsASquareOrNotApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of side1");
		int side1=sc.nextInt();
		
		System.out.println("enter length of side2");
		int side2=sc.nextInt();
		
		System.out.println("enter length of side3");
		int side3=sc.nextInt();
		
		System.out.println("enter length of side4");
		int side4=sc.nextInt();
		
		RectangleIsASquareOrNot ris=new RectangleIsASquareOrNot();
		ris.rectangleissquareornot(side1,side2,side3,side4);

	}

}
