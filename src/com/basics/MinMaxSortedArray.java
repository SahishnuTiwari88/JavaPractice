package com.basics;

public class MinMaxSortedArray {
	
	public static int[] reArrange(int[] arr) {
		int[] result = new int[arr.length];
		int left = 0;
		int right = arr.length-1;
		
		for(int i = 0;i < arr.length; i++) {//{1,2,3,4,5,6,7}
			if(i%2 == 0) {
				result[i] = arr[left];
				left++;
			}else {
				result[i] = arr[right];
				right--;
			}
		}
		return result;
	}
	
	public static void Print(int arr[]) {
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	
	
	public static void main(String[] args) {
		//MinMaxSortedArray minMax = new MinMaxSortedArray();
		int[] arr = {1,2,3,4,5,6,7,8};
		Print(arr);
		int[] reArrange = reArrange(arr);
		System.out.println();
		Print(reArrange);
		
	}

}
