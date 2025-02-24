package com.basics;

public class MainThreadWait {

	public static void main(String[] args) throws InterruptedException {
	SarvThread.mt = Thread.currentThread();
	SarvThread t = new SarvThread();
	t.start();
	for(int i = 0;i<5;i++) {
		System.out.println("Main Thread");
		Thread.sleep(1000);
	}

	}

}

class SarvThread extends Thread{
	
	static Thread mt;
	public void run() {
		try {
			mt.join(1000); // child thread wait till main thread executed completely
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i = 0;i<5;i++) {
			System.out.println("Child Thread");
		}
		
	}
}

//child thread will wait for main thread to execute, for this we need to create a static variable of thread type
// and then use that in main method to get current thread reference. using that call it in child thread 
//so that child thread will wait till main thread execution completed