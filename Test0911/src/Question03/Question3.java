package Question03;

import java.util.Random;

public class Question3 {

	public static void main(String[] args) {
		Random rd = new Random();
		int randomNum = 0;
		
		randomNum = rd.nextInt(10) + 11;
		
		System.out.println("난수 : " + randomNum);
		
		if(randomNum % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}

}
