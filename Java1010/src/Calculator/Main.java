package Calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. µ¡¼À, 2. »¬¼À");
		int choice = sc.nextInt();
		System.out.print("Ã¹ ¹øÂ° ¼ýÀÚ : ");
		int num1 = sc.nextInt();
		System.out.print("µÎ ¹øÂ° ¼ýÀÚ : ");
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
		
		System.out.println("°á°ú : " + result);
	}

}
