package com.BridgeLabz.Test;

import java.util.Scanner;

import com.BridgeLabz.Util.UtilClass;

public class TestBubble
{
public static void main(String[] args)
{
	System.out.println("enter array elements");
	int n=UtilClass.InputInt();
	int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
    	arr[i]=UtilClass.InputInt();
    }
}
}
