import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		int input = 8;
		
		int sum = 0;
		int num = 1;
		int array = 0;
		
		for (int i = 0; i < input; i++) {
			System.out.print(num + " ");
			array = sum + num;
			sum = num;
			num = array + sum;
		}
	}

}
