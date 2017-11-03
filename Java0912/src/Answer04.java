import java.util.Scanner;

public class Answer04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사칙연산");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		String op = sc.next();
		
		switch (op) {
		case "+":
			System.out.println(num1+num2);
			break;
		case "-":
			System.out.println(num1-num2);
			break;
		case "*":
			System.out.println(num1*num2);
			break;
		case "/":
			System.out.println(num1/num2);
			break;
		}
	}

}
