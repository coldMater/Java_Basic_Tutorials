import java.util.Random;
import java.util.Scanner;

public class Eaxm02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] sb = new int[2];

		System.out.println("=== Game Start ===");

		int[] randomArray = createRandomNumber(3);
		//arrayToString(randomArray);

		int[] inputArray = new int[randomArray.length];

		while (sb[0] != 3) {

			for (int i = 0; i < inputArray.length; i++) {
				System.out.print((i + 1) + "번째 숫자 입력 >> ");
				inputArray[i] = sc.nextInt();
			}

			sb = strikeBallCounting(randomArray, inputArray);
			
			System.out.println("Strike : " + sb[0] + "\t\t ball : " + sb[1]);
			
//			if(sb[0] == 3) {
//				System.out.println("게임종료");
//				break;
//			}
		}
		System.out.println("게임종료");
	}

	private static int[] strikeBallCounting(int[] array1, int[] array2) {
		int[] sb = new int[2];

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					if (i == j)
						sb[0] += 1;
					else
						sb[1] += 1;
				}
			}
		}
		return sb;
	}

	private static int[] createRandomNumber(int num) {
		Random rd = new Random();
		int[] array = new int[num];
		do {
			for (int i = 0; i < array.length; i++) {
				array[i] = rd.nextInt(9) + 1;
			}
		} while (isDuplicate(array));
		return array;
	}

	private static boolean isDuplicate(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j])
					return true;
			}
		}
		return false;
	}

	private static void arrayToString(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
