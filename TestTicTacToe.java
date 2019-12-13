package com.BridgeLabz.Test;

import java.util.Scanner;

import com.BridgeLabz.Algorithm.TicTacToe;

public class TestTicTacToe 
{
public static void main(String[] args)
{
	TicTacToe game=new TicTacToe();
	Scanner in=new Scanner(System.in);
	String user1,user2;
	char user1mark,user2mark;
	System.out.println("enter user1");
	user1=in.nextLine();
	System.out.println("enter user2");
	user2=in.nextLine();
	System.out.println(user1+"select your marker (0 or x)");
	user1mark=in.next().charAt(0);
	while(user1mark!='x' && user1mark!='x' &&user1mark!='0'&& user1mark!='0')
	{
		System.out.println("invalid input (select 0 or x):");
		user1mark=in.next().charAt(0);
	}
	if(user1mark=='x' || user1mark=='x')
		user2mark='0';
	else
	user2mark='x';
	int counter=0;
	
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			game.tictac[i][j]=Character.forDigit(++counter,10);
		}
	}
	//Display Board
	TicTacToe.display(game.tictac);
}
}
