import java.util.Random;
import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int rsp = 0;
		int input = 0;
		System.out.println("가위 바위 보 게임!");
		do {
			System.out.print("1. 가위 2. 바위 3. 보 >> ");
			input = sc.nextInt();

			if (!(input == 1 || input == 2 || input == 3)) {
				break;
			}

			switch (input) {
			case 1:
				System.out.println("가위를 내셨습니다.");
				break;
			case 2:
				System.out.println("바위를 내셨습니다.");
				break;
			case 3:
				System.out.println("보를 내셨습니다.");
				break;
			}

			rsp = rd.nextInt(3) + 1;

			switch (rsp) {
			case 1:
				System.out.println("컴퓨터가 가위를 냈습니다.");
				break;
			case 2:
				System.out.println("컴퓨터가 바위를 냈습니다.");
				break;
			case 3:
				System.out.println("컴퓨터가 보를 냈습니다.");
				break;
			}

			if (input == rsp) {
				System.out.println("비겼습니다.");
			} else if (input == 1) {
				switch (rsp) {
				case 2:
					System.out.println("졌습니다.");
					break;
				case 3:
					System.out.println("이겼습니다.");
					break;
				}
			} else if (input == 2) {
				switch (rsp) {
				case 1:
					System.out.println("이겼습니다.");
					break;
				case 3:
					System.out.println("졌습니다.");
					break;
				}
			} else if (input == 3) {
				switch (rsp) {
				case 1:
					System.out.println("졌습니다.");
					break;
				case 2:
					System.out.println("이겼습니다.");
					break;
				}
			}
		} while (true);

		System.out.println("게임이 종료되었습니다.");
	}

}