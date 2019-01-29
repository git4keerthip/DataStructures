package com;

import java.util.Scanner;

public class balanceParanthesis {
	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        String s = scan.next();
	        int k = scan.nextInt();
	        scan.close();
	        System.out.println(paranthBalance("{[]{([})}}"));
	 }
		public static boolean paranthBalance(String str)
		{
			String[] strAy= str.split("");
			int len = strAy.length;int count =0;
			String open="{[(";
			String close="}])";
			if(len<=1 || close.contains(strAy[0]))
				return false;
			StackArray<String> st = new StackArray<>(len);
			for(int i =0;i<len;i++)
			{
				
				try {
					if(close.contains(strAy[i]))
					{
						int temp = close.indexOf(strAy[i]);
						if(String.valueOf(open.charAt(temp)).equals(st.peak()))
							st.pop();
						else
							return false;
					}
					else
						st.push(strAy[i]);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			return st.isEmpty();
					//return (count==0) ;
		}


}
