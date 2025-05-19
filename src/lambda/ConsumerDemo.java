package lambda;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> con = (k)->System.out.println(k);
		
		List<String> ls = List.of("Sarvesh","Tiwari","Manoj","Vikas");
//		for(String n:ls) {
//			con.accept(n);
//		}
		ls.stream().forEach(con);
		
	}

}
