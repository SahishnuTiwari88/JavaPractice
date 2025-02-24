package com.basics;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		System.out.println("Enter start number: ");
		int start = sc.nextInt();
		System.out.println("Enter end number: ");
		int end = sc.nextInt();
		int table = printTable(n,start,end);
		System.out.println("Last multiply is "+table);
		
		
	}
	
	public static int printTable(int num) {
		int mul=0;
		for(int i=1;i<=10;i++) {
			mul = num*i;
			System.out.println(num+"*"+i+" = "+num*i);
		}
		return mul;
	}
	
	public static int printTable(int num,int begin, int end) {
		int mul=0;
		for(int i=begin;i<=end;i++) {
			mul = num*i;
			System.out.println(num+"*"+i+" = "+num*i);
		}
		return mul;
	}

}
