package com.BridgeLabz.Algorithm;

public class Binarysearch 
{
public int binarysearch(int arr[],int l,int r,int x)
{
	if(r>=l)
	{
		int mid=l+(r-1)/2;
	if(arr[mid]==x)
	   return mid;
	if(arr[mid]>=l)
		 return binarysearch(arr, l, mid - 1, x); 
	return binarysearch(arr,mid+1,r,x);
	}
	return -1;
			
}

}
