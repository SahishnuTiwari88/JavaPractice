package com.basics;

import java.util.Arrays;

public class ArrayProd {
	
	public static int[] resultArr(int[] arr) {
		int result[] = new int[arr.length];
		int mul = 1;
		for(int i = 0;i<arr.length;i++) {
			int left = 0;
			while(left<i) {
				mul *= arr[left];
				left++;
			}
			int j = i+1;
			while(j<arr.length) {
				mul *= arr[j];
				j++;
			}
			result[i] = mul;
			mul = 1;
		}
		return result;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,1,3,4,9};
		int[] resultArr = resultArr(arr);
		System.out.println(Arrays.toString(resultArr));
	
	}

}

//product of array program
