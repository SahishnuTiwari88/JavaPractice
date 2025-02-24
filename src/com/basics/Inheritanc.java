package com.basics;

public class Inheritanc {

	public static void main(String[] args) {
		Son1 son = new Son1();
		son.disp();
		
		
	}
}
	
	class Father1{
		
		int a = 100;
		void put() {
			System.out.println("Father method");
		}
	}
	
class Son1 extends Father1{
		
		int a = 200;
		void put() {
			System.out.println("child method");
			System.out.println(super.a);
		}
		void disp() {
			super.put(); //super class method call
			put();
		}
	}


