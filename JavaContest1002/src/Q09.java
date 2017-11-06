import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "번째 수 입력 : ");
			array[i] = sc.nextInt();
		}
		
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i; j < array.length; j++) {
				if(array[i] < array[j]) {
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
		
		System.out.println("정렬 후");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
