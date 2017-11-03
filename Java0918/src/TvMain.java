
public class TvMain {

	public static void main(String[] args) {
		Tv tv1 = new Tv();
		tv1.modelName = "samsung";
		tv1.turnOn();
		System.out.println(tv1);
		
		Tv tv2 = new Tv();
		tv2.modelName = "LG";
		tv2.turnOn();
		System.out.println(tv2);
		
		Tv tv3 = tv1;
		System.out.println(tv3);
	}

}
