import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		double div = (double)num1 / num2;
		
		
		System.out.println("두 수의 더하기 : " + sum);
		System.out.println("두 수의 빼기 : " + sub);
		System.out.println("두 수의 곱하기 : " + mul);
		System.out.println("두 수의 나누기 : " + div);
	}

}
