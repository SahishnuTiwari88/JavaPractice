package com.basics;

public class ConvertDigitToNumber {
	
	
	
	public static String[] digitWords = {"zero", "one", "two", "three", "four", "five",
			"six", "seven", "eight", "nine"};


	public static String convertToString(int number) {
		String str = Integer.toString(number);
		char[] chars = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(char ch : chars) {
			int digitIndex = ch - '0';
			sb.append(digitWords[digitIndex]+" ");
			
		}
		return sb.toString();
		
	}
	
	
	public static void main(String[] args) {
		int number = 8808977; //output should be onetwothreefour
		String convertToString = convertToString(number);
		System.out.println(convertToString);
	}

}
