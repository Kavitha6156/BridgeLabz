package com.BridgeLabz.Algorithm;

public class Sqrt
{
public static double sqrt(double c)
{
	double t=c;
	double epsilon=1e-15;
	while (Math.abs(t - c / t) > epsilon * t)
	{
		t = (c / t + t) / 2;
	}
	return t;
}
}
