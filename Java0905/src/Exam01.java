import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ʸ� �Է����ּ��� : ");
		int sec = sc.nextInt();
		
		System.out.println(sec/60 + "�� " + sec%60 + "��");
	}

}