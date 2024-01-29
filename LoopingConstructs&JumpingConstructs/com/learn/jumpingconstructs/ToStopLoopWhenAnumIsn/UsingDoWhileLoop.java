package com.learn.jumpingconstructs.ToStopLoopWhenAnumIsn;

import java.util.Scanner;

public class UsingDoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		int i=1;
		do
		{
			if(i==7)
			{
				break;
			}
			System.out.print(i+" ");
			i++;
		}while(i<=num);

	}

}
