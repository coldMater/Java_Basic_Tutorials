package ReservationMovie;

import java.util.Scanner;

public class MovieMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MovieController reser = new MovieController();

		while (true) {
			System.out.print("1.������ ��ȭ 2.�¼����� 3.��ȭ���� 4.��� 5.���� : ");
			int choice = sc.nextInt();

			if (choice == 1) {
				printMovie(reser);
			} else if (choice == 2) {
				ShowSeat(reser.getSeat(), reser);
			} else if (choice == 3) {
				ShowSeat(reser.getSeat(), reser);

				System.out.print("�¼���ȣ ���� >> ");
				String seatNum = sc.next();

				String ReservationNumber = reser.seatReservation(seatNum);

				ShowSeat(reser.getSeat(), reser);

				System.out.println("�����ȣ : " + ReservationNumber);
			} else if (choice == 4) {
				System.out.print("����� �����ȣ >> ");
				String ReservationNum = sc.next();

				reser.CancelReservation(ReservationNum);

				ShowSeat(reser.getSeat(), reser);
			} else if (choice == 5) {
				System.out.println("���α׷� ����");
				return;
			} else {
				System.out.println("�߸��� �Է�");
			}
		}

	}

	public static void printMovie(MovieController reser) {
		System.out.println("================= ������ ��ȭ =================");
		System.out.println("���� \t\t\t �󿵽ð�  �帣 \t\t ���� \t ������");
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
