import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstMoney = 0;
		double interest = 0;
		int month = 0;
		double endMoney = 0;
		
		System.out.println("������ ������ �Է��� �ֽʽÿ�.");
		firstMoney = sc.nextInt();
		System.out.println("�������� �Է��� �ֽʽÿ�.");
		interest = sc.nextDouble();
		System.out.println("���ڱⰣ�� �Է��� �ֽʽÿ�.(�� ����)");
		month = sc.nextInt();
		
		endMoney = bank(firstMoney,interest,month);
		
		System.out.println(month + "�������� ��� ���ڴ� " + endMoney + "�� �Դϴ�.");
	}

	private static double bank(int firstMoney, double interest, int month) {
		double value = firstMoney*(Math.pow((1+interest), month/12));
		return value;
	}

}
