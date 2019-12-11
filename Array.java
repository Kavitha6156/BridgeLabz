package com.BridgeLabz.programs;

import java.io.PrintWriter;
import java.util.Scanner;

public class Array 
{
static Scanner sc=new Scanner(System.in);
public static int[][] inputint(int m,int n)
{
int a[][]=new int[m][n];
for(int i=0;i<m;i++)
{
	for(int j=0;j<n;j++)
	{
		System.out.println("enter elements");
		a[i][j]=sc.nextInt();
	}
}
return a;
}
public static void display(int a[][],int m,int n)
{
	PrintWriter pw=new PrintWriter(System.out,true);
	pw.println("2D ARRAY");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{

			pw.print(a[i][j]+" ");
		}
		pw.println("\t");
	}
}
	
}
