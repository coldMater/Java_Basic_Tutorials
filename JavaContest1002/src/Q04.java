import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1��° ���� >> ");
		int num1 = sc.nextInt();
		System.out.print("2��° ���� >> ");
		int num2 = sc.nextInt();
		
		int min = num1;
		int max = num2;
		
		for(int i = 1; i <= num1; i++) {
			if((num1 % i == 0) && (num2 % i == 0)) {
				max = i;
			}
		}
		
		System.out.println("�ִ� ����� : " + max);
		
		for(int i = (num1 * num2); i > 0; i--) {
			for (int j = i; j > 0; j--) {
				if(num1 * i == num2 * j) {
					min = num1 * i;
				}
			}
		}
		System.out.println("�ּ� ����� : " + min);
	}

}
