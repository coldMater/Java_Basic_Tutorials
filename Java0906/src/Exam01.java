
public class Exam01 {

	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {
			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				System.out.print("짝\t\t");
			} else if (i % 5 == 0) {
				if (i % 10 == 0)
					System.out.println("야호\t\t");
				else
					System.out.print("만세\t\t");
			} else
				System.out.print(i + "\t\t");
		}
		
/* switch문 이용
		for (int i = 1; i <= 50; i++) {
			switch (i % 10) {
			case 3:
			case 6:
			case 9:
				System.out.print("짝\t\t");
				break;
			case 5:
				System.out.print("만세\t\t");
				break;
			case 0:
				System.out.println("야호\t\t");
				break;
			default:
				System.out.print(i + "\t\t");
				break;
			}
		}
*/
	}

}