package methodToMethodCall;

import java.util.Scanner;

public class StaticToStaticOfSameClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		
		add(a,b);

	}
	public static void add(int x,int y)
	{
		System.out.println(x+y);
	}

}
