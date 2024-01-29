package com.learn.methodprograms;

import java.util.Scanner;

public class AverageSemMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		  System.out.println("enter sem1 marks");
		  int sem1=sc.nextInt();
		  System.out.println("enter sem2 marks");
		  int sem2=sc.nextInt();
		  System.out.println("enter sem3 marks");
		  int sem3=sc.nextInt();
		  System.out.println("enter sem4 marks");
		  int sem4=sc.nextInt();
		  System.out.println("enter sem5 marks");
		  int sem5=sc.nextInt();
		  System.out.println("enter sem6 marks");
		  int sem6=sc.nextInt();
		  System.out.println("enter sem7 marks");
		  int sem7=sc.nextInt();
		  System.out.println("enter sem8 marks");
		  int sem8=sc.nextInt();

		  
		  double avg=average(sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8);
		  System.out.println("the average marks of student is:"+avg);
		 }
	
		  public static double average(int a,int b,int c,int d,int e,int f,int g,int h)
		{
		 double i=(a+b+c+d+e+f+g+h)/8;
		 return i;

	}

}
