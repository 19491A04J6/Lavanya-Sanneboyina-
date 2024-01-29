package com.learn.greatestOfThreeNumbers;

public class GreatestOfThreeNumbers {
	public static void greatestOfThreeNumbers(int a,int b,int c)
	{
		if(a==b & a==c)
		{
			System.out.println("All are equal");
		}
		else {
	      if(a>b && a>c)
		{
			System.out.println(a+"is is greatest");
		}
	      else if(b>a && b>c)
		{
			System.out.println(b+" is greatest");
		}
	      else
		{
			System.out.println(c+" is greatest");
		}
	}
	}

}
