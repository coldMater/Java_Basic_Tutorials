package ex170906;

public class star09 {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int k = 5; k > i; k--) {
				System.out.print("*");
			}
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for(int l = 5; l > i; l--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i < 5; i++) {
			for(int m = 0; m <= i; m++) {
				System.out.print("*");
			}
			for(int n = 4; n > i; n--) {
				System.out.print(" ");
			}
			for(int o = 4; o > i; o--) {
				System.out.print(" ");
			}
			for(int p = 0; p <= i; p++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
