package ex170906;

public class star05 {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int k = 5; k > i; k--) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for(int l = 0; l < i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

