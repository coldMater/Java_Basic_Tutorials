import java.util.Arrays;
import java.util.Random;

public class Exam07_1 {

	public static void main(String[] args) {
		Random rd = new Random();
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(50) + 1;
		}
		
		System.out.println("버블정렬 전 : " + Arrays.toString(arr));
		
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j < arr.length - i; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		System.out.println("버블정렬 후 : " + Arrays.toString(arr));
	}

}
