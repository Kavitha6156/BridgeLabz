package com.BridgeLabz.programs;

public class Power 
{
public static void main(String[] args)
{
	int N=Integer.parseInt(args[0]);
	
	int res=1;	
	int i=0;
	while(i<=N)
	{
		
		res=2*res;
		System.out.println(res);
	    i++;
	}
}
}
