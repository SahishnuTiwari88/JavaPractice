package com.basics.threads;

class ATM{
	
	
	
	public void checkBalance(String name) {
		synchronized(this) {
		System.out.print(name +" Checking ");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Balance");
		
	}
	}
	
	public void withDraw(String name, int amount) {
		synchronized(this) {
		System.out.print(name+ " withdrawing ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(amount);
	}
	}
}
	


class Customer extends Thread{
	ATM atm;
	String name;
	int amt;
	public Customer(ATM atm,String name,int amt) {
		this.atm = atm;
		this.name = name;
		this.amt = amt;
	}
	
	public void useAtm() {
		atm.checkBalance(name);;
		atm.withDraw(name, amt);
	}
	
	public void run() {
		useAtm();
	}
}


public class ATMCheck {

	public static void main(String[] args) {
		ATM atm = new ATM();
		Customer  c1 = new Customer(atm,"Sarvesh",2000);
	    Customer  c2 = new Customer(atm,"Sahishnu",5000);

	    c1.start();
	    c2.start();

	}

}
