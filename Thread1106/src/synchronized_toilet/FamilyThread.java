package synchronized_toilet;

public class FamilyThread extends Thread {

	private Washroom wr;
	private String who;
	
	public FamilyThread(Washroom wr, String who) {
		this.wr = wr;
		this.who = who;
	}

	@Override
	public void run() {
		wr.openDoor(who);
	}
	
}
