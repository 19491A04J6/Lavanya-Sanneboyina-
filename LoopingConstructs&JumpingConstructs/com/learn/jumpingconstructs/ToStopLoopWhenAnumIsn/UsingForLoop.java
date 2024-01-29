package com.learn.jumpingconstructs.ToStopLoopWhenAnumIsn;

import java.util.Scanner;

public class UsingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			if(i==7)
			{
				break;
			}
			System.out.print(i+" ");
		}

	}

}
