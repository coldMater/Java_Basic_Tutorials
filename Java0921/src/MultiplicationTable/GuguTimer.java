package MultiplicationTable;

public class GuguTimer {
	private long startTime;
	private long endTime;

	public void start() {
		startTime = System.currentTimeMillis();
	}

	public void end() {
		endTime = System.currentTimeMillis();
	}

	public float getTime() {
		return (endTime - startTime) / 1000f;
	}

}
