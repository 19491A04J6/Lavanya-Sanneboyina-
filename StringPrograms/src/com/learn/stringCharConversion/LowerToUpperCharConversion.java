package com.learn.stringCharConversion;

public class LowerToUpperCharConversion {
	public static void LowerToUppercharConversion(String str)
	{
	//using .touppercase() method
			String str1=str.toUpperCase();
			System.out.println("With in-built method: ");
			System.out.println("The conversion of string "+str+" to uppercase is: "+str1);
			
			//without in-built method
			char []ch=new char[str.length()];
			
			for(int i=0;i<=str.length()-1;i++)
			{
				ch[i]=(char) (str.charAt(i)-32);
			}
			
			String s=new String(ch);
			System.out.println("Without in-built method: ");
			System.out.println("The conversion of string "+str+" to uppercase is: "+str1);

}
}
