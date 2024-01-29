package com.learn.programAccordingToTheRequirements;

import java.util.Scanner;

public class ProgAccToRequirementsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		
		if(n>100)
		{
			ProgAccToRequirements.divideBy2(n);
			ProgAccToRequirements.divideBy3(n);
			ProgAccToRequirements.divideBy5(n);
			ProgAccToRequirements.divideBy2and5(n);
			ProgAccToRequirements.divideBy3and5(n);
			ProgAccToRequirements.primeNumbers(n);
			ProgAccToRequirements.evenNumsDivisibleBy3(n);
			ProgAccToRequirements.oddNumsDivisibleBy5(n);
			ProgAccToRequirements.evenPrimes(n);
			ProgAccToRequirements.oddPrimes(n);
			
		}
		else
		{
			System.out.println("enter the number above 100");
		}

	}

}
