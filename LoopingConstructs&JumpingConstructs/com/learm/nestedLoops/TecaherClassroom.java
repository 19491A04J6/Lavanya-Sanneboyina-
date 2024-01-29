package com.learm.nestedLoops;

import java.util.Scanner;

public class TecaherClassroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of schools");
		int sch=sc.nextInt();
		
		System.out.println("enter no of classes in each school");
		int cls=sc.nextInt();
		
		System.out.println("enter no of students in each class of each school");
		int stu=sc.nextInt();
		
		for(int i=1;i<=sch;i++)
		{
			for(int j=1;j<=cls;j++)
			{
				for(int k=1;k<=stu;k++)
				{
					if(sch%2!=0 && stu%2==0)
					{
						System.out.println("Student "+k+" of class "+j+" of school "+i+" have completed the assignments");
					}
					else if(sch%2==0 && stu%2!=0)
					{
						System.out.println("Student "+k+" of class "+j+" of school "+i+"  have not completed the assignments");
					}
					else
					{
						System.out.println("Student is still doing the assignment");
					}
				}
			}
		}
		System.out.println("All the assignments are checked");



	}

}
