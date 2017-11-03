import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("노동시간을 입력하세요 : ");
		int hour = sc.nextInt();
		
		double pay = hour > 8 ? (8 * 5000) + ((hour - 8) * (5000 * 1.5)) : hour * 5000;
		
		System.out.println("총 임금은 " + (int)pay + "원 입니다.");
	}

}