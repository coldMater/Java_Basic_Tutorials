import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int p_wegiht = 0;
		int w_wegiht = 0;
		int week = 0;
		int w_week = 0;

		System.out.print("���� ������ : ");
		p_wegiht = sc.nextInt();
		System.out.print("��ǥ ������ : ");
		w_wegiht = sc.nextInt();
		System.out.print("��ǥ �Ⱓ(��)");
		w_week = sc.nextInt();

		while (true) {
			week++;
			System.out.print(week + "���� ������ ������ : ");
			int wegiht = sc.nextInt();
			p_wegiht = p_wegiht - wegiht;
			if (p_wegiht <= w_wegiht) {
				System.out.println(p_wegiht + "kg �޼�! ���̾�Ʈ ����!");
				break;
			} else if (week == w_week && p_wegiht > w_wegiht) {
				System.out.println(p_wegiht + "kg���� ���̾�Ʈ ����!");
				break;
			}
		}
	}

}
