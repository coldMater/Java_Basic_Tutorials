import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		double div = (double)num1 / num2;
		
		
		System.out.println("�� ���� ���ϱ� : " + sum);
		System.out.println("�� ���� ���� : " + sub);
		System.out.println("�� ���� ���ϱ� : " + mul);
		System.out.println("�� ���� ������ : " + div);
	}

}
