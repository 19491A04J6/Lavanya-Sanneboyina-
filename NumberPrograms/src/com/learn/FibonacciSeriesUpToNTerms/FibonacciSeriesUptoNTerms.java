package com.learn.FibonacciSeriesUpToNTerms;

public class FibonacciSeriesUptoNTerms {
	public static void fibonacci(int num)
	{
		int n1=0,n2=1;
		int n3;
		System.out.print("fibonacci series upto n terms are: "+n1+" "+n2+" ");
		for(int i=1;i<=num;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(n3+" ");
		}
		
	}

}
