import java.util.Arrays;

public class Numbers {

	// 소수인지 아닌지
	public static boolean isPrimeNumber(int i) {
		int sum = getSumOfDivisor(i) - 1;
		if (sum == i)
			return true;
		else
			return false;
	}

	// 완전수인지 아닌지
	public static boolean isPerfectNumber(int i) {
		int sum = getSumOfDivisor(i) - i;
		if (sum == i)
			return true;
		else
			return false;
	}

	// num의 약수들의 합
	public static int getSumOfDivisor(int num) {
		int sum = 0;
		int[] arr = getDivisor(num);

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	// num2 ~ num1 사이의 값들의 약수
	public static int[][] getDivisors(int num2, int num1) {
		int index = num1 - num2 + 1;
		int[][] result = new int[index][];
		int j = 0;
		for (int i = num2; i <= num1; i++) {
			result[j++] = getDivisor(i);
		}
		return result;
	}

	// num1의 약수
	public static int[] getDivisor(int num1) {
		int k = 0;
		int[] result = new int[num1];
		for (int i = 1; i <= num1; i++) {
			if (isDivisor(num1, i)) {
				result[k++] = i;
			}
		}

		// int[] arr = new int[k];
		// //k = 0;
		//
		// for(int i = 0; i < arr.length; i++) {
		// arr[i] = result[i];
		// }
		return Arrays.copyOf(result, k); // 배열 복사 result에 있는 배열을 k만큼 복사
	}

	public static boolean isDivisor(int num1, int num2) {
		if (num1 % num2 == 0)
			return true;
		else
			return false;
	}

}
