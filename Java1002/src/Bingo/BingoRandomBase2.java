package Bingo;

import java.util.Random;

public class BingoRandomBase2 {

	String name;

	BingoRandomBase2(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int[] getNextNum(int[][] bingo) {
		int[] choiceNum = new int[2]; // row,col

		do {
			int maxZeroRow = new Random().nextInt(bingo.length);

			choiceNum[0] = maxZeroRow;			
			choiceNum[1] = new Random().nextInt(bingo[0].length);

		} while (bingo[choiceNum[0]][choiceNum[1]] == 0);
		
		return choiceNum;
	}
}
