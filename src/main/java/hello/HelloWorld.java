package hello;

import org.joda.time.LocalTime;

public class HelloWorld {

	public static void main (String[] args) {
		
		LocalTime currentTime = new LocalTime();
	    System.out.printf("The current local time is: %s", currentTime);
		
		Greeter g = new Greeter();
		System.out.printf("\n---------------\n%s\n---------------\n", g.sayHello());
	}
	
}
