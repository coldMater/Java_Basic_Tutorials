import java.util.Scanner;

public class PiggyBankMain {

	public static void main(String[] args) {
		PiggyBank pb1 = new PiggyBank();
		Scanner sc = new Scanner(System.in);
		
		int inOut = 0;
		
		do {
			System.out.println("===== ���� =====");
			System.out.print("1.�Ա�  2.����  3.��ȸ  4.���� >> ");
			int choice = sc.nextInt();
			System.out.println();
			if(choice == 1) {
				System.out.println("===== �Ա� =====");
				System.out.print("�Ա� �ݾ� : ");
				inOut = sc.nextInt();
				System.out.println(inOut + "���� �ԱݵǾ����ϴ�.");
				pb1.deposit(inOut);
			} else if(choice == 2) {
				System.out.println("===== ��� =====");
				System.out.print("��� �ݾ� : ");
				inOut = sc.nextInt();
				System.out.println(inOut + "���� ����Ǿ����ϴ�.");
				pb1.withdraw(inOut);
			}else if (choice == 3) {
				System.out.println("===== ��ȸ =====");
				System.out.println("���� " + pb1.showMoney() + "���� �ֽ��ϴ�.");
			} else if (choice == 4) {
				System.out.println("===== ���� =====");
				break;
			} else {
				System.out.println("�߸��� �Է�");
			}
			System.out.println();
		}while(true);
	}

}
