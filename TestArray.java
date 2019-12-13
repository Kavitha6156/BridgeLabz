package com.BridgeLabz.Test;

import com.BridgeLabz.Util.UtilClass;
import com.BridgeLabz.programs.Array;

public class TestArray 
{
	public static void main(String args[])
	{
		System.out.println("enter no of rows");
		int m=UtilClass.InputInt();
		System.out.println("enter no of col");
		int n=UtilClass.InputInt();
		
		int a[][]=Array.inputint(m, n);
		Array.display(a, m, n);
	}

}
