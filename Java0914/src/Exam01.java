import java.util.Arrays;
import java.util.Random;

public class Exam01 {

	public static void main(String[] args) {
		int[] array = {1,3,4,8,7,9,10};
		arrayToString(array);
		
		boolean check = isDuplicate(array);
		System.out.println(check);
		
		int[] array1 = createRandomNumber(3);
		arrayToString(array1);
	}
	
	private static int[] createRandomNumber(int num) {
		Random rd = new Random();
		int[] array = new int[num];
		do {
			for(int i = 0; i < array.length; i++) {
				array[i] = rd.nextInt(5)+1;
			}
		} while(isDuplicate(array));
		return array;
	}

	private static boolean isDuplicate(int[] array) {
		for(int i = 0; i < array.length-1; i++) {
			for(int j = i + 1; j < array.length; j++) {
				if(array[i] == array[j]) 
					return true;
			}
		}
		return false;
	}

	private static void arrayToString(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
