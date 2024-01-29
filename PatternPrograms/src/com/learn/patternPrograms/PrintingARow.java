package com.learn.patternPrograms;
import java.util.Scanner;

public class PrintingARow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int rows=sc.nextInt();
        
        for(int i=1;i<=rows;i++)
        {
        	System.out.print("*"+" ");
        }
	}

}
