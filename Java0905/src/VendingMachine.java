import java.util.Scanner;

public class VendingMachine {
	public static void CalAndShow(int inputMoney, int inputMenuNum, int requireMoney) {
		int won1000cnt;
		int won500cnt;
		int won100cnt;
		switch (inputMenuNum) {
		case 1:
			requireMoney = 800;
			break;
		case 2:
			requireMoney = 500;
			break;
		case 3:
			requireMoney = 1500;
			break;
		}
		
		if(inputMoney < requireMoney) {
			System.out.println("금액이 부족합니다.");
		} else {
			inputMoney -= requireMoney;
			System.out.println("잔돈 :  " + inputMoney + "원");
			won1000cnt = inputMoney/1000;
			won500cnt = (inputMoney%1000)/500;
			won100cnt = inputMoney%1000%500/100;
			System.out.println("천원 :  " + won1000cnt + "개, 오백원 : " + won500cnt + "개, 백원 : " + won100cnt + "개");
		}
	}

	public static int InputMenu(Scanner sc) {
		int inputMenuNum;
		System.out.println("메뉴 선택");
		System.out.print("1. 콜라(800원)  2. 생수(500원)  3. 비타민워터(1500원) >> ");
		inputMenuNum = sc.nextInt();
		return inputMenuNum;
	}

	public static int InputMoney(Scanner sc) {
		int inputMoney;
		System.out.print("금액 입력 : ");
		inputMoney = sc.nextInt();
		return inputMoney;
	}
}
