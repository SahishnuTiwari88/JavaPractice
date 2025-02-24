package com.basics;

public class Hashcode extends Object{
	final int num;
	static final  int rup;
	
	static
	{
		rup =109;
	}
	
	
	public Hashcode(int num) {
		//super();
		this.num = num;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Sravesh";
		final int roll = 100;
		
		System.out.println("Strinf hashcode "+str.hashCode());
		Hashcode hs = new Hashcode(1000);
		System.out.println(roll);
		System.out.println(rup+20);
		
		System.out.println(hs.num*2);

	}

}
