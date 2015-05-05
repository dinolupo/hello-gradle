package hello;

public class HelloWorld {

	public static void main (String[] args) {
		Greeter g = new Greeter();
		System.out.printf("---------------\n%s\n---------------", g.sayHello());
	}
	
}
