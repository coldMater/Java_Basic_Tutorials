import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int p_wegiht = 0;
		int w_weghit = 0;
		int week = 0;
		
		System.out.print("현재 몸무게 : ");
		p_wegiht = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		w_weghit = sc.nextInt();
		
		while (p_wegiht>w_weghit) {
			week++;
			System.out.print(week + "주차 감량한 몸무게 : ");
			int wegiht = sc.nextInt();
			p_wegiht = p_wegiht - wegiht;
		}
		System.out.println(p_wegiht + "kg 달성! 다이어트 성공!");
	}

}
