package com.BridgeLabz.programs;

import com.BridgeLabz.Util.UtilClass;

public class TripletSum 
{
  public static void triplets(int arr[])
  {
	  int n=UtilClass.InputInt();
	  for(int i=0;i<n;i++)
	  {
		  for(int j=i+1;j<n;j++)
		  {
			  for(int k=j+1;k<n;k++)
			  {
				  if(arr[i]+arr[j]+arr[k]==0)
				  {
					  
					  System.out.println(arr[i]+","+arr[j]+","+arr[k]);
					  break;
				  }
			  }
		  }
	  }
	  System.out.print("Triplet not found");
  }
}
