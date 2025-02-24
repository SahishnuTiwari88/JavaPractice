package com.basics;

public class RemoveElement {
	
	public static int[] removeEle(int arr[], int target) {
		
		int result[] = new int[arr.length];
		int count = 0 ;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] == target) {
				continue;
			}else {
				result[i] = arr[i];
				count++;
			}
		}
		System.out.println(count);
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,1,2,2,3,0,4,2};
		int[] removeEle = removeEle(arr, 2);
		
		System.out.print("[");
		for(int i = 0;i<removeEle.length;i++) {
			System.out.print( removeEle[i]+",");
		}
		System.out.print("]");

	}

}
