package com.learn.patternPrograms;

import java.util.Scanner;

public class SquareHallowPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int rows=sc.nextInt();
        
		 for(int i=1;i<=rows;i++)
	        {
	        	for(int j=1;j<=rows;j++)
	        	{
	        		System.out.print("-");
	        	}
	        	for(int j=1;j<=rows;j++)
	        	{
	        		if(i==1 || j==1 || j==5 || i==5)
	        		{
	        		System.out.print("*");
	        		}
	        		else
	        		{
	        			System.out.print(" ");
	        		}
	        	}
	        	
	        	System.out.println();
	        }

	}

}
