package com.learn.kodnest.practiceprograms.countingGrades;

public class ToCountAndPrintGradesOfStudents {
	public static void countingGrades(int []arr)
	{
		int count=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>75)
			{
				count++;
			}
		}
		System.out.println("The count of grades of students above 75 are: "+count);
	}

}
