import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("금액을 입력하세요 : ");
		int money = sc.nextInt();
		System.out.println("메뉴를 고르세요.");
		System.out.print("1. 콜라(800원)  2. 생수(500원)  3. 비타민워터(1500원) >> ");
		int choice = sc.nextInt();

		int change = 0;

		if (choice == 1)
			change = money - 800;
		else if (choice == 2)
			change = money - 500;
		else if (choice == 3)
			change = money - 1500;
		else
			System.out.println("해당하는 메뉴가 없습니다.");

		if (change >= 0) {
			int ch_t = change / 1000;
			int ch_f = (change % 1000) / 500;
			int ch_h = (change % 500) / 100;
			System.out.println("잔돈 : " + change + "원");
			System.out.println("천원 : " + ch_t + "개, 오백원 : " + ch_f + "개, 백원 : " + ch_h + "개");
		} else
			System.out.println("금액이 부족합니다.");
	}

}