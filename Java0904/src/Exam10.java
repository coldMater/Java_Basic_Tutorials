import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int age = sc.nextInt();
		
		if(age >= 20) {
			System.out.println("�����Դϴ�.");
		}
		else {
			System.out.println("������ �ƴմϴ�.");
		}
	}

}