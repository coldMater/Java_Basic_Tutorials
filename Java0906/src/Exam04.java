import java.util.Random;
import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int rsp = 0;
		int input = 0;
		System.out.println("���� ���� �� ����!");
		do {
			System.out.print("1. ���� 2. ���� 3. �� >> ");
			input = sc.nextInt();

			if (!(input == 1 || input == 2 || input == 3)) {
				break;
			}

			switch (input) {
			case 1:
				System.out.println("������ ���̽��ϴ�.");
				break;
			case 2:
				System.out.println("������ ���̽��ϴ�.");
				break;
			case 3:
				System.out.println("���� ���̽��ϴ�.");
				break;
			}

			rsp = rd.nextInt(3) + 1;

			switch (rsp) {
			case 1:
				System.out.println("��ǻ�Ͱ� ������ �½��ϴ�.");
				break;
			case 2:
				System.out.println("��ǻ�Ͱ� ������ �½��ϴ�.");
				break;
			case 3:
				System.out.println("��ǻ�Ͱ� ���� �½��ϴ�.");
				break;
			}

			if (input == rsp) {
				System.out.println("�����ϴ�.");
			} else if (input == 1) {
				switch (rsp) {
				case 2:
					System.out.println("�����ϴ�.");
					break;
				case 3:
					System.out.println("�̰���ϴ�.");
					break;
				}
			} else if (input == 2) {
				switch (rsp) {
				case 1:
					System.out.println("�̰���ϴ�.");
					break;
				case 3:
					System.out.println("�����ϴ�.");
					break;
				}
			} else if (input == 3) {
				switch (rsp) {
				case 1:
					System.out.println("�����ϴ�.");
					break;
				case 2:
					System.out.println("�̰���ϴ�.");
					break;
				}
			}
		} while (true);

		System.out.println("������ ����Ǿ����ϴ�.");
	}

}