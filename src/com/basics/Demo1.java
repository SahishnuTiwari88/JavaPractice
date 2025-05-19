package com.basics;

public class Demo1 {
	int a = 10;
	static int b = 20;

	public static void main(String[] args) {
		//int c = new Demo1().a;
		
		Demo1 d = new Demo1();
		System.out.println(d.a);
		d.a = 340;
		
		System.out.println(b);
		System.out.println(d.a);

	}

}
