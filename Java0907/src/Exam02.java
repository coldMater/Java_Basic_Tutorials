
public class Exam02 {

	public static void main(String[] args) {
		int[] arr = { 10, 34, 6, 18, 10, 4, 123, 56, 79 };

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}