package ex170906;

public class star06 {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for(int j = 5; j > i; j--) {
				System.out.print("*");
			}
			for(int l = 4; l > i; l--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

