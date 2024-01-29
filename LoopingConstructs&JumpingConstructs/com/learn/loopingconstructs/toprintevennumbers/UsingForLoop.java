package com.learn.loopingconstructs.toprintevennumbers;

import java.util.Scanner;

public class UsingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		//if you know where to start and until where to go
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" ");
			}
		}

	}

}
