
public class Refrigerator {
	Food[] food;
	String model;
	int height;
	int width;
	int volume;
	int temperature;
	
	public Refrigerator(Food[] food, String model, int height, int width, int volume, int temperature) {
		super();
		this.food = food;
		this.model = model;
		this.height = height;
		this.width = width;
		this.volume = volume;
		this.temperature = temperature;
	}
	
	public void upTemperature() {
		
	}
	
	public void downTemperature() {
		
	}
	
	public void checkFood(String name) {
		for(int i = 0; i < food.length; i++) {
			if(food[i].name.equals(name)) {
				System.out.println(name + "(��)�� �����մϴ�.");
			}
		}
	}
	
	public void viewFoodInfo(String name) {
		for(int i = 0; i < food.length; i++) {
			if(food[i].name.equals(name)) {
				System.out.println("�̸� \t ������� \t ������ \t ����");
				System.out.println(food[i].name + "\t" + food[i].shelfLife + "\t " + food[i].country + "\t " + food[i].gram);
			}
		}
	}
	
}
