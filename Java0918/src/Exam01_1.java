import java.util.Random;

public class Exam01_1 {

	public static void main(String[] args) {
		System.out.println(throwDice());

	}

	private static int throwDice() {
		Random rd = new Random();
		
		int dice1 = rd.nextInt(6)+1;
		int dice2 = rd.nextInt(6)+1;
		int total = dice1 + dice2;
		
		System.out.println(dice1 + " " + dice2); 
		
		if(dice1==dice2) {
			return total + throwDice();
		} else {
			return total;
		}
	}

}
