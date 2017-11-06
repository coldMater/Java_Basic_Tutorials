package secondThread;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("MyThread 의 스레드 입니다.");
	}
	
}
