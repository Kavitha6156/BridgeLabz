package com.BridgeLabz.Algorithm;

public class Bubblesort
{
public static void bubble(int arr[])
{
	int n=arr.length;
	for(int i=0;i<=n-1;i++)
	{
		for(int j=i+1;j<=n-2;j++)
		{
		 if(arr[i]>arr[j])
		 {
			 int temp=arr[i];
			 arr[i]=arr[j];
			 arr[j]=temp;
		 }
		}
	}
}
}
