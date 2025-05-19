package lambda;

import java.util.Arrays;

public class SecondLarge {

	public static void main(String[] args) {
		int arr[] = {4,8,10,10,20,9,4,11,20,21,21};
		
		Integer integer = Arrays.stream(arr).distinct().boxed().sorted((a,b)->b-a).skip(1).findFirst().get();
		
		System.out.println(integer);
	}

}
