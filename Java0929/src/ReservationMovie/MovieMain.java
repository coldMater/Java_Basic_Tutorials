package ReservationMovie;

import java.util.Scanner;

public class MovieMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MovieController reser = new MovieController();

		while (true) {
			System.out.print("1.오늘의 영화 2.좌석보기 3.영화예매 4.취소 5.종료 : ");
			int choice = sc.nextInt();

			if (choice == 1) {
				printMovie(reser);
			} else if (choice == 2) {
				ShowSeat(reser.getSeat(), reser);
			} else if (choice == 3) {
				ShowSeat(reser.getSeat(), reser);

				System.out.print("좌석번호 선택 >> ");
				String seatNum = sc.next();

				String ReservationNumber = reser.seatReservation(seatNum);

				ShowSeat(reser.getSeat(), reser);

				System.out.println("예약번호 : " + ReservationNumber);
			} else if (choice == 4) {
				System.out.print("취소할 예약번호 >> ");
				String ReservationNum = sc.next();

				reser.CancelReservation(ReservationNum);

				ShowSeat(reser.getSeat(), reser);
			} else if (choice == 5) {
				System.out.println("프로그램 종료");
				return;
			} else {
				System.out.println("잘못된 입력");
			}
		}

	}

	public static void printMovie(MovieController reser) {
		System.out.println("================= 오늘의 영화 =================");
		System.out.println("제목 \t\t\t 상영시간  장르 \t\t 감독 \t 관람가");
		System.out.println(reser.todayShow());
		System.out.println("===========================================");
	}

	private static void ShowSeat(String[][] seat, MovieController reser) {
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				System.out.print((char) ('A' + i));
				System.out.print(reser.SeatCheck(seat[i][j], j) + "\t");
			}
			System.out.println();
		}
	}

}
