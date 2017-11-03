import java.util.Arrays;
import java.util.Random;

public class Exam08 {

	public static void main(String[] args) {
		Random rd = new Random();
		int[] arr = new int[10];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(50) + 1;
		}
		System.out.println("선택정렬 전 : " + Arrays.toString(arr));
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println("선택정렬 후 : " + Arrays.toString(arr));
	}

}
