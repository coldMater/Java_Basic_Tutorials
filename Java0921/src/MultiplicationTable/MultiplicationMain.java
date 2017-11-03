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
		System.out.println("===== ������ ���� =====");
		
		timer.start();
		
		for(int i = 0; i < 5; i++) {
			ggm.makeRandom();
			
			System.out.print(ggm.getGameMSG());
			int mul = sc.nextInt();
			
			ggm.check(mul);
		}
		
		timer.end();

		System.out.println("�ɸ��ð� : " + timer.getTime());
		System.out.println("���� count : " + ggm.getCount());
	}

}
