package com.learn.stringPanagram;

public class StringPanagram {
	public static void stringPanagram(String str)
	{
		String s=str.replace(" ","");
		
		int count=0;
		String newstr="";
		
		for(int i=0;i<=s.length()-1;i++)
		{
			if(!(newstr.contains(s.charAt(i)+"")))
			{
				if((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z'))
					{
						newstr=newstr+s.charAt(i);
						count++;
					}
			}
		}
		if(count==26)
		{
			System.out.println("Given string is a panagram");
		}
		else
		{
			System.out.println("Given string is not a panagram");
		}
	}

}
