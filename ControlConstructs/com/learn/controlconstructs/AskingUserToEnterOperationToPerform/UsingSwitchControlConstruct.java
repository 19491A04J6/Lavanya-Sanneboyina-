package com.learn.controlconstructs.AskingUserToEnterOperationToPerform;

import java.util.Scanner;

public class UsingSwitchControlConstruct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=sc.nextInt();
		
		System.out.println("enter second number");
		int num2=sc.nextInt();
		
		System.out.println("enter the operation to be performed");
		char ch=sc.next().charAt(0);
		
		switch(ch)
		{
		case '+' : System.out.println(num1+num2);
		           break;
		           
		case '-' : System.out.println(num1-num2);
                   break;
        
		case '*' : System.out.println(num1*num2);
                   break;
        
		case '/' : System.out.println(num1/num2);
                   break;
        
		default : System.out.println("Invalid Input");
        
		}

	}

}
