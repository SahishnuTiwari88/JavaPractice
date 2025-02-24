package com.basics.collection;

public class LeetcodeString {

	public static void main(String[] args) {
		String gcdOfStrings = Solution.gcdOfStrings("ABABAB","ABAB");
		System.out.println(gcdOfStrings);
	}

}

class Solution {
    public static String gcdOfStrings(String str1, String str2) {
    	if(!(str1+str2).equals(str2+str1)) {
    		return "blank";
    	}
    	
    	int num1 = str1.length();
    	int num2 = str2.length();
    	
    	int gcdLength = gcdOfNum(num1,num2);
    	
		return str1.substring(0, gcdLength);
    	
    }

	private static int gcdOfNum(int num1, int num2) {
				int gcd = 0;
				int smallNum = num1<num2 ? num1 : num2;
				for(int i = smallNum; i>=1;i--) {
					if(num1%i == 0 && num2%i == 0) {
						gcd = i;
						return gcd;
					}
				}
				return 0;
	}
}
