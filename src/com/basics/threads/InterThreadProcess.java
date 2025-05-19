package com.basics.threads;

class Mydata1 {
	int value;
	boolean flag = true; // producer turn at begin

	synchronized public void set(int value) {
		while (flag != true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.value = value;
		flag = false; // consumer turn
		notify(); // inform consumer to consume
	}

	synchronized public int get() {
		int x = 0;
		while (flag != false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		x = value;
		flag = true; // producer turn
		notify(); // it will notify producer to produce data
		return x;
	}
}

class Producer1 extends Thread {
	Mydata1 d;

	public Producer1(Mydata1 d) {
		this.d = d;
	}

	public void run() {
		int count = 1;
		while (true) {
			d.set(count);
			System.out.println("Producer : " + count);
			count++;
		}
	}
}

class Consumer1 extends Thread {
	Mydata1 d;

	public Consumer1(Mydata1 d) {
		this.d = d;
	}

	public void run() {
		int value;
		while (true) {
			value = d.get();
			System.out.println("Consumer : " + value);
		}
	}
}

public class InterThreadProcess {
	public static void main(String args[]) {
		Mydata1 d = new Mydata1();
		Producer1 p = new Producer1(d);
		Consumer1 c = new Consumer1(d);
		p.start();
		c.start();

	}

}

//We have not used synchronization here so any value will be produced and consumed even some will get skipped also
// we can use synchronized keyword with the get and set methods but still problem remains same,
//this issue can only be resolved by programmer by using any other pointer or flag.
