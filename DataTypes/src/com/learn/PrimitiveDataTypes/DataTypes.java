package com.learn.PrimitiveDataTypes;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();//reading an integer value
		byte b=sc.nextByte();//reading an byte value
		short c=sc.nextShort();//reading an short value
		long d=sc.nextLong();//reading an long value
		float e=sc.nextFloat();//reading an float value
		double f=sc.nextDouble();//reading an double value
		char g=sc.next().charAt(0);//reading an character value
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);

	}

}
