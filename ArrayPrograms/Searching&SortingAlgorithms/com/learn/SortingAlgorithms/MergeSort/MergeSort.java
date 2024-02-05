package com.learn.SortingAlgorithms.MergeSort;

public class MergeSort {
	public static void mSort(int []arr,int first,int last)
	{
		int mid;
		if(first<last)
		{
			mid=(first+last)/2;
			
			System.out.println("mid "+mid);
			System.out.println("first "+first);
			System.out.println("Last "+last);
			
			mSort(arr,first,mid);//finally : first=0,mid=0,last=1
			mSort(arr,mid+1,last);//finally : first=
			mergeSort(arr,first,mid,last);
		}
	}

	public static void mergeSort(int []arr,int first,int mid,int last)
	{
		System.out.println("first "+first+" mid "+mid+" last "+last);
		int i=first;//low value //i=0   //i=2    //i=0
		int j=mid+1;//high value//j=1   //j=3    //j=2
		int m=mid;//m=0  //m=2   //m=1
		int k=first;//k=0 //k=2  //k=0
		
		//new array to store the elements
		int []b=new int[arr.length];
		
		while(i<=mid && j<=last)//0<=0 && 1<=1-true ;0<=0 && 2<=1-false;1<=0 && 2<=1-false   
			                    //2<=2 && 3<=3-true ;3<=2 && 3<=3-false
		{
			if(arr[i]<arr[j])//7<5-false  //2<3
			{
				b[k]=arr[i];//b[2]=2
				i++;//i=3
				k++;//k=3
			}
			else
			{
				b[k]=arr[j];//b[0]=5
				k++;//k=1
				j++;//j=2
			}
		}
		while(i<=mid)//0<=0-true;1<=0-false  //3<=2-false
		{
			System.out.println("i "+i+" mid"+mid);
			b[k]=arr[i];//b[1]=7;
			k++;//k=2
			i++;//i=1
		}
		while(j<=last)//3<=3-true
		{
			b[k]=arr[j];//b[3]=3
			j++;//j=4
			k++;//k=4
			
		}
		
		for(int x:b)
		{
		System.out.print(x+" ");
		}
		for(int p=first;p<=last;p++)
		{
		 arr[p]=b[p];
		}
		
	}

}
