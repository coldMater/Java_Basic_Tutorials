import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� ������ �Է����ּ��� : ");
		int orange = sc.nextInt();
		System.out.print("�ѹڽ��ȿ� �� �������� ������ �Է����ּ��� : ");
		int box = sc.nextInt();

		int value = 0;
		
		value = orange % box == 0 ? orange / box : (orange / box) + 1;
		
		System.out.println("�ʿ��� �ڽ��� ������ " + value + "�� �Դϴ�.");		
	}
	
}