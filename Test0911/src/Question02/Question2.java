package Question02;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int tmp = 0;
		
		System.out.print("첫번째 정수 입력 >> ");
		num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 >> ");
		num2 = sc.nextInt();
		
		System.out.println("교환 전 : " + num1 + ", " + num2);
		
		tmp = num1;
		num1 = num2;
		num2 = tmp;
		
		System.out.println("교환 후 : " + num1 + ", " + num2);
	}

}
