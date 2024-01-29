package com.learn.numberIsArmstrongNumbersOrNot;

public class ArmstrongNumber {
	public static void armstrongNumber(int num)
	{
		int sum=0,n1,n=num,temp=num;
		int digit=0;
		while(num!=0)
		{
			n1=num%10;//3
			num=num/10;//15
			digit++;
		}
		System.out.println("No of Digits "+digit);
		
		while(n>0)
		{
			n1=n%10;//3 5 1
			sum=(int) (sum+Math.pow(n1, digit));//27+125+1
			n=n/10;//15 1 
		}
		System.out.println("sum of powers of digits "+sum);
		if(temp==sum)
		{
			System.out.println("Given number is an armstrong number");
		}
		else
		{
			System.out.println("Given number is not an armstrong number");
		}
		
	}

}
