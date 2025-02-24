package com.basics;


public class Subsequence {
	
	public static boolean subSeq(String str1, String str2) {
		int i = 0,j=0;
		while(i < str1.length() && j < str2.length()) {
			if(str2.charAt(j) == str1.charAt(i)) {
				
				j++;	
			}else {
				i++;
			}
			
			
		}
		return j == str2.length();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean subSeq = subSeq("abcde", "aceb");
		System.out.println(subSeq);

	}

}
