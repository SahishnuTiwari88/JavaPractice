package lambda;

interface MyLambda{
	public void sum(int x,int y);
}
//using class
/*
class My implements MyLambda{

	@Override
	public void sum(int x, int y) {
		System.out.println("Sum : "+(x+y));
		
	}
	
}*/
public class LambdaDemo {

	public static void main(String[] args) {
		//using inner class
		/*
		MyLambda my = new MyLambda() {
			public void sum(int a,int b) {
				System.out.println("Sum is : "+(a+b));
			}
		};
		*/
		
		//using /lambda function
		MyLambda my =
				(a,b)->{
					System.out.println("Add is : "+(a+b));
				};
		
		my.sum(10, 25);
	}

}
