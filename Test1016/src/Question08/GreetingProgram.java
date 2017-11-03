package Question08;

public class GreetingProgram {
	Greeting greeting;

	public void setLanguage(Greeting greeting) {
		this.greeting = greeting;
	}
	
	public void greet(String name) {
		greeting.greet(name);
	}
}
