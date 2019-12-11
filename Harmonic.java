package com.BridgeLabz.programs;

import com.BridgeLabz.Util.UtilClass;

public class Harmonic 
{
 public static void main(String[] args)
 {
	 System.out.println("enter N value");
	 int N=UtilClass.InputInt();
	 double sum=0;
     for(int i=1;i<=N;i++)
      {
    	 sum+=1.0/i;
	    
      }
     System.out.print(sum);
  }
}
