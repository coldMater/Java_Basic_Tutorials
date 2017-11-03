
public class Exam05 {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			nullStarTriangle(i);
			reverseStarTriangle(i);
			System.out.println();
		}
		for(int i = 0; i < 5; i++) {
			for(int k = 5; k > i; k--) {
				System.out.print("  ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void reverseStarTriangle(int i) {
		for(int j = i; j < 5; j++) {
			System.out.print("*");
		}
	}

	public static void nullStarTriangle(int i) {
		for(int k = 0; k <= i; k++) {
			System.out.print("  ");
		}
	}

}