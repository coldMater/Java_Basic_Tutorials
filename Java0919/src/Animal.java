
public class Animal {
	String name;
	int leg;
	String eat;
	int speed;
	String cry;
	int kg;
	
	public void eating() {
		System.out.println(name + "(��)�� " + eat + "(��)�� �Խ��ϴ�.");
	}
	
	public void run() {
		System.out.println(name + "(��)�� " + speed + "km �ӵ��� �޸��ϴ�.");
	}
	
	public void animalCry() {
		System.out.println(name + "(��)�� " + cry + "�ϰ� ��ϴ�.");
	}
}
