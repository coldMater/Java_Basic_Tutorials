import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� ��ǰ ������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		double sum;
		
		if(num > 10) {
			sum = (num*10000) - (num*10000*0.1);
		}
		else {
			sum = num * 10000;
		}
		
		System.out.println("������ " + (int)sum + "�� �Դϴ�.");
	}

}