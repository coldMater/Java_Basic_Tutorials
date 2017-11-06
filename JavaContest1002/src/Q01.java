import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int input = sc.nextInt();
		
		for (int i = 0; i < input; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			sc.close();
		}
	}

}
