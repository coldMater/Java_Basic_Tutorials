package Question04;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		String giho = "";
		int value = 0;
		
		System.out.println("==== 사칙연산 (+,-,*,/) ====");
		System.out.print("첫 번째 정수를 입력하세요 >> ");
		num1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력하세요 >> ");
		num2 = sc.nextInt();
		System.out.print("연산할 연산자를 입력하세요 >> ");
		giho = sc.next();
		
		switch (giho) {
		case "+":
			value = num1 + num2;
			break;
		case "-":
			value = num1 - num2;
			break;
		case "*":
			value = num1 * num2;
			break;
		case "/":
			value = num1 / num2;
			break;
		}
		
		System.out.println("연산결과 : " + value);
	} 
}
