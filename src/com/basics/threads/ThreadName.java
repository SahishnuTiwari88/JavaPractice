package com.basics.threads;

public class ThreadName {

	public static void main(String args[]) {
		MyThread t = new MyThread("Sarv");
		t.start();
		System.out.println("Main Thread");
		Thread.currentThread().setPriority(9); //setting main thread priority
		Thread.currentThread().setName("SarvMain"); //change name of main thread
		System.out.println("Thread name 1: "+Thread.currentThread());
		System.out.println("State "+t.getState());
	}
}

class MyThread extends Thread{
	public void run() {
		System.out.println("Thread name : "+Thread.currentThread().getName());
		System.out.println("Thread name 2: "+Thread.currentThread());
		
	}
	
	public MyThread(String name){
		super(name);
	}
	
	
	
	
}