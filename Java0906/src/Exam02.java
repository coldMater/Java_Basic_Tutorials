import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int p_wegiht = 0;
		int w_weghit = 0;
		int week = 0;
		
		System.out.print("���� ������ : ");
		p_wegiht = sc.nextInt();
		System.out.print("��ǥ ������ : ");
		w_weghit = sc.nextInt();
		
		while (p_wegiht>w_weghit) {
			week++;
			System.out.print(week + "���� ������ ������ : ");
			int wegiht = sc.nextInt();
			p_wegiht = p_wegiht - wegiht;
		}
		System.out.println(p_wegiht + "kg �޼�! ���̾�Ʈ ����!");
	}

}
