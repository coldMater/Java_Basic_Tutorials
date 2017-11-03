
public class Tv {
	String modelName;
	String brand;
	double screenSize;
	int weight;
	boolean isTurnOn;
	
	void turnOn() {
		isTurnOn = true;
		System.out.println(modelName + " TV turn on");
	}
	
	void turnOff() {
		isTurnOn = false;
		System.out.println(modelName + " TV turn off");
	}
}
