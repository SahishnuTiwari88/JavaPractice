package com.basics;

public class ThreadName {

	public static void main(String args[]) {
		MyThread t = new MyThread("Sarv");
		t.start();
		System.out.println("Main Thread");
	}
}

class MyThread extends Thread{
	
	public MyThread(String name){
		super(name);
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
	
}