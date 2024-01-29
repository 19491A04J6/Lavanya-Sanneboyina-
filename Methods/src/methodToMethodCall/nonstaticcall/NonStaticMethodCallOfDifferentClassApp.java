package methodToMethodCall.nonstaticcall;

import java.util.Scanner;

import methodToMethodCall.StaticToStatic.StaticToStaticOfDifferentClasses;

public class NonStaticMethodCallOfDifferentClassApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		
		NonStaticMethodCallOfDifferentClass ns=new NonStaticMethodCallOfDifferentClass();
		ns.add(a,b);

	}

}
