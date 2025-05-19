package lambda;

interface MyLambda1 {
	public void display();
}

//using instance variable,local variable,local variable(inside lambda function/expression)
class Demo {
	int temp = 2;

	public void method() {
		int count = 0;
		MyLambda1 m = () -> {
			int in = 0;
			System.out.println("Labmba " + count);
			System.out.println("Inside Lambda : " + ++in);
			System.out.println("instance variable Lambda : " + ++temp);
		};

		m.display();
		Demo2 d2 = new Demo2();
		d2.show(m);
	}
}

//passing lambda expression as parameter

class Demo2 {
	
	public void show(MyLambda1 ml) {
		ml.display();
	}
}

public class LambdaDemo2 {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.method();
		

	}

}
