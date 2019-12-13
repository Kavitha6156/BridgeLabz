package com.BridgeLabz.Test;

import com.BridgeLabz.Algorithm.Insertionsort;
import com.BridgeLabz.Util.UtilClass;

public class TestInsertion
{
 public static void main(String[] args)
 {
	 int n=UtilClass.InputInt();
	 String arr[]=new String[n];
	 for(int i=0;i<n;i++)
	 {
		 arr[i]=UtilClass.InputString();
	 }
	 Insertionsort.insertion(arr);
	 
 }
}
