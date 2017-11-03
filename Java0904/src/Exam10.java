import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		if(age >= 20) {
			System.out.println("성인입니다.");
		}
		else {
			System.out.println("성인이 아닙니다.");
		}
	}

}