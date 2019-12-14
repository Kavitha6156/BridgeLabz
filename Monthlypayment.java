package com.BridgeLabz.Algorithm;

public class Monthlypayment 
{
public static double monthlypayment(int P,int Y,double R)
{
	int n=12*Y;
	double r=R/100;
	double pay=(P*r)/((1-Math.pow(1+r,-n)));
	return pay;
}
}
