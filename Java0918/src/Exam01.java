import java.util.Random;

public class Exam01 {

	public static void main(String[] args) {
		System.out.println(throwDices());
	}

	private static int throwDices() {
		Random rd = new Random();
		int sum = 0;
		int dice1 = 0;
		int dice2 = 0;
		
		while(true) {
			dice1 = rd.nextInt(6)+1;
			dice2 = rd.nextInt(6)+1;
			System.out.println(dice1 + " " + dice2);
			sum = sum + dice1 + dice2;
			
			if(dice1 != dice2 ) {
				break;
			}
		}
		
		return sum;
	}

}
