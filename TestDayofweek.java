package com.BridgeLabz.Test;

import java.util.HashMap;
import java.util.Map;

import com.BridgeLabz.Algorithm.Dayofweek;
import com.BridgeLabz.Util.UtilClass;

public class TestDayofweek 
{
public static void main(String args[])
{
	System.out.println("enter date");
	int d=UtilClass.InputInt();
	System.out.println("enter month");
	int m=UtilClass.InputInt();
	System.out.println("enter year");
	int y=UtilClass.InputInt();
	int dof=Dayofweek.dayofweek(d, m, y);
	System.out.println(dof);
	Map<Integer,String> M=new HashMap<Integer,String>();  
	M.put(0,"sunday");
	M.put(1,"monday");
	M.put(2,"tuesday");
	M.put(3,"wednesday");
	M.put(4,"thursday");
	M.put(5,"friday");
	M.put(6,"saturday");
	System.out.println(M.get(dof));
	
}
}
