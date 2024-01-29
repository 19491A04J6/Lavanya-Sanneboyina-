package com.learm.nestedLoops;

import java.util.Scanner;

public class FarmerSeeds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows");
		int rows=sc.nextInt();
		System.out.println("enter no of spots");
		int spots=sc.nextInt();
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=spots;j++)
			{
				System.out.println("Farmer has sowed the seed in row "+i+" spot "+j);
			}
		}
		System.out.println("completed planting");

	}

}
