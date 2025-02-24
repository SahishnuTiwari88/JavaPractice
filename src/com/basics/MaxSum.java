package com.basics;

public class MaxSum {
	
	public static int SumMax(int arr[],int k) {
		int maxSum = Integer.MIN_VALUE;
		for(int i = 0;i<arr.length-2;i++) {
			int sum = 0;
			//while(count < k) {
			for(int j = i;j<=i+2;j++) {
				sum += arr[j];
				if(sum > maxSum) {
					maxSum = sum;
				}
			}
		}
		//}
		return maxSum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,2,20,14,23,5,100};
		
		System.out.println("MAX SUM "+ SumMax(arr, 3));

	}

}
//time comple : O(n*k)