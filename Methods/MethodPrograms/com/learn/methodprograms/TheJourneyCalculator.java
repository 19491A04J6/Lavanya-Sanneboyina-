package com.learn.methodprograms;

import java.util.Scanner;

public class TheJourneyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the speed");
		double speed=sc.nextDouble();
        
		System.out.println("enter the time");
		double time=sc.nextDouble();
		
		System.out.println(distanceCalculator(speed,time));

	}

	public static double distanceCalculator(double speed,double time){
		// TODO Auto-generated method stub
		return speed*time;
	}

}
