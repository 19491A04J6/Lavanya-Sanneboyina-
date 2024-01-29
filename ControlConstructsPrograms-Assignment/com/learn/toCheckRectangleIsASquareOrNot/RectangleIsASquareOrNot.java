package com.learn.toCheckRectangleIsASquareOrNot;

public class RectangleIsASquareOrNot {
	public static void rectangleissquareornot(int side1,int side2,int side3,int side4)
	{
		if(side1==side2 && side2==side3 && side3==side4)
		{
			System.out.println("Rectangle is a Square");
		}
		else
		{
			System.out.println("Rectangle is not a square");
		}
	}

}
