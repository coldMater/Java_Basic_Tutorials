package ReservationMovie;

public class MovieController {
	private String[][] seat;
	private String seatNum;
	private int reservationSeatNum;
	private MovieVo movie;

	public MovieController() {
		super();
		movie = new MovieVo("살인자의 기억법", 118, "공포, 스릴러", "원신연", 15);
		seat = new String[3][5];
		reservationSeatNum = 1000;
	}

	public MovieVo todayShow() {
		return movie;
	}

	public String SeatCheck(String seat, int j) {
		if (seat == null) {
			return j + "[====]";
		} else {
			return j + "[XXXX]";
		}
	}

	public String[][] getSeat() {
		seat[1][3] = " ";
		seat[1][2] = " ";
		seat[0][4] = " ";
		return seat;
	}

	public String seatReservation(String seatNum2) {
		char[] reservationSeat = seatNum2.toCharArray();

		int line = reservationSeat[0] - 'A';
		int num = reservationSeat[1] - '0';

		seat[line][num] = reservationSeat[0] + String.valueOf(reservationSeatNum);
		reservationSeatNum++;

		return seat[line][num];
	}

	public void CancelReservation(String reservationNum) {
		char line = reservationNum.charAt(0);

		for (int j = 0; j < seat[line - 'A'].length; j++) {
			if (reservationNum.equals(seat[line - 'A'][j])) {
				seat[line - 'A'][j] = null;
			}
		}
	}


}
