import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int p_wegiht = 0;
		int w_wegiht = 0;
		int sub_wegiht = 0;
		int week = 1;
		
		System.out.print("���� ������ : ");
		p_wegiht = sc.nextInt();
		System.out.print("��ǥ ������ : ");
		w_wegiht = sc.nextInt();
		
		do {
			System.out.print(week+"���� ���� ������ : ");
			sub_wegiht = sc.nextInt();
			p_wegiht = p_wegiht - sub_wegiht;
			week++;
		}while(p_wegiht > w_wegiht);
		
		System.out.println(p_wegiht + "kg �޼�! �����մϴ�!");
	}

}