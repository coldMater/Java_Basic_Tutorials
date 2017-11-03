
public class Exam03 {

	public static void main(String[] args) {
		int input = 8;

		for (int i = 1; i <= input; i++) {
			System.out.print(fibo(i) + " ");
		}
	}

	private static int fibo(int input) {
		if(input <= 1) {
			return input;
		} else {
			return fibo(input-1) + fibo(input-2);
		}
	}
	
}
