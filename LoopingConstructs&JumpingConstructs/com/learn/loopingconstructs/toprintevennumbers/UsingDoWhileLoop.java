package com.learn.loopingconstructs.toprintevennumbers;

import java.util.Scanner;

public class UsingDoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		int i=1;
		//if you want to run the code at least once
		do
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
			i++;
		}while(i<=num);

	}

}
