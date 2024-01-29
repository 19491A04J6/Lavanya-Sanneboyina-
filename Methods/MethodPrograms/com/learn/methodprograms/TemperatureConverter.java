package com.learn.methodprograms;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the temperature in fahrenheit");
		double temp=sc.nextDouble();
        
        System.out.println(fahrenheitToCelcius(temp));
	}
	public static double fahrenheitToCelcius(double temp)
	{
		double c=(temp-32)*5/9;
		return c;
	}

}
