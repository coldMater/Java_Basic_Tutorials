import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[][] seat = new String[3][5];
		int reservationSeatNum = 100;

		todayShow();
		while (true) {
			System.out.print("1.예약 2.조회 3.취소 4. 종료 >> ");
			int choice = sc.nextInt();
			if (choice == 1) {
				showSeatNum(seat);
				String seatNum = "";

				while (true) {
					System.out.print("좌석번호를 선택해주세요. >> ");
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
				System.out.println("고객님의 예약번호는 " + seat[line][num] + "입니다.");
			} else if (choice == 2) {
				todayShow();
				showSeatNum(seat);
			} else if (choice == 3) {
				System.out.print("취소하실 예약번호를 입력해주세요 >> ");
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
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("다시 입력해주세요.");
			}
		}
	}

	private static boolean exception(String seatNum) {

		if (65 <= seatNum.charAt(0) && seatNum.charAt(0) <= 90) {
			return true;
		} else {
			System.out.println("잘못 입력하셨습니다.");
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
		System.out.println("오늘의 공연 : 오페라의 유령");
		System.out.println("러닝타임 : 5h");
		System.out.println("메인액터 : 홍광호");
		System.out.println("===================");
	}

}
