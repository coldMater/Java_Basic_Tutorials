import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ֹ��� �Ͻðڽ��ϱ�?");
		System.out.println("1. �ֹ� 2. �ƴϿ�");
		int order = sc.nextInt();
		
		if(order==1) {
			System.out.println("�ֹ��� �޾ҽ��ϴ�.");
		}
		System.out.println("�����մϴ�.");
	}

}