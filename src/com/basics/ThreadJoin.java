package com.basics;

public class ThreadJoin {

	public static void main(String[] args) {
		Mythreads t = new Mythreads();
		t.start();
		try {
		t.join();
		}catch(InterruptedException e) {
			
		}
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread");
		}

	}

}

class Mythreads extends Thread{
	
	public void run() {
		
		for(int i=0;i<5;i++) {
			System.out.println("Child Thread");
			try {
			Thread.sleep(1000);
			}catch(InterruptedException e) {
				
			}
		}
	}
}
//Child thread wait using t.join() in main thread