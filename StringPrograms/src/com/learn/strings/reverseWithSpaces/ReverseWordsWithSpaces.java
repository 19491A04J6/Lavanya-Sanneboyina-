package com.learn.strings.reverseWithSpaces;

public class ReverseWordsWithSpaces {
	public static void reverseWithSpaces(String str)
	{
		//if we do not replace white spaces then the white spaces present in string str will also be stored
		String s=str.replace(" ", "");
		System.out.println(s);
		char []ch=new char[str.length()];
		int j=s.length()-1;
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)==' ')
			{
				ch[i]=' ';
			}
			else
			{
				ch[i]=s.charAt(j);
				j--;
			}
		}
		String st=new String(ch);
		System.out.println("The resulatant String after reversing without preserving white spaces is: "+st);
	}

}
