package com.learn.kodnest.practiceprograms.TemperatureRecords;

public class ToCalculateTheAverageOfTemperatureRecords {
	public static void temperatureRecord(float []arr)
	{
		float avg=0;int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			sum+=arr[i];
		}
		
		avg=sum/arr.length;
		
		System.out.println("The average record of temperatures are: "+avg);
	}

}
