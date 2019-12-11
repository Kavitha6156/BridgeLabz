package com.BridgeLabz.programs;

import com.BridgeLabz.Util.UtilClass;

public class Coupon 
{
public static void main(String args[])
{
    System.out.println("enter coupon number");
	int n=UtilClass.InputInt();
	boolean isNewCou[]=new boolean[n];
	int distinct=0;int count=0;
	while(distinct<n)
	{
		int value=(int)(Math.random()*n);
		count++;
		if(!isNewCou[value])
		{
			distinct++;
			isNewCou[value]=true;
		}
	}
	System.out.println(count);
	
}
}
