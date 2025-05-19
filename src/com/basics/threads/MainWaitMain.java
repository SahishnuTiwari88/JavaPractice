package com.basics.threads;

public class MainWaitMain {
	
	public static void main(String[] args) throws InterruptedException {
		Thread.currentThread().join();
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread");
		}
	}

}
