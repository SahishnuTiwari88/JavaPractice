package com.basics.collection;

import java.util.ArrayList;

public class ListArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lst = new ArrayList<>();
		
		lst.add(null);
		lst.add("Sarvesh");
		lst.add("Tiwari");
		
		System.out.println(lst.get(0));
		lst.add(0,"Ram");
		System.out.println(lst.get(0));
		System.out.println(lst);

	}

}
