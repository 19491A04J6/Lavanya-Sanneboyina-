package com.learn.controlconstructs.displayLocationFromNames;

import java.util.Scanner;

public class UsingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String str=sc.next();
		
		switch(str)
		{
		case "Lavanya" : System.out.println(str+" Live in Banglore");
		                 break;
		                 
		case "Sravya" : System.out.println(str+" Live in Ongole");
        break;
		
		case "Lasya" : System.out.println(str+" Live in Ongole");
        break;
        
		case "Sahithi" : System.out.println(str+" Live in Hyderabad");
        break;
        
        default : System.out.println(str+" Live in India");
		}

	}

}
