package com.learn.strings.anagrams;

import java.util.Arrays;

public class StringAnagrams {
	public static void stringAnagram(String str1,String str2)
	{
		char []ch1=str1.toCharArray();
		Arrays.sort(ch1);
		
		char []ch2=str2.toCharArray();
		Arrays.sort(ch2);
		
		String s1=new String(ch1);
		String s2=new String(ch2);
		
		if(s1.equals(s2))
		{
			System.out.println("Both Strings are anagrams");
		}
		else
		{
			System.out.println("Both Strings are not anagrams");
		}
	}

}
