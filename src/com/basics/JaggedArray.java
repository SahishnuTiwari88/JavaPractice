package com.basics;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int m = sc.nextInt();

		int arr[][] = new int[m][];

		for (int i = 0; i < m; i++) {
			System.out.print("No. of element in row " + (i + 1) + " ");
			int n = sc.nextInt();
			arr[i] = new int[n];
		}
		System.out.println("Enter elements : ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("print elements : ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}

}
