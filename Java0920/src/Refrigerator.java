
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
				System.out.println(name + "(이)가 존재합니다.");
			}
		}
	}
	
	public void viewFoodInfo(String name) {
		for(int i = 0; i < food.length; i++) {
			if(food[i].name.equals(name)) {
				System.out.println("이름 \t 유통기한 \t 원산지 \t 무게");
				System.out.println(food[i].name + "\t" + food[i].shelfLife + "\t " + food[i].country + "\t " + food[i].gram);
			}
		}
	}
	
}
