package com.basics;

class p1 {
	int a;
	int b=10;

	void display() {
		display1();
		display2();
		p2.display5();
		p2 p2 = new p2();
		p2.display3();

	}

	void display1() {

	}

	static void display2() {
		p2.display5();
		p1 p = new p1();
		//p.display();
		p.a = 5;
		p.b=30;
		System.out.println("Display1 a : "+p.a);
		System.out.println("Display1 b : "+p.b);
	}
}

class p2 extends p1{
	int a;
	void display3() {
		display4();
		display5();
		
	}
	void display4() {
		
	}
	static void display5() {
			}
}

public class Demo extends p2{

	public static void main(String[] args) {
		p1 p = new p1();
		p.display();
		
	}

}
