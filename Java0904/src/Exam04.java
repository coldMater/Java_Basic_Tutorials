import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է����ּ��� : ");
		int num = sc.nextInt();
		
		num = num - (num%100);
		
		System.out.println("���Ȯ�� : " + num);
	}

}