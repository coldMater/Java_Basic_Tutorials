package MovieReservation;

public class Reservation {
	private String[][] seat;	
	private String seatNum;
	private int reservationSeatNum;
	private MovieVo movie;
	
	public Reservation() {
		super();
		movie = new MovieVo("�������� ����", 118, "����, ������", "���ſ�", 15);
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
	
}
