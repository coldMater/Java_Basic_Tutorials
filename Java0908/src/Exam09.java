import java.util.Arrays;
import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 101, 89, 34, 78, 10, 103, 2, 4, 54, 72 };

		Arrays.sort(arr);
		System.out.println("�迭 : " + Arrays.toString(arr));

		int lowIndex = 0;
		int highIndex = arr.length - 1;
		
		System.out.print("ã���� �ϴ� ���� �Է��ϼ��� : ");
		int want = sc.nextInt();
		
		int wantIndex = -1;

		while (lowIndex <= highIndex) {
			int index = (lowIndex + highIndex) / 2;
			if (want > arr[index]) {
				lowIndex = index + 1;
			} else if (want < arr[index]) {
				highIndex = index - 1;
			} else if (want == arr[index]) {
				wantIndex = index;
				break;
			}
		}

		if (lowIndex > highIndex) {
			System.out.println("ã���� �ϴ� ���� �����ϴ�.");
		} else {
			System.out.println(want + "�� " + wantIndex + "��° �ε����� �ֽ��ϴ�.");
		}
	}

}
