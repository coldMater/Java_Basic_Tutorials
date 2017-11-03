package Bingo;

import java.util.Random;

public class BingoRandomBase {

	String name;
	
	BingoRandomBase(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int[] getNextNum(int[][] bingo) {
		int[] choiceNum = new int[2]; // row,col

		do {
			int[] row = new int[bingo.length];
			
			int maxZeroRow = new Random().nextInt(bingo.length);

			for (int i = 0; i < bingo.length; i++) {
				int zeroRow = 1;
				for (int j = 0; j < bingo[i].length; j++) {
					if (bingo[i][j] == 0) {
						row[i] = zeroRow++;
					}
				}
			}

			for (int i = 0; i < row.length; i++) {
				for (int j = i; j < row.length; j++) {
					if (row[i] <= row[j] && row[j] != 7) {
						maxZeroRow = j;
					}
				}
			}

			choiceNum[0] = maxZeroRow;			
			choiceNum[1] = new Random().nextInt(bingo[0].length);
			
			//System.out.println(choiceNum[0] + ", " + choiceNum[1]);

		} while (bingo[choiceNum[0]][choiceNum[1]] == 0);
		
		if (choiceNum[0] != (bingo.length / 2) || choiceNum[1] != (bingo[0].length / 2)) {
			if (bingo[bingo.length / 2][bingo[0].length / 2] != 0) {
				choiceNum[0] = (bingo.length / 2);
				choiceNum[1] = (bingo[0].length / 2);
			}
		}

		return choiceNum;
	}
}
