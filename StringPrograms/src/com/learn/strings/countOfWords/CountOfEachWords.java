package com.learn.strings.countOfWords;

public class CountOfEachWords {
	public static void countOfWords(String str)
	{
		String []arr=str.split(" ");
		
		int count=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			count=0;
			for(int j=0;j<=arr[i].length()-1;j++)
			{
				count++;
			}
			System.out.println("Characters present in '"+arr[i]+"' is: "+count);
		}
		
	}

}
