package com.basics;

public class BothThreadWait {

	public static void main(String[] args) throws InterruptedException {
		BothThread.mt = Thread.currentThread();
		BothThread tb = new BothThread();
		tb.start();
		tb.join();
		for(int i = 0;i<5;i++) {
			System.out.println("Main Thread");
		}
	}

}

class BothThread extends Thread{
	static Thread mt;
	public void run(){
		try {
			mt.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		for(int i = 0;i<5;i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

//Nothing/ no output appears on the console as both threads wait for each other to get complete 
//but neither of them gets complete and hence this condition is called deadlock