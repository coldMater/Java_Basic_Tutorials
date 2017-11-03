package MultiplicationTable;

import java.util.Random;

public class GuguGameManager {
	private Random rd = new Random();
	
	private int num1;
	private int num2;
	private int count;
	
	public void makeRandom() {
		num1 = rd.nextInt(9)+1;
		num2 = rd.nextInt(9)+1;
	}

	public String getGameMSG() {
		return num1 + " * " + num2 + " = ";
	}

	public void check(int mul) {
		if((num1 * num2) == mul) {
			count++;
		}
	}

	public int getCount() {
		return count;
	}

}
