package com.learn.stringReverseWords;

public class ReverseWords {

	public static void reverseWords(String str) {
		// TODO Auto-generated method stub
		String []strarr=str.split(" ");
		String rev="";
		
		for(int i=strarr.length-1;i>=0;i--)
		{
			rev=rev+strarr[i]+" ";
			System.out.println(rev);
		}
		System.out.println("The String after reversing the order of words is: "+rev);
		
	}

}
