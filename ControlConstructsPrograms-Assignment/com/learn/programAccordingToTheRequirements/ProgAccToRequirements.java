package com.learn.programAccordingToTheRequirements;

public class ProgAccToRequirements {
	public static void divideBy2(int num)
	{
		System.out.println("Numbers divisible by 2 are ");
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
	}
	
	public static void divideBy3(int num)
	{
		System.out.println("Numbers divisible by 3 are ");
		for(int i=1;i<=num;i++)
		{
			if(i%3==0)
			{
				System.out.print(i+" ");
			}
		}
	}
	
	public static void divideBy5(int num)
	{
		System.out.println("Numbers divisible by 5 are ");
		for(int i=1;i<=num;i++)
		{
			if(i%5==0)
			{
				System.out.print(i+" ");
			}
		}
	}
	
	public static void divideBy2and5(int num)
	{
		System.out.println("Numbers divisible by 2 and 5 are ");
		for(int i=1;i<=num;i++)
		{
			if(i%2==0 && i%5==0)
			{
				System.out.print(i+" ");
			}
		}
	}
	
	public static void divideBy3and5(int num)
	{
		System.out.println("Numbers divisible by 3 and 5 are ");
		for(int i=1;i<=num;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.print(i+" ");
			}
		}
	}

	public static void primeNumbers(int num)
	{
		if(!(num>0))
		{
			System.out.println("Not a prime number");
		}
		else {
		System.out.println("Prime Numbers are ");
		int count=0;
		for(int i=1;i<=num;i++)
		{
			count=0;
			for(int j=2;j<=i;j++)
			{
			if(i%j==0)
			{
				count++;
			}
			}
			if(count==1)
			{
				System.out.print(i+" ");
			}
		}
		}
	}
	
	public static void evenNumsDivisibleBy3(int num)
	{
		System.out.println("Even Numbers divisible by 3 are ");
		for(int i=1;i<=num;i++)
		{
			if(i%2==0 && i%3==0)
			{
				System.out.print(i+" ");
			}
		}
	}
	
	public static void oddNumsDivisibleBy5(int num)
	{
		System.out.println("Odd Numbers divisible by 5 are ");
		for(int i=1;i<=num;i++)
		{
			if(i%2!=0 && i%5==0)
			{
				System.out.print(i+" ");
			}
		}
	}
	
	public static void evenPrimes(int num)
	{
		System.out.println("Even Primes are ");
		int count=0;
		for(int i=1;i<=num;i++)
		{
			count=0;
			for(int j=2;j<=i;j++)
			{
			if(i%j==0 && i%2==0)
			{
				count++;
			}
			}
			if(count==1)
			{
				System.out.print(i+" ");
			}
	}
	}
	
	public static void oddPrimes(int num)
	{
		System.out.println("Odd Primes are ");
		int count=0;
		for(int i=1;i<=num;i++)
		{
			count=0;
			for(int j=2;j<=i;j++)
			{
			if(i%j==0 && i%2!=0)
			{
				count++;
			}
			}
			if(count==1)
			{
				System.out.print(i+" ");
			}
	}
	}
	
}
