import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문을 하시겠습니까?");
		System.out.println("1. 주문 2. 아니오");
		int order = sc.nextInt();
		
		if(order==1) {
			System.out.println("주문을 받았습니다.");
		}
		System.out.println("감사합니다.");
	}

}