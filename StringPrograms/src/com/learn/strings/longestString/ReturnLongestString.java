package com.learn.strings.longestString;

public class ReturnLongestString {
	public static String longestString(String str)
	{
		String []arr=str.split(" ");
		String longest="";
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i;j<=arr.length-1;j++)
			{
				if(arr[i].length()>=arr[j].length())
				{
					longest=arr[i];
				}
			}
			
		}
		return longest;
	}

}
