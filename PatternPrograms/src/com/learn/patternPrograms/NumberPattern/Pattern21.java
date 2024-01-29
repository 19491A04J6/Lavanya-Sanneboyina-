package com.learn.patternPrograms.NumberPattern;

import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int rows=sc.nextInt();
        int count=1;
		 for(int i=1;i<=rows;i++)
	        {
	        	for(int j=1;j<=rows;j++)
	        	{
	        		if(count>=10)
	        		{
	        		System.out.print(count);
	        		}
	        		else
	        		{
	        			System.out.print("0"+count);
	        		}
	        		count++;
	        	}
	        	System.out.println();
	        }

	}

}
