package com.basics.collection;

import java.util.ArrayList;
import java.util.List;

public class Leetcode3 {

	public static void main(String[] args) {
		Sol sol = new Sol();
		int candies[] = {12,1,12};
		List<Boolean> kidsWithCandies = sol.kidsWithCandies(candies, 10);
		System.out.println(kidsWithCandies.toString());
		
	}

}

class Sol {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		    	
    	int max = candies[0];
    	for(int i = 0;i<candies.length;i++) {
    		if(candies[i]>=max) {
    			max = candies[i];
    		}
    	}
    	ArrayList<Boolean> list = new ArrayList<>();
    	for(int i=0;i<candies.length;i++) {
    		int sum = candies[i]+extraCandies;
    		if(sum>=max) {
    			list.add(true);
    		}else {
    			list.add(false);
    		}
    	}
    	
		return list;
    	
        
    }
}