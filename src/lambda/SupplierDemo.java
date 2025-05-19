package lambda;

import java.util.function.Supplier;

public class SupplierDemo implements Supplier<Integer> {

	public static void main(String[] args) {
		SupplierDemo su = new SupplierDemo();
		System.out.println(su.get());
	}
		

	@Override
	public Integer get() {
		int random = (int)Math.random()+101-20;
		
		return  random;
	}

}

