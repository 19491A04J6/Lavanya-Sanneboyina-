package com.learn.patternPrograms.NumberPattern;

import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int rows=sc.nextInt();
        
		 for(int i=1;i<=rows;i++)
	        {
	        	for(int j=1;j<=i;j++)
	        	{
	        		System.out.print(j);
	        	}
	        	System.out.println();
	        }

	}

}
