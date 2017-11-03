
public class Exam01 {

	public static void main(String[] args) {
		int result = addNumber(1,10);
		System.out.println(result);
		
		float result1 = subNumber(1f, 3f);
		System.out.println(result1);
	}
	
	private static float subNumber(float f, float g) {
		return f-g;
	}

	public static int addNumber(int num1, int num2) {
		return num1+num2;
	}

}
