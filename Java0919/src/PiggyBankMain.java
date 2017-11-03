import java.util.Scanner;

public class PiggyBankMain {

	public static void main(String[] args) {
		PiggyBank pb1 = new PiggyBank();
		Scanner sc = new Scanner(System.in);
		
		int inOut = 0;
		
		do {
			System.out.println("===== 선택 =====");
			System.out.print("1.입금  2.인출  3.조회  4.종료 >> ");
			int choice = sc.nextInt();
			System.out.println();
			if(choice == 1) {
				System.out.println("===== 입금 =====");
				System.out.print("입금 금액 : ");
				inOut = sc.nextInt();
				System.out.println(inOut + "원이 입금되었습니다.");
				pb1.deposit(inOut);
			} else if(choice == 2) {
				System.out.println("===== 출금 =====");
				System.out.print("출금 금액 : ");
				inOut = sc.nextInt();
				System.out.println(inOut + "원이 인출되었습니다.");
				pb1.withdraw(inOut);
			}else if (choice == 3) {
				System.out.println("===== 조회 =====");
				System.out.println("현재 " + pb1.showMoney() + "원이 있습니다.");
			} else if (choice == 4) {
				System.out.println("===== 종료 =====");
				break;
			} else {
				System.out.println("잘못된 입력");
			}
			System.out.println();
		}while(true);
	}

}
