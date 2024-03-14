package com.learn.strings.frequencyofeachcharacter;

public class CharFrequency {
	public static void charfrequency(String str)
	{
		char []ch=str.toCharArray();
		int count=0;
		
		System.out.println("The frequency of each character in a string is: ");
		for(int i=0;i<=str.length()-1;i++)
		{
			count=0;
			for(int j=0;j<=str.length()-1;j++)
			{
				if(ch[j]==ch[i])
				{
					count++;
				}
			}
			System.out.println(ch[i]+" --> "+count);
		}
	}

}
