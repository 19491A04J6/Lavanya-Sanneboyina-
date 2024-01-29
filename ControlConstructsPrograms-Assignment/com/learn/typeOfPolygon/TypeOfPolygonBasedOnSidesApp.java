package com.learn.typeOfPolygon;

import java.util.Scanner;

public class TypeOfPolygonBasedOnSidesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of sides");
		int sides=sc.nextInt();
		
		TypeOfPolygonBasedOnSides typ=new TypeOfPolygonBasedOnSides();
		typ.typeOfPolygon(sides);

	}

}
