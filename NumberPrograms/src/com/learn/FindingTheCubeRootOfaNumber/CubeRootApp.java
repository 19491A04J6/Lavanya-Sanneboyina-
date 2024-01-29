package com.learn.FindingTheCubeRootOfaNumber;

import java.util.Scanner;

public class CubeRootApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		
		CubeRoot cbrt=new CubeRoot();
		cbrt.cubeRoot(num);

	}

}
