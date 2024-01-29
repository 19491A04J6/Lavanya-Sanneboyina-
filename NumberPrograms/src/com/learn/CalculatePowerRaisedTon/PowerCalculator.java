package com.learn.CalculatePowerRaisedTon;

public class PowerCalculator {
	public static int calculatePower(int base,int exp)
	{
		int pow=1;
		for(int i=1;i<=exp;i++)
		{
			pow=pow*base;
		}
		return pow;
	}

	
}
