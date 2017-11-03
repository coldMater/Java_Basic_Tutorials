package Question06;

import java.util.Arrays;

public class Question6 {

	public static void main(String[] args) {
		String[] countryNames = { "한국", "미국", "일본", "중국", "캐나다" };
		int[][] medals = { { 7, 8, 2 }, { 9, 11, 13 }, { 7, 5, 7 }, { 8, 9, 18 }, { 9, 2, 10 } };
		int[] medalScore = new int[medals.length];
		String[] medalRank = new String[countryNames.length];
		int[] a = new int[medalScore.length];
		
		for(int i = 0; i < medals.length; i++) {
			medalScore[i] = (medals[i][0] * 4) + (medals[i][1] * 2) + (medals[i][2] * 1);
			a[i] = medalScore[i];
		}
		
		for (int i = 0; i < medalScore.length - 1; i++) {
			for (int j = i + 1; j < medalScore.length; j++) {
				if (medalScore[i] < medalScore[j]) {
					int tmp = medalScore[i];
					medalScore[i] = medalScore[j];
					medalScore[j] = tmp;
				}
			}
		}
		
		for(int i = 0; i < medalRank.length; i++) {
			for (int j = 0; j < medalScore.length; j++) {
				if (medalScore[i] == a[j]) {
					medalRank[i] = countryNames[j];
				}
			}
		}
		
		for(int i = 0; i < medalRank.length; i++) {
			System.out.println((i + 1) + "위 : " + medalRank[i]);
		}
	}

}
