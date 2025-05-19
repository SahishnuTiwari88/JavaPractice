package com.basics.threads;

public class ThreadDemo extends Thread{
	
	public void start() {
		
		System.out.println("Start");
		super.start();
	}
	
	public void run() {
		System.out.println("Child run");
	}
	
	public static void main(String args[]) {
		ThreadDemo t = new ThreadDemo();
		t.start();
		
		System.out.println("Main thread");
	}

}
