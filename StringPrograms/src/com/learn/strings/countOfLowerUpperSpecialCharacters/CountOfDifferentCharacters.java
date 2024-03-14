package com.learn.strings.countOfLowerUpperSpecialCharacters;

public class CountOfDifferentCharacters {
	public static void countOfSpecificCharacters(String str)
	{
		String s=str.replace(" ","");
		
		int count1=0,count2=0,count3=0,count4=0;
		String newstr1="",newstr2="",newstr3="",newstr4="";
		
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				count1++;
				newstr1=newstr1+s.charAt(i)+",";
			}
			else if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				count2++;
				newstr2=newstr2+s.charAt(i)+",";
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				count3++;
				newstr3=newstr3+s.charAt(i)+",";
			}
			else
			{
				count4++;
				newstr4=newstr4+s.charAt(i)+",";
			}
		}
		
	  System.out.println("count of uppercase characters: "+count1);
	  System.out.println("uppercase characters: "+newstr1);
	  System.out.println();
	  System.out.println("count of lowercase characters: "+count2);
	  System.out.println("lowercase characters: "+newstr2);
	  System.out.println();
	  System.out.println("count of numbers: "+count3);
	  System.out.println("Numbers: "+newstr3);
	  System.out.println();
	  System.out.println("count of special characters: "+count4);
	  System.out.println("special characters: "+newstr4);
	  System.out.println();	
	  
	   
	}

}
