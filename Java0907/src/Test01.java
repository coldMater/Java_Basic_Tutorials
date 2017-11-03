import java.util.Random;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int choice = 0;
		int num1 = 0;
		int num2 = 0;
		int mul = 0;
		int max = 0;

		System.out.println("======= 구구단 게임 =======");
		do {
			System.out.println("[1]게임시작 [2]연습하기 [3]종료");
			choice = sc.nextInt();
			int count = 0;
			if (choice == 1) {
				System.out.println("======= GAME STAR =======");
				while (true) {
					num1 = rd.nextInt(9) + 1;
					num2 = rd.nextInt(9) + 1;
					long start = System.currentTimeMillis();
					System.out.print(num1 + " * " + num2 + " = ");
					mul = sc.nextInt();
					long end = System.currentTimeMillis();
					if (num1 * num2 == mul && (end - start) / 1000 <= 2) {
						count++; continue;
					} else if ((end - start) / 1000 > 2) {
						System.out.println("시간초과입니다.");
					}
					System.out.println(count + "개 맞췄습니다!");
					System.out.println("======= GAME OVER ======");
					if (max < count) {
						System.out.println("신기록 달성!!");
						max = count;
					}
					break;
				}				
			} else if (choice == 2) {
				int e_dan;
				System.out.print("시작 단을 입력하세요! : ");
				int s_dan = sc.nextInt();
				do {
					System.out.print("마지막 단을 입력하세요! :");
					e_dan = sc.nextInt();
				} while (s_dan > e_dan);
				System.out.println("\n" + s_dan + "단 부터 " + e_dan + "단 까지 출력하겠습니다.");
				System.out.println("=====================================================================");
				for (int i = s_dan; i <= e_dan; i++) {
					System.out.print(i + "단\t");
					for (int j = 1; j <= 9; j++) {
						System.out.print(i + "*" + j + "=" + i * j + "\t");
					}
					System.out.println();
				}
				System.out.println("=====================================================================");

			} else if (choice == 3) {
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("잘못입력하셨습니다.");
			}
		} while (true);
	}

}
