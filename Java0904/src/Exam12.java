import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("DB : ");
		int subject1 = sc.nextInt();
		
		System.out.print("���ڰ��� ���� : ");
		int subject2 = sc.nextInt();
		
		System.out.print("�ü�� : ");
		int subject3 = sc.nextInt();
		
		System.out.print("������ ��� : ");
		int subject4 = sc.nextInt();
		
		System.out.print("����Ʈ���� ���� : ");
		int subject5 = sc.nextInt();
		
		if(subject1 < 8 || subject2 < 8 || subject3 < 8 || subject4 < 8 ||subject5 < 8 ) {
			System.out.println("���հ��Դϴ�.");
		}
		else if(subject1 + subject2 + subject3 +  subject4 + subject5 >= 60) {
			System.out.println("�հ��Դϴ�.");
		}
		else {
			System.out.println("���հ��Դϴ�.");
		}
	}

}
