package Question07_Partner;

import java.util.Scanner;

public class Question7_Partner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] book_name = new String[10];
		String[] book_publisher = new String[10];
		String[] book_author = new String[10];
		int[] book_price = new int[10];
		int[] book_grade = new int[10];
		int num = 0;
		int i = 0;

		while (true) {
			System.out.println("============= ���� ���� ���α׷� =============");
			System.out.print("1.�����˻� 2.������� 3.�������� 4.�������� 5.���� >> ");
			num = sc.nextInt();

			if (num == 1) {
				int k = 0;
				System.out.println("=== ���� �˻� ===");
				System.out.println("�˻��� ������ �̸��� �Է����ּ���.");
				String name = sc.next();

				for (int j = 0; j < book_name.length; j++) {
					if (name.equals(book_name[j])) {
						System.out.println(name + "�� å�� ���� �������Դϴ�.");
						break;
					} else {
						k++;
					}
				}
				if (k == 10) {
					System.out.println("ã���ô� å�� �������� �ʽ��ϴ�.");
				}
			} else if (num == 2) {
				System.out.println("=== ���� ��� ===");
				if (i < 10) {
					System.out.print("�����̸� : ");
					String name = sc.next();
					System.out.print("�������� : ");
					int price = sc.nextInt();
					System.out.print("�������ǻ� : ");
					String publisher = sc.next();
					System.out.print("���������� : ");
					String author = sc.next();
					System.out.print("�������� : ");
					int grade = sc.nextInt();

					book_name[i] = name;
					book_price[i] = price;
					book_publisher[i] = publisher;
					book_author[i] = author;
					book_grade[i] = grade;

					System.out.println(book_name[i] + " ��� �Ϸ�!!");
					i++;
				} else {
					System.out.println("�� �̻� ����� �Ұ��� �մϴ�.");
				}
			} else if (num == 3) {
				int k=0;
				System.out.println("===== ���� ���� =====");
				System.out.println("������ ��� ���� ������ �̸��� �Է����ּ���.");
				String bookname_input = sc.next();
				for (int j = 0; j < book_name.length; j++) {
					if(bookname_input.equals(book_name[j])) {
						System.out.println("�����̸� \t �������� \t ���ǻ� \t ������ \t ����");
						System.out.println(book_name[j] + "  \t  " + book_price[j] + "  \t  " + book_publisher[j] + "  \t  " + book_author[j] + "  \t  " + book_grade[j]);
						break;
					} else {
						k++;
					}
				}
				if(k == 10) {
					System.out.println("������ ����� �ϴ� å�� �������� �ʽ��ϴ�.");
				}

			} else if (num == 4) {
				System.out.println("===== ���� ���� =====");
				for (int l = 0; l < book_grade.length; l++) {
					System.out.print(100 - (l * 10));
					for (int j = 0; j < book_grade.length; j++) {
						int grade = book_grade[j] - (book_grade[j] % 10);
						if(grade < 100 - (l * 10)) {
							System.out.print("\t");
						}
						if(grade >= 100 - (l * 10)) {
							System.out.print("\t*");
						}
					}
					System.out.println();
				}
				for (int j = 0; j < i; j++) {
					System.out.print("\t" + book_name[j]);
				}
				System.out.println();
			} else if (num == 5) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("��Ȯ�� ���ڸ� �ٽ� �Է��� �ֽʽÿ�.");
			}
		}
	}

}
