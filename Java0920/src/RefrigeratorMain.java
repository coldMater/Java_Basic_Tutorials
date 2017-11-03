
public class RefrigeratorMain {

	public static void main(String[] args) {
		Food apple = new Food("사과", "2017-10-05", "KOR", 500);
		Food banana = new Food("바나나", "2017-09-30", "BRA", 1500);
		Food bacon = new Food("베이컨", "2017-11-16", "DEU", 800);
		
		Food[] food = new Food[3];
		food[0] = apple;
		food[1] = banana;
		food[2] = bacon;
		
		Refrigerator ref = new Refrigerator(food, "삼성", 1500, 800, 180, 8);
		
		ref.checkFood("베이컨");
		ref.viewFoodInfo("베이컨");
	}

}
