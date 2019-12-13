package com.BridgeLabz.Test;

import com.BridgeLabz.Algorithm.TempConversion;
import com.BridgeLabz.Util.UtilClass;

public class TestTemparature 
{
public static void main(String[] args)
{
	System.out.println("enter temperature in Far");
	double tempf=UtilClass.InputDouble();
	System.out.println("enter temperature in Cel");
	double tempc=UtilClass.InputDouble();
	TempConversion ts=new TempConversion();
	tempc=ts.farTocel(tempf);
	System.out.println(tempc);
	
	tempf=ts.celTofar(tempc);
	System.out.println(tempf);
	
}
}
