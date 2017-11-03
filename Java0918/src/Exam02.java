import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ют╥б : ");
		int input = sc.nextInt();
		
		System.out.println(fact(input));
	}

	private static int fact(int input) {
		int factorial = input;
		for(int i = input - 1; i > 0; i--) {
			factorial *= i;
		}
		return factorial;
	}

}
