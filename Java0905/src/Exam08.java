import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int p_wegiht = 0;
		int w_wegiht = 0;
		int sub_wegiht = 0;
		int week = 1;
		
		System.out.print("현재 몸무게 : ");
		p_wegiht = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		w_wegiht = sc.nextInt();
		
		do {
			System.out.print(week+"주차 감량 몸무게 : ");
			sub_wegiht = sc.nextInt();
			p_wegiht = p_wegiht - sub_wegiht;
			week++;
		}while(p_wegiht > w_wegiht);
		
		System.out.println(p_wegiht + "kg 달성! 축하합니다!");
	}

}