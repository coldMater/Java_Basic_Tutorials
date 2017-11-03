package MultiplicationTable;

import java.util.Random;
import java.util.Scanner;

public class MultiplicationMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		GuguTimer timer = new GuguTimer();
		GuguGameManager ggm = new GuguGameManager();
		
		int sum = 0;
		double time = 0;
		System.out.println("===== 구구단 게임 =====");
		
		timer.start();
		
		for(int i = 0; i < 5; i++) {
			ggm.makeRandom();
			
			System.out.print(ggm.getGameMSG());
			int mul = sc.nextInt();
			
			ggm.check(mul);
		}
		
		timer.end();

		System.out.println("걸린시간 : " + timer.getTime());
		System.out.println("정답 count : " + ggm.getCount());
	}

}
