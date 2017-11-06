import java.util.Random;

public class Q06 {
	public static void main(String[] args) {
		Random rd = new Random();
		
		int[] array = new int[6];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(45)+1;
		}
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(array[i] == array[j]) {
					array[i] = rd.nextInt(45)+1;
					array[j] = rd.nextInt(45)+1;
				}
			}
		}
		
		for (int k = 0; k < array.length - 1; k++) {
			if(array[k] == array[k]) {
				array[k] = rd.nextInt(45)+1;
			}
			System.out.println("행운의 숫자 : " + array[k]);
		}
		System.out.println("행운의 숫자  : " + array[5]);
	}
}
