package com.learn.patternPrograms;

import java.util.Scanner;

public class Printing5rowsAndColumns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int rows=sc.nextInt();
        System.out.println("enter the number of columns");
        int cols=sc.nextInt();
        
        for(int i=1;i<=rows;i++)
        {
        	for(int j=1;j<=cols;j++)
        	{
        	System.out.print("*");
        	}
        	System.out.println();
        }

	}

}
