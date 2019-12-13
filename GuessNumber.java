package com.BridgeLabz.Algorithm;

import com.BridgeLabz.Util.UtilClass;

public class GuessNumber 
{
public static void find(int low,int up)
{
	if(low==up)
	{
		System.out.print("low is"+low);
		System.out.println("Intermidiate num is"+(low-1)+"and"+(low+1));
	}
	int mid=(low+up)/2;
	int ch;

    System.out.println("Press 1 : "+low+" - "+mid);
    System.out.println("Press 2 : "+(mid+1)+" - "+up);
    ch=UtilClass.InputInt();
    if(ch==1)
    {
    	find(low,mid);
    }
    else
    {
    	find(mid+1,up);
    }
}
}
