
public class Exam09 {

	public static void main(String[] args) {
		
		for (int num = 5; num <= 10; num++) {
			System.out.print(num + "ÀÇ ¾à¼ö : ");
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}
	}

}