package com.learn.strings.substrings;

public class PossibleSubstrings {
	public static void possibleSubstrings(String str)
	{
		String s="";
		for(int i=0;i<=str.length()-1;i++)
		{
			s="";
			for(int j=i;j<=str.length()-1;j++)
			{
				s=s+str.charAt(j);
				System.out.println(s);
			}
			System.out.println();
		}
	}

}
