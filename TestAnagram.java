package com.BridgeLabz.Test;

import com.BridgeLabz.Algorithm.Anagram;

public class TestAnagram 
{
public static void main(String args[])
{
	char str1[]={'l','i','s','t','e','n'};
	char str2[]={'s','i','l','e','n','t'};
	if(Anagram.anagram(str1, str2))
	{
		System.out.println("two strings are anagram");
	}
	else
	{
		System.out.println("Not an Anagram");
	}
}
}
