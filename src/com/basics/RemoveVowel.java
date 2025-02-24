package com.basics;

import java.util.Set;

public class RemoveVowel {
	
	public static String removeVowel(String str) {
//		char[] chars = str.toCharArray();
//		StringBuilder sb = new StringBuilder();
//		for(char ch : chars) {
//			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//				continue;
//			}else {
//				sb.append(ch);
//			}
//		}
//		return sb.toString();
		
		//using set
		
		Set<Character> vowel = Set.of('a','e','i','o','u');
		char[] chars = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(char ch : chars) {
			if(!vowel.contains(ch)) {
				sb.append(ch);
			}
		}
		return sb.toString();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeVowel("what is your name ?"));

	}

}
