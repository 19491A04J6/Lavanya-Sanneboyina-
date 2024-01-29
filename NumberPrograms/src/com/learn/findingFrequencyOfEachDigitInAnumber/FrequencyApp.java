package com.learn.findingFrequencyOfEachDigitInAnumber;

import java.util.Scanner;

public class FrequencyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		
		Frequency f=new Frequency();
		f.freq(num);
		

	}

}
