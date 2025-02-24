package com.basics;

import java.util.Arrays;

public class RemoveEle {
	
	public static int[] remove(int arr[], int val) {
		int slow=0;
		int fast=0;
		while(fast < arr.length) {
			if(arr[fast] == val) {
				fast++;
				
			}else {
				arr[slow] = arr[fast];
				//System.out.println(slow+" "+fast);
				slow++;
				fast++;
				//System.out.println(slow);
			}
			
		}
		//clean up of elements which remains after slow ptr
		while(slow < arr.length) {
			arr[slow] = -1;
			slow++;
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,1,2,2,3,0,4,2};
		int[] removeEle = remove(arr, 2);
		
		System.out.println(Arrays.toString(removeEle));

	}

	}


