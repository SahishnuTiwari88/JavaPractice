package com.basics;

import java.util.ArrayList;
import java.util.List;

public class SubString {
	
	public static List<String> subString(String[] str){
		List<String> sub = new ArrayList<>();
		
		for(int k = 0;k<str.length;k++) {
			int i=0;
			while(i<str.length) {
				
				if(i!=k && str[k].contains(str[i])) {
					sub.add(str[i]);
					//break;
				}
				i++;
			}

		}
		
		return sub;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"mass","as","ass","hero","superhero"};
		System.out.println(subString(str));
	}

}
