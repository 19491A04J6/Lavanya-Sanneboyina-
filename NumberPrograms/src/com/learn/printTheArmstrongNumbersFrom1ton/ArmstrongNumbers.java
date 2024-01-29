package com.learn.printTheArmstrongNumbersFrom1ton;

public class ArmstrongNumbers {
	public static void armstrong(int num)
	{
		for(int i=1;i<=num;i++)
		{
			armstrongNumbers(i);
		}
	}
	public static void armstrongNumbers(int num)
	{
			int sum=0,n1,n=num,temp=num;
			int digit=0;
			while(num!=0)
			{
				n1=num%10;//3
				num=num/10;//15
				digit++;
			}
			
			while(n>0)
			{
				n1=n%10;//3 5 1
				sum=(int) (sum+Math.pow(n1, digit));//27+125+1
				n=n/10;//15 1 
			}
		    if(temp==sum)
		    {
		    	System.out.print(temp+" ");
		    	
		    }
		}
	}
     
