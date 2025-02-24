package com.basics;

public class Inheritance {

	public static void main(String[] args) {
		Father f = new Father();
		Son s = new Son();
		Daughter d = new Daughter();
		f.cal();
		s.cal();
		d.cal();

	}

}


class Father{
	int a = 100;
	final void cal() {
		System.out.println("Father call ..");
	}
}

class Son extends Father{
	int b = 10;
	int sum = a+b;
//	void cal() {
//		System.out.println("Son call .."+"Sum "+sum);
//	}
}

class Daughter extends Father{
	int c= 20;
	int mul = a*c;
//	void cal() {
//		System.out.println("Daughter call .."+"Mul "+mul);
//	}
}


//NOTE : Final method can be inherited but cannot be overridden