import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�ݾ��� �Է��ϼ��� : ");
		int money = sc.nextInt();
		System.out.println("�޴��� ������.");
		System.out.print("1. �ݶ�(800��)  2. ����(500��)  3. ��Ÿ�ο���(1500��) >> ");
		int choice = sc.nextInt();

		int change = 0;

		if (choice == 1)
			change = money - 800;
		else if (choice == 2)
			change = money - 500;
		else if (choice == 3)
			change = money - 1500;
		else
			System.out.println("�ش��ϴ� �޴��� �����ϴ�.");

		if (change >= 0) {
			int ch_t = change / 1000;
			int ch_f = (change % 1000) / 500;
			int ch_h = (change % 500) / 100;
			System.out.println("�ܵ� : " + change + "��");
			System.out.println("õ�� : " + ch_t + "��, ����� : " + ch_f + "��, ��� : " + ch_h + "��");
		} else
			System.out.println("�ݾ��� �����մϴ�.");
	}

}