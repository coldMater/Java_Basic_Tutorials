package Tongue_Twister;

import java.util.Scanner;

public class Tongue_TwisterMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		TongueTimer timer = new TongueTimer();
		TongueManager tm = new TongueManager(5);
		
		int sum = 0;
		double time = 0;
		System.out.println("===== �鸻 =====");
		
		for(int i = 0; i < tm.count; i++) {
			System.out.println((i + 1) + " round �����Ϸ��� enter�� �Է��ϼ���.");
			String enter = sc.nextLine();
			
					
			timer.start();
			
			System.out.println(tm.getGameMSG());
			String tongue = sc.nextLine();
			
			timer.end();
			
			if(tm.check(tongue)) {
				System.out.println("����");
				System.out.println(timer.getTime() + "��");
			} else {
				System.out.println("����");
			}
			System.out.println();
		}
		
		
	}

}
