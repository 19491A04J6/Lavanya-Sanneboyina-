package com.learn.holloPatternPrograms;

import java.util.Scanner;

public class PrintingRightAngleTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int rows=sc.nextInt();   
        
            for(int i=1;i<=rows;i++)
	        {
	        	for(int j=1;j<=i;j++)
	        	{
	        		if(j==1 || j==i || i==5)
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
