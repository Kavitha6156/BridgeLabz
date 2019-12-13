package com.BridgeLabz.Test;

import com.BridgeLabz.Algorithm.Binarysearch;
import com.BridgeLabz.Util.UtilClass;

public class TestBinarysearch
{
public static void main(String args[])
{
	System.out.println("enter size of an array");
	int n=UtilClass.InputInt();
	int arr[]=new int[n];
	System.out.println("enter the element to be searched");
	int x=UtilClass.InputInt();
	
	for(int i=0;i<n;i++)
	{
		System.out.println("enter array elements");
		arr[i]=UtilClass.InputInt();
	}
	
	Binarysearch bs=new Binarysearch();
	int result=bs.binarysearch(arr, 0, n-1, x);
	if(result==-1)
	
		System.out.println("the element is searched");
	
	else
	
		System.out.println("element not found");
	
	
}
}
