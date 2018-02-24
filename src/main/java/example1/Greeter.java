package example1;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		Greeting helloWorldGreeting = new HelloWorldGreeting();
		Greeting lambdaGreeting = () -> System.out.println("Lambda Hello..");
		helloWorldGreeting.perform();
		lambdaGreeting.perform();
		
		Greeting innerClassGreeting = new Greeting() {
			public void perform() {
				System.out.println("Inner class hello world");
			}
		};
		
		innerClassGreeting.perform();
		
	

	}
}
