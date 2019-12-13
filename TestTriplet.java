package com.BridgeLabz.Test;

import com.BridgeLabz.Util.UtilClass;
import com.BridgeLabz.programs.TripletSum;

public class TestTriplet 
{
public static void main(String[] args)
 {
	System.out.println("enter size of an array");
	System.out.println("enter array elements");
	int arr[]=UtilClass.arrayInput();
	TripletSum.triplets(arr);
	
	
	
 }
}
