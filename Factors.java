package com.BridgeLabz.programs;

import com.BridgeLabz.Util.UtilClass;

public class Factors
{
public static void main(String args[])
{
	System.out.println("enter N value");
	int N=UtilClass.InputInt();
	for(int i=2;i<=N/2;i++)
	{
		if(N%i==0)
		{
			System.out.println(i);
		}
		N=N/i;
			
	}
	System.out.println(N);
}
}
