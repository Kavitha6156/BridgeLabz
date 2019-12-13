package com.BridgeLabz.Test;

import com.BridgeLabz.Algorithm.Mergesort;

public class TestMergesort 
{
public static void main(String[] args)
{
	String[] arr={"kavi","chandu","kranthi","prathyu"};
	String[] sortedArray=Mergesort.mergesort(arr);
	for(String s:sortedArray)
		System.out.println(s);
}
}
