package com.learn.patternPrograms.NumberPattern;

import java.util.Scanner;

public class PrintingEvenAndOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int rows=sc.nextInt();     
        
		 int count=0,count1=1;
	        
         for(int i=1;i<=rows;i++)
	        {
	        	for(int j=1;j<=rows;j++)
	        	{
	        	  if(i<=2)
	        	 {
	        		count+=2;
	        		if(count%2==0 && count<10)
	        		{
	        		System.out.print("0"+count);
	        		}
	        		else
	        		{
	        			System.out.print(count);
	        		
	        		}
	        	  }
	        	  else
	        	  {
	        		  if(count1%2!=0 && count1<10)
		        		{
		        		System.out.print("0"+count1);
		        		}
		        		else
		        		{
		        			System.out.print(count1);
		        		}
	        		  count1+=2;
	        	  }
	        	   
	        	}
	        	System.out.println();
	        }

	}

}
