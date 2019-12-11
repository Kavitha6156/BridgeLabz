package com.BridgeLabz.programs;

import com.BridgeLabz.Util.UtilClass;

public class Gambling 
{
public static void main(String args[])
{
	System.out.println("enter stake value");
	int stake=UtilClass.InputInt();
	System.out.println("enter Goal value");
	int Goal=UtilClass.InputInt();
	System.out.println("enter num of trail");
	int trail=UtilClass.InputInt();
	int bets=0;int wins=0;
	for(int i=0;i<trail;i++)
	{
		int cash=stake;
	    while(cash>0 && cash<Goal)
		{
			bets++;
			if(Math.random()>0.5)
			{
				cash++;
			}
			else
			{
				cash--;
			}
			if(cash==Goal)
			{
				wins++;
			}
		}
			
	    System.out.println("wins"+wins+"out of trail"+trail);
	    System.out.println("percentage of game win"+wins/trail*100);
	    System.out.println("Avg num of bets= "+bets/trail);
	}
}
}
