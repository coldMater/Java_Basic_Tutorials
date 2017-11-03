import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int mul = 1;
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		num2 = sc.nextInt();
		
		mul = (int)Math.pow(num1, num2);
		
//		for(int i = 1; i <= num2; i++) {
//			mul = mul * num1;
//		}
		System.out.println(num1 + "의 " + num2 + "승은 " + mul + "입니다.");
	}

}
