package com.learn.replacewith99;

public class ReplaceSpaceWith99 {
	public static void replaceSpace(String str)
	{
		String s="";
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)==' ')
			{
				s=s+"99";
			}
			else
			{
				s=s+str.charAt(i);
			}
		}
	
		System.out.println("The string after replacing spaces with 99 is: "+s);
	}

}
