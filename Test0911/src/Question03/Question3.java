package Question03;

import java.util.Random;

public class Question3 {

	public static void main(String[] args) {
		Random rd = new Random();
		int randomNum = 0;
		
		randomNum = rd.nextInt(10) + 11;
		
		System.out.println("���� : " + randomNum);
		
		if(randomNum % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}
	}

}
