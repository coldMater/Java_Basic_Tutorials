package toilet;

public class Washroom {

	public synchronized void openDoor(String who) {
		System.out.println(who+" ����");
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i==3) {
				System.out.println(who+" : ������!~~");
			}
		}
		
		System.out.println(who + "��! ��� ����.");
	
		
	}

}
