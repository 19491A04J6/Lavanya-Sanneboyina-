package com.learn.findingFrequencyOfEachDigitInAnumber;

public class Frequency {
	public static void freq(int num)
	{
		int n1;
		while(num!=0)
		{
			n1=num%10;
			frequency(n1);
			num=num/10;
		}
	}
	public static void frequency(int num)
	{
		int a=num,count=0;
		if(a==num)
		{
			count++;
			
			
		}
	}

}
