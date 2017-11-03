import java.util.Random;
import java.util.Scanner;

public class Answer03 {
	
	public static void main(String[] args) {
		Random rd = new Random();
		
		int num = rd.nextInt(10)+11;
		
		if(num % 2 == 0) {
			System.out.println("Â¦¼ö");
		} else {
			System.out.println("È¦¼ö");
		}
	}

}
