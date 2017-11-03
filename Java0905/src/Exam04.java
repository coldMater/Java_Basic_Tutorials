import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문을 하시겠습니까?");
		System.out.println("1. 주문 2. 아니오");
		int order = sc.nextInt();
		
		if(order == 1) {
			System.out.println("1. 김밥 2. 떡볶이 3.순대");
			int menu = sc.nextInt();
			if(menu == 1) {
				System.out.println("김밥 주문 완료");
			}
			else if(menu == 2) {
				System.out.println("떡볶이 주문 완료");
			}
			else if(menu == 3) {
				System.out.println("순대 주문 완료");
			}
		}
		else {
			System.out.println("너무하시는군요.");
		}
		System.out.println("감사합니다.");
	}

}
