package com.learn.kodnest.practiceprograms.countingGrades;

import java.util.Scanner;

public class ToCountAndPrintGradesOfStudentsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of students");
		int stu=sc.nextInt();
		
		//creating an integer array 
		int []arr=new int[stu];
		
		//reading the array elements
		System.out.println("enter the grades of students");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}

		ToCountAndPrintGradesOfStudents.countingGrades(arr);
	}

}
