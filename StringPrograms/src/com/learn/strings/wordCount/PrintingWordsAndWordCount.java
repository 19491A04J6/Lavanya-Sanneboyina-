package com.learn.strings.wordCount;

public class PrintingWordsAndWordCount {
	public static void wordCount(String str)
	{
		String []arr=str.split(" ");
		
		String newstr="";
		int count=0;
		for(int i=0;i<=arr.length-1;i++)
		{
	      newstr=arr[i];
	       System.out.println("Word "+(i+1)+": "+newstr);
	       count++;
		}
		System.out.println("Total number of words: "+count);
	}

}
