import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է����ּ��� : ");
		int num = sc.nextInt();
		boolean check = num>2 ? true : false ;
				
		System.out.println(check);
		
		System.out.println(num%2==0?"2�� ����Դϴ�.":"2�� ����� �ƴմϴ�.");
	}

}