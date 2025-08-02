package com.interview.questions;

public class Convert_Lower_Upper {

	public static void main(String[] args) {
		String string = "HexAwarE";
		char ch[] = string.toCharArray();
		
		for(int i=0;i<string.length();i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
				ch[i] = (char) (ch[i] + 32);
			}
			
			else if(ch[i]>='a' && ch[i]<='z')
			{
				ch[i] = (char) (ch[i] - 32);
			}
			
			System.out.print(ch[i]);
		
		}
		
		
		

	}
 
}
