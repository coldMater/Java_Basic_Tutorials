import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("두 수 중 큰수는 : " + num1);
		}
		else if(num1 == num2) {
			System.out.println("동일한 값입니다.");
		}
		else {
			System.out.println("두 수 중 큰수는 : " + num2);
		}
	}

}
