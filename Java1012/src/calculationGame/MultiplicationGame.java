package calculationGame;

import java.util.Random;

public class MultiplicationGame implements IGame {
	Random r;
	int num1;
	int num2;

	public void makeRandomNumber() {
		r = new Random();
		num1 = r.nextInt(9) + 1;
		num2 = r.nextInt(9) + 1;
	}

	public String makeQuizMsg() {
		this.makeRandomNumber();
		String a = num1 + " * " + num2 + " = ";
		return a;
	}

	public boolean checkAnswer(int answer) {
		if (answer == num1 * num2) {
			return true;
		} else {
			return false;
		}
	}

}
