
public class Exam04 {

	public static void main(String[] args) {
		int[] arr = {10,5,56,15};
		
		String result = arrayToString(arr);
		
		// 10 5 56 15
		System.out.println(result);
	}

	private static String arrayToString(int[] arr) {
		String array = "";
		for (int i = 0; i < arr.length; i++) {
			array += arr[i] + " ";
		}
		return array;
	}

}