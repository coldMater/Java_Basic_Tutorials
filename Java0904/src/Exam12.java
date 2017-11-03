import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("DB : ");
		int subject1 = sc.nextInt();
		
		System.out.print("전자계산기 구조 : ");
		int subject2 = sc.nextInt();
		
		System.out.print("운영체제 : ");
		int subject3 = sc.nextInt();
		
		System.out.print("데이터 통신 : ");
		int subject4 = sc.nextInt();
		
		System.out.print("소프트웨어 공학 : ");
		int subject5 = sc.nextInt();
		
		if(subject1 < 8 || subject2 < 8 || subject3 < 8 || subject4 < 8 ||subject5 < 8 ) {
			System.out.println("불합격입니다.");
		}
		else if(subject1 + subject2 + subject3 +  subject4 + subject5 >= 60) {
			System.out.println("합격입니다.");
		}
		else {
			System.out.println("불합격입니다.");
		}
	}

}
