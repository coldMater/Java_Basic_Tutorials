import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int mul = 1;
		
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		num1 = sc.nextInt();
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		num2 = sc.nextInt();
		
		mul = (int)Math.pow(num1, num2);
		
//		for(int i = 1; i <= num2; i++) {
//			mul = mul * num1;
//		}
		System.out.println(num1 + "�� " + num2 + "���� " + mul + "�Դϴ�.");
	}

}
