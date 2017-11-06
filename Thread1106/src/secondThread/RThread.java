package secondThread;

public class RThread implements Runnable{

	@Override
	public void run() {
		int i = 0;
		while(true) {
			try {
				Thread.sleep(1000);
				i++;
				System.out.println("My RunnableThread : "+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}

}
