package Question02;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int tmp = 0;
		
		System.out.print("ù��° ���� �Է� >> ");
		num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� >> ");
		num2 = sc.nextInt();
		
		System.out.println("��ȯ �� : " + num1 + ", " + num2);
		
		tmp = num1;
		num1 = num2;
		num2 = tmp;
		
		System.out.println("��ȯ �� : " + num1 + ", " + num2);
	}

}
