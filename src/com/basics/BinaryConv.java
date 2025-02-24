package com.basics;

import java.util.Arrays;

public class BinaryConv {
	
	public static String[] binary(int n){
        String [] str = new String[n];
        for(int i = 1;i<=n;i++){
        	int num = i;
        	String binaryNum="";
        	while(num>0) {
            int rem = num%2;
            binaryNum = rem+binaryNum;
            num = num/2; 
        	}
        	str[i-1] = binaryNum;
        }
        return str;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Arrays.toString(binary(4)));
		String[] binaryData = binary(8);
		System.out.println(binaryData.length);
		for(int i=0;i<binaryData.length;i++) {
			System.out.println(binaryData[i]);
		}
	}

}
