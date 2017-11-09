package Question09_Partner;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.AbstractButton;

public class MainSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		BankController bankController = new BankController();

		while (true) {
			System.out.println("=================[ATM SYSTEM]===================");
			System.out.print("[1]���»���  [2]�Ա�  [3]���  [4]��ü  [5]�ŷ�������ȸ  [6]���� >> ");
			int input = sc.nextInt();
			if (input == 1) {
				System.out.println("[���»���]");
				System.out.print("�̸�  :  ");
				String name = sc.next();
				System.out.print("��й�ȣ  :  ");
				int password = sc.nextInt();
				System.out.print("�ܾ��Ա�  :  ");
				int input_money = sc.nextInt();

				String accountNum = bankController.accountCreation(name, password, input_money);
				System.out.println("������¹�ȣ�� �����Ǿ����ϴ�.");
				System.out.println("���¹�ȣ : " + accountNum);
			} else if (input == 2) {
				System.out.println("[�Ա�]");
				System.out.print("���¹�ȣ  :  ");
				String bank_name = sc.next();
				System.out.print("��й�ȣ  :  ");
				int password = sc.nextInt();
				System.out.print("�Աݾ�  :  ");
				int input_money = sc.nextInt();

				String diposite = bankController.deposite(input_money, bank_name, password);
				System.out.println(diposite);

				ArrayList<AccountVO> account = bankController.getArrayListAccountVO();
				System.out.println("�̸� : " + account.get(0).getName());
				System.out.println("���¹�ȣ : " + account.get(0).getAccount());
				System.out.println("�ܾ� : " + account.get(0).getMoney());
			} else if (input == 3) {
				System.out.println("[���]");
				System.out.print("���¹�ȣ  :  ");
				String bank_name = sc.next();
				System.out.print("��й�ȣ  :  ");
				int password = sc.nextInt();
				System.out.print("��ݾ�  :  ");
				int output_money = sc.nextInt();

				String withdraw = bankController.withdraw(bank_name, password, output_money);
				System.out.println(withdraw);

				ArrayList<AccountVO> account = bankController.getArrayListAccountVO();
				System.out.println("�̸� : " + account.get(0).getName());
				System.out.println("���¹�ȣ : " + account.get(0).getAccount());
				System.out.println("�ܾ� : " + account.get(0).getMoney());
			} else if (input == 4) {
				while (true) {
					System.out.println("[��ü]");
					System.out.print("�� ���¹�ȣ  :  ");
					String bank_name = sc.next();
					System.out.print("��й�ȣ  :  ");
					int password = sc.nextInt();

					String transfer = bankController.transfer(bank_name, password);
					System.out.println(transfer);

					if (!(transfer.equals("�� ����"))) {
						ArrayList<AccountVO> account = bankController.getArrayListAccountVO();
						System.out.println("�̸� : " + account.get(0).getName());
						System.out.println("���¹�ȣ : " + account.get(0).getAccount());
						System.out.println("�ܾ� : " + account.get(0).getMoney());
					}

					System.out.print("��ü�� �ٽ� �����Ͻðڽ��ϱ�? (��/�ƴϿ�) >> ");
					String yn = sc.next();
					if (yn.equals("��")) {
						continue;
					} else {
						break;
					}
				}
			} else if (input == 5) {
				System.out.println("[�ŷ�������ȸ]");
				System.out.print("�� ���¹�ȣ  :  ");
				String bank_name = sc.next();
				System.out.print("��й�ȣ  :  ");
				int password = sc.nextInt();
				
				ArrayList<String> arrayString = bankController.transactionHistoryView(bank_name, password);
				System.out.println("������ �� \t �޴� �� \t\t �ŷ��Ͻ� \t\t\t\t\t �Ա� \t ��� \t");
				for (int i = 0; i < arrayString.size(); i++) {
					System.out.println(arrayString.get(arrayString.size() - i - 1));
				}
			} else if (input == 6) {
				System.out.println("ATM SYSTEM�� �����մϴ�");
				break;
			} else {
				System.out.println("�߸��� �����Դϴ�. �ٽ� �Է��� �ּ���");
			}

		}

	}

}