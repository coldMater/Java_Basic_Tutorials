import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Çà °³¼ö : ");
		int input = sc.nextInt();
		
		for(int i = input; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
