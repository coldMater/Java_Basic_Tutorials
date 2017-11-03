import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("초를 입력해주세요 : ");
		int sec = sc.nextInt();
		
		System.out.println(sec/60 + "분 " + sec%60 + "초");
	}

}