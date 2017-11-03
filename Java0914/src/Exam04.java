import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[][] seat = new String[3][5];
		int reservationSeatNum = 100;

		todayShow();
		while (true) {
			System.out.print("1.���� 2.��ȸ 3.��� 4. ���� >> ");
			int choice = sc.nextInt();
			if (choice == 1) {
				showSeatNum(seat);
				String seatNum = "";

				while (true) {
					System.out.print("�¼���ȣ�� �������ּ���. >> ");
					seatNum = sc.next();
					if (exception(seatNum)) {
						break;
					}
				}

				char[] reservationSeat = seatNum.toCharArray();

				int line = reservationSeat[0] - 'A';
				int num = reservationSeat[1] - '0';
				seat[line][num] = reservationSeat[0] + String.valueOf(reservationSeatNum);
				reservationSeatNum++;

				showSeatNum(seat);
				System.out.println("������ �����ȣ�� " + seat[line][num] + "�Դϴ�.");
			} else if (choice == 2) {
				todayShow();
				showSeatNum(seat);
			} else if (choice == 3) {
				System.out.print("����Ͻ� �����ȣ�� �Է����ּ��� >> ");
				String seatNum = sc.next();
				System.out.println(seatNum);

				for (int i = 0; i < seat.length; i++) {
					for (int j = 0; j < seat[i].length; j++) {
						if (seatNum.equals(seat[i][j])) {
							seat[i][j] = null;
						}
					}
				}
				showSeatNum(seat);
			} else if (choice == 4) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			} else {
				System.out.println("�ٽ� �Է����ּ���.");
			}
		}
	}

	private static boolean exception(String seatNum) {

		if (65 <= seatNum.charAt(0) && seatNum.charAt(0) <= 90) {
			return true;
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			return false;
		}
	}

	public static void showSeatNum(String[][] seat) {
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				System.out.print((char) ('A' + i));
				if (seat[i][j] == null) {
					System.out.print(j + "[====]\t");
				} else {
					System.out.print(j + "[XXXX]\t ");
				}
			}
			System.out.println();
		}
	}

	private static void todayShow() {
		System.out.println("===================");
		System.out.println("������ ���� : ������� ����");
		System.out.println("����Ÿ�� : 5h");
		System.out.println("���ξ��� : ȫ��ȣ");
		System.out.println("===================");
	}

}
