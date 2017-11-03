import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int p_wegiht = 0;
		int w_wegiht = 0;
		int week = 0;
		int w_week = 0;

		System.out.print("현재 몸무게 : ");
		p_wegiht = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		w_wegiht = sc.nextInt();
		System.out.print("목표 기간(주)");
		w_week = sc.nextInt();

		while (true) {
			week++;
			System.out.print(week + "주차 감량한 몸무게 : ");
			int wegiht = sc.nextInt();
			p_wegiht = p_wegiht - wegiht;
			if (p_wegiht <= w_wegiht) {
				System.out.println(p_wegiht + "kg 달성! 다이어트 성공!");
				break;
			} else if (week == w_week && p_wegiht > w_wegiht) {
				System.out.println(p_wegiht + "kg으로 다이어트 실패!");
				break;
			}
		}
	}

}
