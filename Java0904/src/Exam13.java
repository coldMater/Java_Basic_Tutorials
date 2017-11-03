import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사려는 상품 개수를 입력하세요 : ");
		int num = sc.nextInt();
		
		double sum;
		
		if(num > 10) {
			sum = (num*10000) - (num*10000*0.1);
		}
		else {
			sum = num * 10000;
		}
		
		System.out.println("가격은 " + (int)sum + "원 입니다.");
	}

}