package com.learn.upperAndLowerCharacterCount;

public class UpperAndLowerCharCount {
	public static void characterCount(String str)
	{
		int count=0,count1=0;
		for(int i=0;i<=str.length()-1;i++)
		{
		if((str.charAt(i)>='A') && (str.charAt(i)<='Z'))
		{
			count++;
		}
		else
		{
			count1++;
		}
	}
		System.out.println("The count of uppercase characters in string "+str+" is: "+count);
		System.out.println("The count of lowercase characters in string "+str+" is: "+count1);

}
}
