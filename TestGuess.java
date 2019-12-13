package com.BridgeLabz.Test;

import com.BridgeLabz.Algorithm.GuessNumber;
import com.BridgeLabz.Util.UtilClass;

public class TestGuess
{
public static void main(String args[])
{
	System.out.println("enter RANGE value");
	int num=UtilClass.InputInt();
	GuessNumber.find(0,num-1);
}
}
