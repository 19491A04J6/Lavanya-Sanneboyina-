package com.learn.discountApplicable;

import java.util.Scanner;

public class DiscountApplicableApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the amount of purchase");
		int amount=sc.nextInt();
        
		DiscountApplicable da=new DiscountApplicable();
		da.discount(amount);
	}

}
