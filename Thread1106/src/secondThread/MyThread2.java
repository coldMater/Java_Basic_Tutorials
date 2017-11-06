package secondThread;

public class MyThread2 extends Thread {
	int i = 0;

	@Override
	public void run() {

		while (true) {
			try {
				Thread.sleep(1000);
				i++;
				System.out.println("My Thread : " + i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
