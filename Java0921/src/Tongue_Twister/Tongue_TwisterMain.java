package Tongue_Twister;

import java.util.Scanner;

public class Tongue_TwisterMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		TongueTimer timer = new TongueTimer();
		TongueManager tm = new TongueManager(5);
		
		int sum = 0;
		double time = 0;
		System.out.println("===== 잰말 =====");
		
		for(int i = 0; i < tm.count; i++) {
			System.out.println((i + 1) + " round 시작하려면 enter를 입력하세요.");
			String enter = sc.nextLine();
			
					
			timer.start();
			
			System.out.println(tm.getGameMSG());
			String tongue = sc.nextLine();
			
			timer.end();
			
			if(tm.check(tongue)) {
				System.out.println("성공");
				System.out.println(timer.getTime() + "초");
			} else {
				System.out.println("실패");
			}
			System.out.println();
		}
		
		
	}

}
