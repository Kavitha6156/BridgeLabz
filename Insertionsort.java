package com.BridgeLabz.Algorithm;

public class Insertionsort 
{
 public static void insertion(String arr[])
 {
	 int n=arr.length;
	 String temp="";
	 for(int i=0;i<n;i++)
	 {
		 for(int j=i+1;j<n;j++)
		 {
			 if(arr[i].compareToIgnoreCase(arr[j])>0)
					 {
				      temp=arr[i];
				      arr[i]=arr[j];
				      arr[j]=temp;
					 }
		 }
	 }
	 for(int i=0;i<n;i++)
	 {
		 System.out.print(arr);
	 }
 }
}
