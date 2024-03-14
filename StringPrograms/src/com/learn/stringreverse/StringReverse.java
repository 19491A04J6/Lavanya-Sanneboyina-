package com.learn.stringreverse;

public class StringReverse {
	public static void stringreverse(String str)
	{
		char []ch=str.toCharArray();
		
		int j=0;
		char []revch=new char[str.length()];
		System.out.println("Reverse of a string "+str+" is: ");
		for(int i=str.length()-1;i>=0;i--)
		{
			revch[j]=ch[i];
			j++;
		}
		String rev=new String(revch);
		System.out.println(rev);
	}

}
