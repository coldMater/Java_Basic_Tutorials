import java.util.Arrays;
import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Numbers numbers = new Numbers();
		System.out.println("=== 두개의 정수 입력 ===");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		System.out.println("\n=== isDivisor ===");
		boolean result = numbers.isDivisor(num1, num2); // num2가 num1의 약수인지 아닌지
		System.out.println(result);

		System.out.println("\n=== getDivisor ===");
		int[] arr = numbers.getDivisor(num1); // num1의 약수
		System.out.println(Arrays.toString(arr));

		System.out.println("\n=== getDivisors ===");
		int[][] arr2 = numbers.getDivisors(num2, num1); // num2 ~ num1 사이의 값들의 약수
		for (int i = 0; i <= num1 - num2; i++)
			System.out.println(Arrays.toString(arr2[i]) + " ");

		System.out.println("\n=== getSumOfDivisor ===");
		int sum = numbers.getSumOfDivisor(num1); // num1의 약수들의 합
		System.out.println(sum);

		System.out.println("\n=== isPerfectNumber ===");
		boolean isPerfectNum = numbers.isPerfectNumber(6); // 완전수인지 아닌지
		System.out.println(isPerfectNum);

		System.out.println("\n=== isPrimeNumber ===");
		boolean isPrimeNum = numbers.isPrimeNumber(3); // 소수인지 아닌지
		System.out.println(isPrimeNum);
	}

}
