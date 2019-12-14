package com.BridgeLabz.Test;

import com.BridgeLabz.Algorithm.Monthlypayment;

public class TestMonthly
{
public static void main(String args[])
{
	try{
	System.out.println("enter prinncipal amount");
	int P=Integer.parseInt(args[0]);
	System.out.println("enter years");
	int Y=Integer.parseInt(args[1]);
	System.out.println("enter rateOfInterest");
	double R=Double.parseDouble(args[2]);
	double payment=Monthlypayment.monthlypayment(P, Y, R);
	System.out.println(payment);
	}
	catch(NumberFormatException e)
	{
		System.out.println("NumberFormatException handled");
	}
}
}
