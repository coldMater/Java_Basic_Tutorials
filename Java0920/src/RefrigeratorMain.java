
public class RefrigeratorMain {

	public static void main(String[] args) {
		Food apple = new Food("���", "2017-10-05", "KOR", 500);
		Food banana = new Food("�ٳ���", "2017-09-30", "BRA", 1500);
		Food bacon = new Food("������", "2017-11-16", "DEU", 800);
		
		Food[] food = new Food[3];
		food[0] = apple;
		food[1] = banana;
		food[2] = bacon;
		
		Refrigerator ref = new Refrigerator(food, "�Ｚ", 1500, 800, 180, 8);
		
		ref.checkFood("������");
		ref.viewFoodInfo("������");
	}

}
