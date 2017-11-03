
public class Exam03 {

	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 5;
		int result = close10(num1, num2);
		System.out.println("10에 가까운 수 : " + result);
	}

	private static int close10(int num1, int num2) {
		int n1 = num1 - 10;
		int n2 = num2 - 10;
		
		if (n1 < 0)
			n1 *= -1;
		if (n2 < 0)
			n2 *= -1;
		
		if (n1 > n2)
			return num2;
		else if (n1 < n2)
			return num1;
		else
			return 0;
	}

}