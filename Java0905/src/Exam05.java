import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("user : ");
		String data = sc.next();
		
		switch (data) {
		case "�ȳ��ϼ���.":
			System.out.println("pc : ��, �ȳ��ϼ���!");
			break;
		case "�ݰ�����.":
			System.out.println("pc : ��, �ݰ�����!");
			break;
		case "�����ϼ���.":
			System.out.println("pc : ��, �����ϼ���!");
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			break;
		}
	}

}