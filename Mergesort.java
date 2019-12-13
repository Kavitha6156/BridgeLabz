package com.BridgeLabz.Algorithm;

public class Mergesort 
{
	public static String[] mergesort(String[] list)
	{	
     String[] sorted=new String[list.length];
     if(list.length==1)
     {
    	 sorted=list;
     }
     else
     {
    	 int mid=list.length/2;
    	 String[] left=null;
    	 String[] right=null;
    	 if((list.length%2)==0)
    	 {
    		 left=new String[list.length/2];
    		 right=new String[list.length/2];
    		 
    	 }
    	 else
    	 {
    		 left=new String[list.length/2];
    		 right=new String[(list.length/2)+1];
    		 
    	 }
    	 int x=0;int y=0;
    	 for(;x<mid;x++)
    	 {
    		 left[x]=list[x];
    	 }
    	 for(;x<list.length;x++)
    	 {
    		 right[y++]=list[x];
    	 }
    	 left=mergesort(left);
    	 right=mergesort(right);
    	 sorted=mergeArray(left,right);
     }
     return sorted;
	}
	public static String[] mergeArray(String[] left,String[] right)
	{
		String[] merged=new String[left.length+right.length];
		int lindex=0;
		int rIndex=0;
		int mIndex=0;
		int comp=0;
		while(lindex<left.length || rIndex<right.length)
		{
			if(lindex==left.length)
			{
				merged[mIndex++]=right[rIndex++];
				
			}
			else if(rIndex==right.length)
			{
				merged[mIndex++]=left[lindex++];
			}
			else
			{
				comp=left[lindex].compareTo(right[rIndex]);
				if(comp>0)
				{
					merged[mIndex++]=right[rIndex++];
					
				}else if(comp<0)
				{
					merged[mIndex++]=left[lindex++];
				}
					else
					{
						merged[mIndex++]=left[lindex++];
					}
				}
				
			}
			return merged;
		}
		
	}

