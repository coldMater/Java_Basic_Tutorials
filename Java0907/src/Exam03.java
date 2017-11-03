import java.util.Random;

public class Exam03 {

	public static void main(String[] args) {
		Random rd = new Random();
		
		int[] arr = new int[10];
		int max = 0;

		for(int i=0; i<arr.length; i++) {
			arr[i] = rd.nextInt(30)+1;
			System.out.print(arr[i] + "   ");
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		for (int i : arr) {
			if(max < i) 
				max = i;
		}
		
		System.out.println("\n" + max);
	}

}
