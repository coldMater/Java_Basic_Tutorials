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
			System.out.print("[1]계좌생성  [2]입금  [3]출금  [4]이체  [5]거래내역조회  [6]종료 >> ");
			int input = sc.nextInt();
			if (input == 1) {
				System.out.println("[계좌생성]");
				System.out.print("이름  :  ");
				String name = sc.next();
				System.out.print("비밀번호  :  ");
				int password = sc.nextInt();
				System.out.print("잔액입금  :  ");
				int input_money = sc.nextInt();

				String accountNum = bankController.accountCreation(name, password, input_money);
				System.out.println("통장계좌번호가 생성되었습니다.");
				System.out.println("계좌번호 : " + accountNum);
			} else if (input == 2) {
				System.out.println("[입금]");
				System.out.print("계좌번호  :  ");
				String bank_name = sc.next();
				System.out.print("비밀번호  :  ");
				int password = sc.nextInt();
				System.out.print("입금액  :  ");
				int input_money = sc.nextInt();

				String diposite = bankController.deposite(input_money, bank_name, password);
				System.out.println(diposite);

				ArrayList<AccountVO> account = bankController.getArrayListAccountVO();
				System.out.println("이름 : " + account.get(0).getName());
				System.out.println("계좌번호 : " + account.get(0).getAccount());
				System.out.println("잔액 : " + account.get(0).getMoney());
			} else if (input == 3) {
				System.out.println("[출금]");
				System.out.print("계좌번호  :  ");
				String bank_name = sc.next();
				System.out.print("비밀번호  :  ");
				int password = sc.nextInt();
				System.out.print("출금액  :  ");
				int output_money = sc.nextInt();

				String withdraw = bankController.withdraw(bank_name, password, output_money);
				System.out.println(withdraw);

				ArrayList<AccountVO> account = bankController.getArrayListAccountVO();
				System.out.println("이름 : " + account.get(0).getName());
				System.out.println("계좌번호 : " + account.get(0).getAccount());
				System.out.println("잔액 : " + account.get(0).getMoney());
			} else if (input == 4) {
				while (true) {
					System.out.println("[이체]");
					System.out.print("내 계좌번호  :  ");
					String bank_name = sc.next();
					System.out.print("비밀번호  :  ");
					int password = sc.nextInt();

					String transfer = bankController.transfer(bank_name, password);
					System.out.println(transfer);

					if (!(transfer.equals("돈 없어"))) {
						ArrayList<AccountVO> account = bankController.getArrayListAccountVO();
						System.out.println("이름 : " + account.get(0).getName());
						System.out.println("계좌번호 : " + account.get(0).getAccount());
						System.out.println("잔액 : " + account.get(0).getMoney());
					}

					System.out.print("이체를 다시 진행하시겠습니까? (예/아니오) >> ");
					String yn = sc.next();
					if (yn.equals("예")) {
						continue;
					} else {
						break;
					}
				}
			} else if (input == 5) {
				System.out.println("[거래내역조회]");
				System.out.print("내 계좌번호  :  ");
				String bank_name = sc.next();
				System.out.print("비밀번호  :  ");
				int password = sc.nextInt();
				
				ArrayList<String> arrayString = bankController.transactionHistoryView(bank_name, password);
				System.out.println("보내는 이 \t 받는 이 \t\t 거래일시 \t\t\t\t\t 입금 \t 출금 \t");
				for (int i = 0; i < arrayString.size(); i++) {
					System.out.println(arrayString.get(arrayString.size() - i - 1));
				}
			} else if (input == 6) {
				System.out.println("ATM SYSTEM을 종료합니다");
				break;
			} else {
				System.out.println("잘못된 숫자입니다. 다시 입력해 주세요");
			}

		}

	}

}