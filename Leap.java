package com.BridgeLabz.programs;

import com.BridgeLabz.Util.UtilClass;

public class Leap 
{
public static void main(String[] args)
{
    System.out.print("enter year");
	String y=UtilClass.InputString();
	if(y.length()==4)
	{
		
	int i=Integer.parseInt(y);
	if(i%400==0)
	{
		System.out.print("LeapYear");
	}
	else if(i%4==0 && i%100!=0)
	{
		System.out.print("LeapYear");
	}
	else
	{
	  System.out.print("Not LeapYear");
	}
	}
}
	
}
