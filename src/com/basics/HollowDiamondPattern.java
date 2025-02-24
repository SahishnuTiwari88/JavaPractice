package com.basics;

public class HollowDiamondPattern {
	
	public static void printPattern(int n) {
		int mid = n/2+1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i+j == mid+1 || j-i == mid-1 || i-j == mid-1 || i+j == n+mid) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPattern(7);

	}

}
