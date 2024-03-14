package com.learn.strings.charConversion;

public class CharConversion {
	public static void charconversion(String str)
	{
		char []ch=new char[str.length()];
		for(int i=0;i<=str.length()-1;i++)
		{
			//to lowercase
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				ch[i]=(char) (str.charAt(i)+32);
			}
			else
			{
				ch[i]=(char) (str.charAt(i)-32);
			}
		}
		
		String s=new String(ch);
		
		System.out.println("The conversion of upper to lower and lower to upper is: "+s);
	}

}
