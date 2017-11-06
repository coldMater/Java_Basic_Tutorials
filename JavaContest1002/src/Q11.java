import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력받은 값 : ");
		String input = sc.next();
		
		char num = input.charAt(0);
		
		for(int i = 0; i <= num - 'a'; i++) {
			for (int j = i; j < num - 'a'; j++) {
					System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(((char)('a' + j)));
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(((char)('a' - j + i)));
			}
			System.out.println();
		}
		
		for(int i = 0; i < num - 'a'; i++) {
			System.out.print(" ");
			for (int j = 0; j < i; j++) {
					System.out.print(" ");
			}
			for (int j = i; j < num - 'a'; j++) {
				System.out.print(((char)('a'+j - i)));
			}
			for (int j = i; j < num - 'a'; j++) {
				System.out.print(((char)(num - j - 1)));
			}
			System.out.println();
		}
	}

}
