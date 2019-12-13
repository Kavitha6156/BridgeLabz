package com.BridgeLabz.Test;

import com.BridgeLabz.Util.UtilClass;
import com.BridgeLabz.programs.Stopwatch;

public class TestStopwatch 
{
 public static void main(String[] args)
 {
	 int ch=0;
	 while(ch!=3)
	 {
		 System.out.println("press1 to starttime");
		 System.out.println("press2 to stoptime");
		 System.out.println("press3 to elapsedtime");
		  ch=UtilClass.InputInt();
		  switch(ch)
		  {
		  case 1:Stopwatch.start();
		       break;
		       
		  case 2:Stopwatch.stop();
		       break;
		       
		   case 3:Stopwatch.elapsedtime();
		       break;
		       
		   default:System.out.println("plz provide valid inputs");
		       break;
		  }
	 }
 }
}
