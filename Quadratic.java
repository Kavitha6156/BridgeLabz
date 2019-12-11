package com.BridgeLabz.programs;

import com.BridgeLabz.Util.UtilClass;

public class Quadratic
{
public static void main(String args[])
{
	System.out.println("enter a value");
	int a=UtilClass.InputInt();
	System.out.println("enter b value");
	int b=UtilClass.InputInt();
	System.out.println("enter c value");
	int c=UtilClass.InputInt();
	
	double delta=((b*b)-(4*a*c));
	double root1=((-b+Math.sqrt(delta))/(2*a));
	double root2=((-b-Math.sqrt(delta))/(2*a));
	System.out.println(root1);
	System.out.println(root2);
}

}
