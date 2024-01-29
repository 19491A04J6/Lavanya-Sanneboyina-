package com.learn.TypeCasting;

public class TypeCastingSameSizeDataTypes {

	public static void main(String[] args) {
		//short to char and char to short
		short a=69;
		char b=(char)a;
		System.out.println(b);
		
		char ch='A';
		short s=(short)ch;
		System.out.println(s);
		
		//float to integer and integer to float
         int i=10;
         float f=i;
         System.out.println(f);
         
         float fl=3.456f;
         int g=(int)fl;//because in case of float to integer float has more accuracy(exact value) than integer(round figure)
         System.out.println(g);
	}

}
