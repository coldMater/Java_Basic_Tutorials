import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] id_array = new String[5];
		String[] pw_array = new String[5];
		int i = 0;

		while (true) {
			System.out.print("1. ȸ������ 2. �α��� 3. ���� >> ");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("===== ȸ������ =====");
				if (i >= 5) {
					System.out.println("������ �� �̻� �Ұ����մϴ�.");
				} else {
					System.out.print("id �Է� : ");
					String id = sc.next();
					System.out.print("pw �Է� : ");
					String pw = sc.next();

					id_array[i] = id;
					pw_array[i] = pw;

					i++;

					System.out.println("���Լ���");
				}
			} else if (choice == 2) {
				int k = 0;
				System.out.println("===== �α��� =====");
				System.out.print("id �Է� : ");
				String id = sc.next();
				System.out.print("pw �Է� : ");
				String pw = sc.next();

				for (int j = 0; j < id_array.length; j++) {
					if (id.equals(id_array[j]) && pw.equals(pw_array[j])) {
						System.out.println("�α��� ����!");
						break;
					} else {
						k++;
					}
				}
				if (k == 5) {
					System.out.println("�α��� ����!");
				}
			} else if (choice == 3) {
				System.out.println("�����մϴ�.");
				break;
			} else {
				System.out.println("�ٽ� �Է����ּ���.");
			}
		}
	}

}
