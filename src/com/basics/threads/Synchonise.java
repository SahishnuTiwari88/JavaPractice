package com.basics.threads;


class MyData11{
	
synchronized public void display(String str) {
		
			
		for(int i=0;i<str.length();i++) {
		System.out.print(str.charAt(i));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		}
	
}

class Mythread1 extends Thread{
	MyData11 d;
	public Mythread1(MyData11 d) {
		this.d = d;
	}
	public void run() {
		d.display("Hello World");
	}
}

class Mythread2 extends Thread{
	MyData11 d;
	public Mythread2(MyData11 d) {
		this.d = d;
	}
	public void run() {
		d.display("Welcome All");
	}
}

public class Synchonise {

	public static void main(String[] args) {
		MyData11 data = new MyData11();
		Mythread1 t1 = new Mythread1(data);
		Mythread2 t2 = new Mythread2(data);
		
		t2.start();
		t1.start();
		

	}

}
