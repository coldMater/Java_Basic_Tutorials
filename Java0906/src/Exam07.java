
public class Exam07 {

	public static void main(String[] args) {
		int num = 123456789;
		int sum = 0;
		
		System.out.print(num);
		
		while (num >= 1) {
			sum = sum + (num%10);
			num = num/10;
		}
		
		System.out.println("�� �� �ڸ����� ���� " + sum +"�Դϴ�.");
	}

}