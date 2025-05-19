package com.basics.wrapper;

enum Deptt{
	CS("Ram","Block A"),IT("Laxman","Block B"),ECE("Sarvesh","Block C");
	String headName;
	String location;
	
	private Deptt(String name,String loc) {
		this.headName = name;
		this.location = loc;
	}
	
	public String getName() {
		return headName;
	}
	public String getloc() {
		return location;
	}
}

public class EnumDemo2 {

	public static void main(String[] args) {
		Deptt d= Deptt.IT;
		System.out.println("Head Name : "+d.getName()+" Block Name : "+d.getloc());

	}

}
