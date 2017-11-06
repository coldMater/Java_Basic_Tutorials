package secondThread;

public class MyThreadTest2 {

	public static void main(String[] args) {
		
		MyThread2 th1 = new MyThread2();
		th1.start();
		
		int i = 0;
		
		while(true) {
			try {
				Thread.sleep(2000);
				i++;
				System.out.println("My thread(Main): "+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}

}
