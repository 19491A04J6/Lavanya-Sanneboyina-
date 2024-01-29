package com.learn.patternPrograms.NumberPattern;

import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int rows=sc.nextInt();
        int count=0;
		 for(int i=1;i<=rows;i++)
	        {
	        	for(int j=1;j<=rows;j++)
	        	{
	        		count++;
	        		System.out.print(count);
	        	}
	        	System.out.println();
	        }

	}

}
