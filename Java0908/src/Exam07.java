import java.util.Arrays;

public class Exam07 {

	public static void main(String[] args) {
		int[] arr = { 153, 8, 120, 1 };

		BubbleSort(arr);
	}

	public static void BubbleSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("result : " + Arrays.toString(arr));
	}

}
