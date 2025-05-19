package lambda;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		String text = "apple banana apple orange banana";
		//result as {apple=2, banana=2, orange=1}
		HashMap<String,Integer> hm = new HashMap<>();
		for(String n:text.split(" ")) {
			hm.put(n, hm.getOrDefault(n, 0)+1);
		}
		System.out.println(hm);
		
	}

}
