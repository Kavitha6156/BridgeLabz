package com.BridgeLabz.Algorithm;

public class TempConversion
{
public static double celTofar(double tempc)
{
double tempf=((tempc*9)/5)+32;
return tempf;
}
public static double farTocel(double tempf)
{
	double tempc=((tempf-32)*9)/5;
	return tempc;
}
}
