import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] id_array = new String[5];
		String[] pw_array = new String[5];
		int i = 0;

		while (true) {
			System.out.print("1. 회원가입 2. 로그인 3. 종료 >> ");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("===== 회원가입 =====");
				if (i >= 5) {
					System.out.println("가입이 더 이상 불가능합니다.");
				} else {
					System.out.print("id 입력 : ");
					String id = sc.next();
					System.out.print("pw 입력 : ");
					String pw = sc.next();

					id_array[i] = id;
					pw_array[i] = pw;

					i++;

					System.out.println("가입성공");
				}
			} else if (choice == 2) {
				int k = 0;
				System.out.println("===== 로그인 =====");
				System.out.print("id 입력 : ");
				String id = sc.next();
				System.out.print("pw 입력 : ");
				String pw = sc.next();

				for (int j = 0; j < id_array.length; j++) {
					if (id.equals(id_array[j]) && pw.equals(pw_array[j])) {
						System.out.println("로그인 성공!");
						break;
					} else {
						k++;
					}
				}
				if (k == 5) {
					System.out.println("로그인 실패!");
				}
			} else if (choice == 3) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("다시 입력해주세요.");
			}
		}
	}

}
