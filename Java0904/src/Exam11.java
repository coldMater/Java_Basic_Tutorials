import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("�� �� �� ū���� : " + num1);
		}
		else if(num1 == num2) {
			System.out.println("������ ���Դϴ�.");
		}
		else {
			System.out.println("�� �� �� ū���� : " + num2);
		}
	}

}
