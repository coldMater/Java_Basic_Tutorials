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
			System.out.println("�ݾ��� �����մϴ�.");
		} else {
			inputMoney -= requireMoney;
			System.out.println("�ܵ� :  " + inputMoney + "��");
			won1000cnt = inputMoney/1000;
			won500cnt = (inputMoney%1000)/500;
			won100cnt = inputMoney%1000%500/100;
			System.out.println("õ�� :  " + won1000cnt + "��, ����� : " + won500cnt + "��, ��� : " + won100cnt + "��");
		}
	}

	public static int InputMenu(Scanner sc) {
		int inputMenuNum;
		System.out.println("�޴� ����");
		System.out.print("1. �ݶ�(800��)  2. ����(500��)  3. ��Ÿ�ο���(1500��) >> ");
		inputMenuNum = sc.nextInt();
		return inputMenuNum;
	}

	public static int InputMoney(Scanner sc) {
		int inputMoney;
		System.out.print("�ݾ� �Է� : ");
		inputMoney = sc.nextInt();
		return inputMoney;
	}
}
