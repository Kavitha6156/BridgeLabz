package com.BridgeLabz.Algorithm;

//import com.BridgeLabz.Test.TestTicTacToe;
//import com.BridgeLabz.Util.UtilClass;

public class TicTacToe
{
	public static char tictac[][]=new char[3][3];
public static void display(char board[][])
{
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print(tictac[i][j]+" ");
		}
		System.out.println();
	}
 }
public static void repalce(char arr[][],char find,char replace)
{
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			if(arr[i][j]==find)
			{
				arr[i][j]=replace;
				return;
			}
		}
	}
}
//check for win fun
public boolean checkforwin()
{
	return(checkforRow() ||checkforCol() || checkforDia());
}
public boolean check(char c1,char c2,char c3)
{
	return((c1==c2)&&(c2==c3));
}
//check for row
public boolean checkforRow()
{
	for(int i=0;i<3;i++)
	{
		if(check(tictac[i][0],tictac[i][1],tictac[i][2])==true)
			return true;
	}
	return false;
}
//check for column
public boolean checkforCol()
{
	for(int i=0;i<3;i++)
	{
		if(check(tictac[0][i],tictac[1][i],tictac[2][i])==true)
			return true;
	}
	return false;
}
//check for diagnol
public boolean checkforDia()
{
	 return((check(tictac[0][0],tictac[1][1],tictac[2][2])==true) ||(check(tictac[0][2],tictac[1][1],tictac[2][0])==true));	

}
}
