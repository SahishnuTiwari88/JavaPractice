package com.basics.wrapper;

public class Program {

	public static void main(String[] args) {
		Integer a = Integer.valueOf("1010", 5);
		System.out.println(a);
		float b = 12.5f;
		Float c = 12.5f;
		Float d = 12.5f/0;
		Float e = (float) Math.sqrt(-1);
		System.out.println(c.equals(b));
		System.out.println(d.isInfinite());
		System.out.println(d == Float.POSITIVE_INFINITY);
		System.out.println(e.isNaN());
		System.out.println(e == Float.NaN);//not useful so avoid
		
		String s = "Sarvesh";
		

	}

}
