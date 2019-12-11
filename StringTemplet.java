package com.BridgeLabz.programs;

import com.BridgeLabz.Util.UtilClass;

public class StringTemplet 
{
public static void main(String args[])
{
	System.out.println("enter the string:");
	String s=UtilClass.InputString();
	String s1="Hellow<<UserName>>,How are you?";
	String res="";
	if(s.length()>=3)
	{
		res=s.replaceFirst("<<UserName>>",s);
		System.out.println(res);
	}
	else
	{
		System.out.println("enter more than two char");
	}
}
}
