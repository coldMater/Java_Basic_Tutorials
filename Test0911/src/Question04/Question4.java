package Question04;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		String giho = "";
		int value = 0;
		
		System.out.println("==== ��Ģ���� (+,-,*,/) ====");
		System.out.print("ù ��° ������ �Է��ϼ��� >> ");
		num1 = sc.nextInt();
		System.out.print("�� ��° ������ �Է��ϼ��� >> ");
		num2 = sc.nextInt();
		System.out.print("������ �����ڸ� �Է��ϼ��� >> ");
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
		
		System.out.println("������ : " + value);
	} 
}
