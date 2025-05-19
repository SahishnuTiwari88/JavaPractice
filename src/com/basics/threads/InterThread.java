package com.basics.threads;

class Mydata{
	int value;

	synchronized public int get() {
		int x = 0;
		x= value;
		return x;
	}

	synchronized public void set(int value) {
		this.value = value;
	}	
}

class Producer extends Thread{
	Mydata d;
	public Producer(Mydata d) {
		this.d = d;
	}
	public void run() {
		int count = 1;
		while(true) {
			d.set(count);
			System.out.println("Producer : "+count);
			count++;
		}
	}
}

class Consumer extends Thread{
	Mydata d;
	public Consumer(Mydata d) {
		this.d = d;
	}
	public void run() {
		int value;
		while(true) {
			value=d.get();
			System.out.println("Consumer : "+value);
		}
	}
}


public class InterThread {
	public static void main(String args[]) {
		Mydata d = new Mydata();
		Producer p = new Producer(d);
		Consumer c = new Consumer(d);
		p.start();
		c.start();
		
	}

}


//We have not used synchronization here so any value will be produced and consumed even some will get skipped also
// we can use synchronized keyword with the get and set methods but still problem remains same,
//this issue can only be resolved by programmer by using any other pointer or flag.
