package lambda;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<Integer> pd = n->n%2==0;
		
		List<Integer> ls = List.of(1,2,3,4,5,6,7,8);
		List<Integer> collect = ls.stream().filter(pd).collect(Collectors.toList());
		System.out.println(collect);
		

	}

}
