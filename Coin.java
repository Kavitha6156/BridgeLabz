package com.BridgeLabz.programs;

import com.BridgeLabz.Util.UtilClass;

public class Coin 
{

	public static void main(String[] args)
	 {
	   System.out.print("enter the num of flips");
		int N=UtilClass.InputInt();
		 int hcnt=0,tcnt=0;
		 for(int i=0;i<N;i++)
		 {
			 double ran=Math.random();
			 if(ran<0.5)
				 tcnt++;
			 else
				 hcnt++;
				 
		 }
		
		 System.out.println("percentage of head"+" "+hcnt/(double)N *100);
		 System.out.println("percaentage of tail"+" "+tcnt/(double)N*100);
		
	 }
}
