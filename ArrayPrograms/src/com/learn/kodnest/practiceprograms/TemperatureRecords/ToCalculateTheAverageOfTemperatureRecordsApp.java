package com.learn.kodnest.practiceprograms.TemperatureRecords;

import java.util.Scanner;

public class ToCalculateTheAverageOfTemperatureRecordsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of temperatures");
		int temp=sc.nextInt();
		
		//creating an integer array 
		float []arr=new float[temp];
		
		//reading the array elements
		System.out.println("enter the temperatures");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextFloat();
		}
		
		ToCalculateTheAverageOfTemperatureRecords.temperatureRecord(arr);

	}

}
