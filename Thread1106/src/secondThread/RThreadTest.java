package secondThread;

public class RThreadTest {

	public static void main(String[] args) {
		RThread rt = new RThread();
		Thread th = new Thread(rt);
		
		th.start();
		//th.stop();
		
	}

}
