import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n ют╥б : ");
		int input = sc.nextInt();
		
		int[][] array = new int[input][input];
		int count = 1;
		
		for(int i = 0; i < input; i++) {
			if(i % 2 != 0) {
				for(int j = input - 1; j >= 0; j--) {
					array[i][j] = count++;
				}
			} else {
				for (int j = 0; j < array.length; j++) {
					array[i][j] = count++;
				}
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int k = 0; k < array.length; k++) {
				System.out.print(array[i][k] + "\t");
			}
			System.out.println();
		}
	}

}
