import java.util.Scanner;

public class Answer07 {
	// ��Ʈ�� ����
	public static void main(String[] args) {
		String[] book_name = new String[10];
		String[] book_publisher = new String[10];
		String[] book_author = new String[10];
		int[] book_price = new int[10];
		int[] book_grade = new int[10];

		book_name[0] = "��� Java�� ó������?";
		book_price[0] = 33000;
		book_publisher[0] = "���Ǵ�Ƽ�Ͻ�";
		book_author[0] = "õ�α�";
		book_grade[0] = 55;

		book_name[1] = "�����ڵ��� ����";
		book_price[1] = 23000;
		book_publisher[1] = "�����";
		book_author[1] = "ȫ�浿";
		book_grade[1] = 80;

		book_name[2] = "���� ����";
		book_price[2] = 7650;
		book_publisher[2] = "�����";
		book_author[2] = "����ö";
		book_grade[2] = 87;

		book_name[3] = "���̽��� �̿��� ������ ����, �м��� �ð�ȭ";
		book_price[3] = 21600;
		book_publisher[3] = "���ҺϽ�";
		book_author[3] = "�̿�ȭ";
		book_grade[3] = 63;
		
		int book_size = 4;

		System.out.println("======�������� ���α׷�======");
		
		while (true) {
			System.out.print("1.�����˻� 2.�����˻� 3.�������� 4.�������� 5.���� >> ");
			int choice = new Scanner(System.in).nextInt();
			
			boolean book_check = true;

			if (choice == 1) { //�����˻�
				System.out.println("===== ���� �˻� =====");
				System.out.println("�˻��� ������ �̸��� �Է����ּ���.");
				String search_book_name = new Scanner(System.in).nextLine();
				
				for(int i = 0; i < book_name.length; i++) {
					if(search_book_name.equals(book_name[i])) {
						System.out.println(book_name[i] + " �� å�� ���� �������Դϴ�.");
						book_check = false;
					}
				}
				
			if(book_check) {
				System.out.println("ã���ô� å�� �������� �ʽ��ϴ�.");
			}
			} else if (choice == 2) { //�������
				System.out.println("===== ���� ��� =====");
				if(book_size > 9) {
					System.out.println("���̻� ����� �Ұ����մϴ�.");
					continue;
				}
				Scanner sc = new Scanner(System.in);
				
				System.out.println("�����̸� : ");
				String new_book_name = new Scanner(System.in).nextLine();
				
				System.out.println("�������� : ");
				int new_book_price = sc.nextInt();
				
				System.out.println("�������ǻ� : ");
				String new_book_publisher = new Scanner(System.in).nextLine();
				
				System.out.println("���������� : ");
				String new_book_author = new Scanner(System.in).nextLine();
				
				System.out.println("�������� : ");
				int new_book_grade = sc.nextInt();
				
				book_name[book_size] = new_book_name;
				book_price[book_size] = new_book_price;
				book_publisher[book_size] = new_book_publisher;
				book_author[book_size] = new_book_author;
				book_grade[book_size] = new_book_grade;
				System.out.println("��ϿϷ�");
				book_size++;
				
			} else if (choice == 3) { //��������
				System.out.println("===== ���� ����");
				System.out.println("������ ��� ���� ������ �̸��� �Է����ּ���.");
				String info_search_book_name = new Scanner(System.in).nextLine();
				
				boolean book_check2 = true;
				
				for (int i = 0; i < book_name.length; i++) {
					if(info_search_book_name.equals(book_name[i])) {
						System.out.println("�����̸�\t\t��������\t���ǻ�\t������\t����");
						System.out.println(book_name[i] + "\t\t" + book_price[i] + "\t" + book_publisher[i] + "\t" + book_author[i] + "\t" + book_grade[i]);
					}
				}
			} else if (choice == 4) { //��������
				System.out.println("===== ���� ���� =====");
				int[] ns = new int[book_size];
				
				for (int i = 0; i < ns.length; i++) {
					ns[i] = book_grade[i] /10;
				}
				
				for (int i = 10; i > 0; i--) {
					System.out.print(i * 10 + "\t\t\t");
					for (int j = 0; j < book_size; j++) {
						if(i <= ns[j]) {
							System.out.print("*\t\t\t\t\t");
						} else {
							System.out.print("\t\t\t\t\t");
						}
					}
					System.out.println();
				}
				System.out.print("\t");
				
				for (int i = 0; i < ns.length; i++) {
					System.out.print(book_name[i] + "\t\t");
				}
				System.out.println();
			} else if (choice == 5) { //����
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;
			} else { //�� �̿��� ����
				System.out.println("��Ȯ�� ���ڸ� �ٽ� �Է����ֽʽÿ�.");
			}
		}
	}

}
