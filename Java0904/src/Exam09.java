import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�뵿�ð��� �Է��ϼ��� : ");
		int hour = sc.nextInt();
		
		double pay = hour > 8 ? (8 * 5000) + ((hour - 8) * (5000 * 1.5)) : hour * 5000;
		
		System.out.println("�� �ӱ��� " + (int)pay + "�� �Դϴ�.");
	}

}