package com.basics;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int p = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int q = sc.nextInt();
		System.out.println("Sum of two number "+addTwo(p,q));
	}
	
	public static int addTwo(int a, int b) {
		return a+b;
		
	}

}
