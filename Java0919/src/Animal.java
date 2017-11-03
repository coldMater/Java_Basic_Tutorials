
public class Animal {
	String name;
	int leg;
	String eat;
	int speed;
	String cry;
	int kg;
	
	public void eating() {
		System.out.println(name + "(이)가 " + eat + "(을)를 먹습니다.");
	}
	
	public void run() {
		System.out.println(name + "(이)가 " + speed + "km 속도로 달립니다.");
	}
	
	public void animalCry() {
		System.out.println(name + "(이)가 " + cry + "하고 웁니다.");
	}
}
