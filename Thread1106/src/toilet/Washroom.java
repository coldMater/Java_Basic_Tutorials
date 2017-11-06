package toilet;

public class Washroom {

	public synchronized void openDoor(String who) {
		System.out.println(who+" 입장");
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i==3) {
				System.out.println(who+" : 끄으응!~~");
			}
		}
		
		System.out.println(who + "아! 기분 좋다.");
	
		
	}

}
