package com.learn.java.reverseLetters;

public class ReverseCharacters {
	public static void reverseCharacters(String str)
	{
		String []arr=str.split(" ");
		String s="";
		
		
		for(int i=0;i<=arr.length-1;i++)//this is a java program-0 1 2 3 4
		{
			for(int j=arr[i].length()-1;j>=0;j--)//j=this->3 j=is->1 j=a->0 j=java->3 j=program->6
			{
			 	s=s+arr[i].charAt(j);//arr[i]=this.charAt(j)=s
			}
			s=s+" ";
		}
		System.out.println("entered string is:"+str);
		System.out.println("Reversed string is: "+s);
	}

}
