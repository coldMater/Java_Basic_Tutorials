import java.util.Scanner;

public class Answer02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		int tmp = num1;
		num1 = num2;
		num2 = tmp;
	}

}
