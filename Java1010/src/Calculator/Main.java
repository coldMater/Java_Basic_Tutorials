package Calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. ����, 2. ����");
		int choice = sc.nextInt();
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		Cal cal = new Cal();
		
		int result = 0;
		
		switch (choice) {
		case 1:
			result = cal.operate(num1, num2, new Addition());
			break;
		case 2:
			result = cal.operate(num1, num2, new Subtraction());
			break;
		}
		
		System.out.println("��� : " + result);
	}

}
